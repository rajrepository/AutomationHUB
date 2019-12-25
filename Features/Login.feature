Feature: Login

  @tag1
  Scenario: Login to orangeHRM with valid credemtails
    When User launches browser
    Given User gives url "https://opensource-demo.orangehrmlive.com/"
    And User enters username as "Admin" and password as "admin123"
   Then click on login
 

 
