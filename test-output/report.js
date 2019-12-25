$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login to orangeHRM with valid credemtails",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "User launches browser",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_launches_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User gives url \"https://opensource-demo.orangehrmlive.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_gives_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username as \"Admin\" and password as \"admin123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
});