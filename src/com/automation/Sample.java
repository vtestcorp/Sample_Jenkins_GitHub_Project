package com.automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class Sample {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.firefox.marionette","C:\\Users\\vTEST\\Documents\\eclipse-workspace\\Sample_Jenkins_JitHub_project\\jar\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
    	//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\vTEST\\Documents\\eclipse-workspace\\Sample_Jenkins_JitHub_project\\external_jars\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
	    // 
    	
        String baseUrl = "http://demo.guru99.com/selenium/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire-fox
        driver.close();
       
    }

}
