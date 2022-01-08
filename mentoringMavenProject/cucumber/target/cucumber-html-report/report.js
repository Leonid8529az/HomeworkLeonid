$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("contactform.feature");
formatter.feature({
  "line": 1,
  "name": "ContactFormWork",
  "description": "",
  "id": "contactformwork",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Testing sending emails from my contact form",
  "description": "",
  "id": "contactformwork;testing-sending-emails-from-my-contact-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I go to http://pocketsdeveloper.com/contacts/",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I parse my name",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I parse my email",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I parse the subject",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click send Button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I get the message \"Your message was sent successfully\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});