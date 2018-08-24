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
  "duration": 2574849,
  "status": "passed"
});
formatter.before({
  "duration": 18117953525,
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
  "duration": 4044051787,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.user_as_admin_clicks_on_Reconstruct_name_strings()"
});
formatter.result({
  "duration": 4268429583,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.name_Strings_are_generated()"
});
formatter.result({
  "duration": 15076252573,
  "status": "passed"
});
formatter.after({
  "duration": 99959,
  "status": "passed"
});
formatter.after({
  "duration": 580296915,
  "status": "passed"
});
});