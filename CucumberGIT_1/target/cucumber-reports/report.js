$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/login.feature");
formatter.feature({
  "name": "Test login Functionality of HirokuApp",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login With valid Credential",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTest.user_is_on_home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enters Username and Password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginTest.user_Enters_Username_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.user_Logged_in_successfully()"
});
formatter.result({
  "status": "passed"
});
});