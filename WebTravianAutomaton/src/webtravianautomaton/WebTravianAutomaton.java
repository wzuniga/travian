/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webtravianautomaton;

import Classes.TravianDriver;
import errors.OnLogin;
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
    	//System.setProperty("webdriver.chrome.driver","/Users/wzuniga/NetBeansProjects/travian/WebTravianAutomaton/lib/chromedriver");
        System.setProperty("webdriver.chrome.driver","/home/wzuniga/NetBeansProjects/travian/WebTravianAutomaton/lib/chromedriverL");
        WebDriver driver = new ChromeDriver();
        
        gameDriver = new TravianDriver(driver);

        // launch Fire fox and direct it to the Base URL
        boolean pass = false;

        while (!pass) {
            try {
                runMain(driver);
                pass = true;
            }
            catch (OnLogin e){
                System.out.println("Error On Login");
            }
                catch (InterruptedException e) {System.out.println("Interrupted");}
            catch (Exception e) {System.out.println("Exception");}
        }
        
        driver.close();
    }
    
    public static void runMain(WebDriver driver) throws InterruptedException, OnLogin{
        driver.get(Path.login);
        
        gameDriver.logIn();
        
        //for (int i = 0; true; i++)
        //    createTroopFoot(1);
        
        //fieldUpOne(4,7,10,12,13,17,18);
        buildUpOne(19, 13);
        
        //for (int i = 0;true; i++){
            //allFieldUpOne();
            //createTroopFoot(2);
            
        //}
        
        
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
                    //newFaltantes.add(faltantes.get(i));
                }
            }
            faltantes = newFaltantes;
        }
        
    }
    
    public static void buildUpOne(int build, int times) throws InterruptedException{
        int spend;
        System.out.println("Building " + build);
        while (times != 0) {
            System.out.println("time " + times);
            try {
                spend = gameDriver.levelUpCampo(build);
                Thread.sleep(spend);
                times--;
            } catch (Exception e) {
                System.out.println("Error on build");
            }
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
