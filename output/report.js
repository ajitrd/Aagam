$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/sony/cucumber/integration/poc/PhpTravels.feature");
formatter.feature({
  "line": 1,
  "name": "phptravels.net functional tests",
  "description": "",
  "id": "phptravels.net-functional-tests",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User Registration in PhpTravels.net",
  "description": "",
  "id": "phptravels.net-functional-tests;user-registration-in-phptravels.net",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Browser is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Open Registration page when user enters URL as \"http://www.phptravels.net/register\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters firstname as \"ajit\" and lastname as \"dodwad\" and mobileno as \"1234567891\" and email as \"ajit01@gmail.com\" and password as \"test123\" and confirmpassword as \"test123\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click submit",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "login should be successful after registration",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click logout",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user should be logged out",
  "keyword": "Then "
});
formatter.match({
  "location": "PhpTravelsPage.givenTest()"
});
formatter.result({
  "duration": 15100217049,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.phptravels.net/register",
      "offset": 48
    }
  ],
  "location": "PhpTravelsPage.register(String)"
});
formatter.result({
  "duration": 11085145424,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ajit",
      "offset": 26
    },
    {
      "val": "dodwad",
      "offset": 49
    },
    {
      "val": "1234567891",
      "offset": 74
    },
    {
      "val": "ajit01@gmail.com",
      "offset": 100
    },
    {
      "val": "test123",
      "offset": 135
    },
    {
      "val": "test123",
      "offset": 168
    }
  ],
  "location": "PhpTravelsPage.PhpTravelUserRegistration(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 1958217126,
  "status": "passed"
});
formatter.match({
  "location": "PhpTravelsPage.submit()"
});
formatter.result({
  "duration": 8233796497,
  "status": "passed"
});
formatter.match({
  "location": "PhpTravelsPage.successlogin()"
});
formatter.result({
  "duration": 614613965,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cBookings[1]\u003e but was:\u003cBookings[]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.sony.cucumber.integration.poc.PhpTravelsPage.successlogin(PhpTravelsPage.java:203)\r\n\tat ✽.Then login should be successful after registration(com/sony/cucumber/integration/poc/PhpTravels.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "PhpTravelsPage.logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PhpTravelsPage.successlogout()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 15,
  "name": "Login to PhpTravels.net",
  "description": "",
  "id": "phptravels.net-functional-tests;login-to-phptravels.net",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "Login page is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "user enters username as \"ajit01@gmail.com\" and password as \"test123\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "click login",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "login should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "PhpTravelsPage.Login()"
});
formatter.result({
  "duration": 1102424579,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ajit01@gmail.com",
      "offset": 25
    },
    {
      "val": "test123",
      "offset": 60
    }
  ],
  "location": "PhpTravelsPage.validlogin(String,String)"
});
formatter.result({
  "duration": 40201859,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@name\u003d\u0027username\u0027]\"}\nCommand duration or timeout: 39 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1\u0027, time: \u00272016-06-30 17:32:46\u0027\nSystem info: host: \u0027SC-3DX8152\u0027, ip: \u0027172.18.117.165\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_72\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d45.0.2, platform\u003dWINDOWS, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: c1475ed4-6f2e-4ba1-96ec-d8c9d9c478d3\n*** Element info: {Using\u003dxpath, value\u003d//input[@name\u003d\u0027username\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat com.sony.cucumber.integration.poc.PhpTravelsPage.validlogin(PhpTravelsPage.java:266)\r\n\tat ✽.When user enters username as \"ajit01@gmail.com\" and password as \"test123\"(com/sony/cucumber/integration/poc/PhpTravels.feature:18)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@name\u003d\u0027username\u0027]\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1\u0027, time: \u00272016-06-30 17:32:46\u0027\nSystem info: host: \u0027SC-3DX8152\u0027, ip: \u0027172.18.117.165\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_72\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///C:/TEMP/anonymous5758444904257588889webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10770)\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElement(file:///C:/TEMP/anonymous5758444904257588889webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10779)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/h(file:///C:/TEMP/anonymous5758444904257588889webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12661)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_(file:///C:/TEMP/anonymous5758444904257588889webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12666)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.execute/\u003c(file:///C:/TEMP/anonymous5758444904257588889webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12608)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "PhpTravelsPage.logina()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PhpTravelsPage.loginb()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 22,
  "name": "Hotel booking",
  "description": "",
  "id": "phptravels.net-functional-tests;hotel-booking",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "Hotels page is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "user enters location as \"singapore\" and select hotel and click search button",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "hotel is listed on right side",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "click on Book Now button",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "personal information page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user clicks on Confirm this booking button",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "should redirect to Invoice page",
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
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 32,
  "name": "Tour booking",
  "description": "",
  "id": "phptravels.net-functional-tests;tour-booking",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 34,
  "name": "Tours page is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "user enters location as \"Dubai\" and select place and click search button",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "place name is displayed on right side",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "click on tour BookNow button",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "personal tour information page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "user clicks on tour Confirm this booking button",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "should redirect to tour Invoice page",
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
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 42,
  "name": "Car booking",
  "description": "",
  "id": "phptravels.net-functional-tests;car-booking",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 44,
  "name": "Car booking page is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "user select pickup point and click search button",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "cars are displayed on right side",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "click on Details button",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "click on car Booknow button",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "personal car information page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "user clicks on car Confirm this booking button",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "should redirect to car Invoice page",
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
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});