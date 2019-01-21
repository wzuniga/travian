/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webtravianautomaton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author wzuniga
 */
public class WebTravianAutomaton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.chrome.driver","/Users/wzuniga/NetBeansProjects/travian/WebTravianAutomaton/lib/chromedriver");
        WebDriver driver = new ChromeDriver();
        //comment the above 2 lines and uncomment below 2 lines to use Chrome
	//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://demo.guru99.com/test/newtours/";
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
       
        //close Fire fox
        driver.close();
    }
    
}
