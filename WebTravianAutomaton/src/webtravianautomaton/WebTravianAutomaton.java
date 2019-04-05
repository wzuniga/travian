/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webtravianautomaton;

import Classes.TravianDriver;
import java.util.ArrayList;
import java.util.Arrays;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import webtravianautomaton.constans.Path;

/**
 *
 * @author wzuniga
 */
public class WebTravianAutomaton {
    
    static TravianDriver gameDriver;
    
    public static void main(String[] args) throws InterruptedException {
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.chrome.driver","/Users/wzuniga/NetBeansProjects/travian/WebTravianAutomaton/lib/chromedriver");
        WebDriver driver = new ChromeDriver();
        
        gameDriver = new TravianDriver(driver);

        // launch Fire fox and direct it to the Base URL
        driver.get(Path.login);
        
        gameDriver.logIn();
        
        //fieldUpOne(4,7,10,12,13,17,18);
        for (int i = 0; i < 20; i++) 
            allFieldUpOne();
        
        /*boolean flag = true;
        
        while(flag) {
            createTroopFoot(2);
        }
        */
        driver.close();
    }
    
    public static void allFieldUpOne() throws InterruptedException{
        fieldUpOne(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
    }
            
    public static void fieldUpOne(Integer ... list) throws InterruptedException{
        int spend;
        ArrayList <Integer> faltantes = new ArrayList<Integer>();
        
        faltantes.addAll(Arrays.asList(list));
        
        while(!faltantes.isEmpty()){
            ArrayList <Integer> newFaltantes = new ArrayList<Integer>();
            for (int i = 0; i < faltantes.size(); i++) {
                try{
                    spend = gameDriver.levelUpCampo(faltantes.get(i));
                    Thread.sleep(spend);
                }catch(Exception e){
                    newFaltantes.add(faltantes.get(i));
                }
            }
            faltantes = newFaltantes;
        }
        
    }
    
    public static void createTroopFoot(Integer ... list) throws InterruptedException{
        for (Integer integer : list){
            gameDriver.createTroop(integer);
            Thread.sleep(5*1000);
        }
        //for (Integer integer : list){
        //    gameDriver.createTroopSir(integer);
        //    Thread.sleep(5*1000);
        //}
        
    }
    
}
