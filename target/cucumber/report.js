$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Application Login",
  "description": "",
  "id": "application-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Home page Default login",
  "description": "",
  "id": "application-login;home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Paradyme Management page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click our culture link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Culture page should display",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.main_page()"
});
formatter.result({
  "duration": 9803810500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.culture_link()"
});
formatter.result({
  "duration": 2527259600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.culture_page()"
});
formatter.result({
  "duration": 27156300,
  "status": "passed"
});
});