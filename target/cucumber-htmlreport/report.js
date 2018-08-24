$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SmokeTest.feature");
formatter.feature({
  "line": 2,
  "name": "---------SMOKE TESTS SERVICES ----------",
  "description": "",
  "id": "---------smoke-tests-services-----------",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Feature"
    }
  ]
});
formatter.before({
  "duration": 4670429,
  "status": "passed"
});
formatter.before({
  "duration": 48926939437,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Visit the page",
  "description": "",
  "id": "---------smoke-tests-services-----------;visit-the-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Feature"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user as admin clicks on Reconstruct name strings",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Name Strings are generated",
  "keyword": "Then "
});
formatter.match({
  "location": "SmokeTest.user_is_logged_in()"
});
formatter.result({
  "duration": 6383381201,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.user_as_admin_clicks_on_Reconstruct_name_strings()"
});
formatter.result({
  "duration": 6339960409,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.name_Strings_are_generated()"
});
formatter.result({
  "duration": 15181812908,
  "status": "passed"
});
formatter.after({
  "duration": 53550,
  "status": "passed"
});
formatter.after({
  "duration": 640900028,
  "status": "passed"
});
});