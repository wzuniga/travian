/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import errors.OnLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import webtravianautomaton.constans.Path;
import utils.Util;

/**
 *
 * @author wzuniga
 */
public class TravianDriver {
    
    WebDriver driver;
            
    public TravianDriver(WebDriver driver) {
        this.driver = driver;
    }
    
    public void logIn() throws OnLogin{
        try{
            driver.findElement(By.xpath(Path.nick_path)).sendKeys(Path.nick);
            driver.findElement(By.xpath(Path.pass_path)).sendKeys(Path.pass);
            driver.findElement(By.xpath(Path.push_enter)).click();
        }catch(Exception e){
            System.out.println(e);
            throw new OnLogin("Error Login");
        }
    }
    
    public int levelUpCampo(int n){
        driver.get(Path.campo+n);
        driver.findElement(By.xpath(Path.campo_up)).click();
        String text = driver.findElement(By.xpath(Path.time)).getText();
        int time = Util.convertToInt(text);
        return (time + Path.holg) * 1000;
    }
     
    public void createTroop(int type){
        driver.get(Path.cuartel);
        String count = driver.findElement(By.xpath(Path.troop1+type+Path.troop2)).getText();
        count = count.replace(",", "");
        driver.findElement(By.xpath(Path.count1+type+Path.count2)).clear();
        driver.findElement(By.xpath(Path.count1+type+Path.count2)).sendKeys(count);
        driver.findElement(By.xpath(Path.count1+type+Path.count2)).submit();
//driver.findElement(By.xpath(Path.cuartel_create)).click();
    }
    
    public void createTroopSir(int type){
        driver.get(Path.establo);
        String count = driver.findElement(By.xpath(Path.troop1+type+Path.troop2)).getText();
        count = count.replace(",", "");
        driver.findElement(By.xpath(Path.count1+type+Path.count2)).clear();
        driver.findElement(By.xpath(Path.count1+type+Path.count2)).sendKeys(count);
        driver.findElement(By.xpath(Path.count1+type+Path.count2)).submit();
    }
    
}
