$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:Cucumber/Cucumber/abc.feature");
formatter.feature({
  "name": "TestME App",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Purchase Headphone",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "I Go to All \"Categories\"",
  "keyword": "When "
});
formatter.match({
  "location": "Purchase.i_Go_to_All_Categories(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Navigate to Electronics",
  "keyword": "And "
});
formatter.match({
  "location": "Purchase.i_Navigate_to_Electronics()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on HeadPhones and Add to Cart",
  "keyword": "And "
});
formatter.match({
  "location": "Purchase.click_on_HeadPhones_and_Add_to_Cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the payment page is appeared",
  "keyword": "Then "
});
formatter.match({
  "location": "Purchase.the_payment_page_is_appeared()"
});
formatter.result({
  "status": "passed"
});
});