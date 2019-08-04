PROJECT  TITLE :  ADD ITEM TO WISH LIST 

PROJECT DESCRIPTION : 
In order to add item to my wish list,  As a new customer,  I want to be able to create an account on “automationpractice.com”.

PREREQUISITES :
IDE :  example: Eclipse, IntelliJ ( I used Eclipse Version: Neon.3 Release (4.6.3))
Operating system : Windows OS /Mac OS ( I used Windows 8 64 bit)
Browsers : Firefox and Chrome (I used Firefox Version 55.0 and Chrome Version 75.0.3770.142 ) 
Maven version : Maven 3.3.0 or above version (I used maven 3.5.3)
Java version : Java 1.8 (I used Java 1.8.0_171)

IMPORTING PROJECT ON TO IDE:
One can import this as a maven project on to IDE like Eclipse or IntelliJ

SPECIFYING THE BROWSER (chrom or firefox) TO RUN THE TESTS :
Before running the tests you can choose browser that you wish to run tests on by following below information:
- To run Tests on chrome Navigate to path /AddItemtoWishList/src/test/resources/test.properties and give browser name as 'chrome'
- To run Tests on firefox Navigate to path /AddItemtoWishList/src/test/resources/test.properties and give browser name as 'firefox'

RUNNING THE TESTS:
Right click on WishListRunnerClass --> Run As --> JUnit Test
Note: WishListRunnerClass path is /AddItemtoWishList/src/test/java/com/test/runner/WishListRunnerClass.java     

                                (or)
Open the feature file in /AddItemtoWishList/src/test/resources/stories/wishList.feature --> Run As --> Cucumber Feature								
								

TYPE OF REPORTS GENERATED :  HTML and JSON reports. These reports stored in target folder which is in /AddItemtoWishList/target
Note: After running the tests please refresh the target folder

TECHNOLOGIES & TOOLS USED:::
Automation Tool : Selenium 
Framework : Cucumber BDD 
Programming Language : JAVA      