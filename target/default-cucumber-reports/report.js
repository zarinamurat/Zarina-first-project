$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\HomePage.feature");
formatter.feature({
  "name": "HomePage",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Zarina"
    }
  ]
});
formatter.background({
  "name": "Launching the application",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Theu user should be able to launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStepDefs.theu_user_should_be_able_to_launch_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The homepage should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefs.the_homepage_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Zarina"
    }
  ]
});
formatter.step({
  "name": "The user enters username and password",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStepDefs.the_user_enters_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks the login button",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStepDefs.clicks_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should be able to see the Welcome page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefs.the_user_should_be_able_to_see_the_Welcome_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks on Order button",
  "keyword": "When "
});
formatter.match({
  "location": "OrderPageStepDefs.the_user_clicks_on_Order_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should be able to see the Order page",
  "keyword": "And "
});
formatter.match({
  "location": "OrderPageStepDefs.the_user_should_ve_able_to_see_the_Order_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user sees the Product dropdown menu",
  "keyword": "When "
});
formatter.match({
  "location": "OrderPageStepDefs.the_user_click_on_dropdown_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should be able to make a selection from Dropdown menu",
  "keyword": "And "
});
formatter.match({
  "location": "OrderPageStepDefs.the_user_should_be_able_to_make_a_selection()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click on ViewAllOrders Link",
  "keyword": "When "
});
formatter.match({
  "location": "ViewAllOrdersStepDefs.the_user_click_on_ViewAllOrders_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should be able to retrieve the value from the webtable",
  "keyword": "Then "
});
formatter.match({
  "location": "ViewAllOrdersStepDefs.the_user_should_be_able_to_retrieve_the_value_from_the_webtable()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});