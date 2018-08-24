package com.cucmber.BNTiServices;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import cucumber.deps.com.thoughtworks.xstream.core.util.Base64Encoder;

public class EncryptTest {


	public static WebDriver driver;
	
	public static String key; 

	public static final String DEFAULT_ENCODING = "UTF-8";
	static Base64Encoder enc = new Base64Encoder();
	static Base64Encoder dec = new Base64Encoder();

	public static String base64encode(String text) {
		try {
			
			return enc.encode(text.getBytes(DEFAULT_ENCODING));
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}// base64encode

	public static String base64decode(String text) {
		try {
			
			return new String(dec.decode(text), DEFAULT_ENCODING);
		} catch (IOException e) {
			return null;
		}
	}// base64decode

	public static String xorMessage(String message, String key) {
		try {
			if (message == null || key == null)
				return null;

			char[] keys = key.toCharArray();
			char[] mesg = message.toCharArray();

			int ml = mesg.length;
			int kl = keys.length;
			char[] newmsg = new char[ml];

			for (int i = 0; i < ml; i++) {
				newmsg[i] = (char) (mesg[i] ^ keys[i % kl]);
			} // for i

			return new String(newmsg);
		} catch (Exception e) {
			return null;
		}
	}// xorMessage


	
		EncryptTest()throws IOException {
		
		Properties p= new Properties();
		InputStream input = null;
		
		File f = new File(System.getProperty("user.dir")+ File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "config.properties");
		input = new FileInputStream(f);
		
		p.load(input);
		String URL = p.getProperty("URL");
		String Browser =p.getProperty("BROWSER");
		String name=p.getProperty("UID");
		String ID=p.getProperty("PWD");
		key=p.getProperty("KEY");
		
		
		//DECRYPTING THE THINGS
		String usernames = SETTYPE(name);
		String passwords = SETTYPE(ID);

		
		/*********************************/
		BeforeAfter.username = usernames;
		BeforeAfter.password=passwords;
		BeforeAfter.URL=URL;
		
		BeforeAfter.drivers=this.driver;
		
	}
		public static String SETTYPE(String s) {
			String t;
			t = xorMessage(base64decode(s), key);
			return t;
		}

}
