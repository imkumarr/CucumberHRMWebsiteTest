Feature: Login page Automation of Isiri App

  Scenario: Check login is successful with valid creds
    Given User is on the login page
    When User enters valid "<username>" and "<password>"
    And clicks on Login Button
    Then User is navigated to Home Page
    And Click on PIM Button
    And Click on Add new employee button
    And enters user "<firstName>" creds
    And enter user "<usermiddlename>" creds
    And enters "<userlastname>" creds
    And enters "<EmployeeID>"
    And successfully "<uploadsimage>" file
    Then clicks on save button
    
    Then click on edit button
    And enter employee "<otherid>"
    And enter Driving "<licensenumber>"
    And License "<ExpiryDate>"
    And Select the Gender
    And Select Emplo "<MaritalStatus>"
    And Select emp "<Nationality>"
    And enter the "<DateofBirth>"
    Then click on save button
    And click on PIM button option
    Then enter "<EmployeeID>"
    And Click on Search button
    Then select employee
    And click on delete button
    And click on ok
    And Close the browser

Examples:
| username | password     |firstName|usermiddlename|userlastname|EmployeeID|uploadsimage									| otherid		|licensenumber|ExpiryDate |  MaritalStatus| Nationality|DateofBirth|
| kumar    | iSiriTech! |kumar		| k						 |R					  |10002		 |C:\\Users\\pc\\Pictures\\1.png|  234		  |   323			  |2023-12-23 |  Single			 	| Indian		 |2000-11-22 |
| kumar    | iSiriTech! |manju	  |D	           |m	 				  |1001			 |C:\\Users\\pc\\Pictures\\1.png|	D22				|		6346			|2022-10-04 |  Single	      |	Indian		 |1999-11-22 |
|kumar     | iSiriTech! |raj	    |S						 |R						|1002			 |C:\\Users\\pc\\Pictures\\1.png|	D21				|		34			  |2022-11-20	|  Single				|	Indian		 |1995-11-22 |
#|kumar     | iSiriTech! |jagga	  |N						 |M						|1003			 |C:\\Users\\User\\Pictures\\Saved Pictures\\1.jpg|	D56				|		643				|2021-04-13 |  Married			|	Indian		 |2001-11-22 |
#|kumar     | iSiriTech! |yogi	    |Y	 					 |V						|1004			 |C:\\Users\\User\\Pictures\\Saved Pictures\\1.jpg|	D32				|		634			  |2024-04-15 |  Single				| Indian		 |1998-11-22 |
