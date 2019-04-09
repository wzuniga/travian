/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webtravianautomaton.constans;

/**
 *
 * @author wzuniga
 */
public class Path {
    
    /* Var */
    public static final int holg = 3;
    
    /* Server */
    //public static final String server = "https://ts20.hispano.travian.com/";
    public static final String server = "https://low2.ttwars.com/";
    
    /* Login */
    public static final String login = server + "login.php";
    public static final String nick_path = "//*[@id=\"content\"]/div[1]/div[1]/form/table/tbody/tr[1]/td[2]/input";
    public static final String pass_path = "//*[@id=\"content\"]/div[1]/div[1]/form/table/tbody/tr[2]/td[2]/input";
    public static final String push_enter = "//*[@id=\"s1\"]";
    public static final String nick = "wzuniga";
    //public static final String pass = "rmcc231112";
    public static final String pass = "qazxswedcvfr";
    
    /* Principales */
    public static final String Aldea = server + "dorf1.php";
    public static final String Ciudad = server + "dorf2.php";
    
    /* Edificios */
    public static final String cuartel = server + "build.php?id=30";
    public static final String establo = server + "build.php?id=24";
    
    /* Granjas */
    public static final String campo = server + "build.php?id=";
    
    /* Actions Efificios */
    public static final String cuartel_up = "";
    
    /* Create troops */
    public static final String troop1 = "//*[@id=\"build\"]/form/div/div[";
    public static final String troop2 = "]/div[2]/a";
    public static final String count1 = "//*[@id=\"build\"]/form/div/div[";
    public static final String count2 = "]/div[2]/input";
    public static final String cuartel_create = "//*[@id=\"build\"]/form/button";
    
    /* Actions Granja */
    //public static final String campo_up = "//*[@id=\"build\"]/div[3]/div[3]/div[1]/button";
    public static final String campo_up = "//*[@id=\"build\"]/div[2]/div[4]/button";
    
    /* Path Production per hour*/
    public static final String madera_prod = "//*[@id=\"production\"]/tbody/tr[1]/td[3]";
    public static final String barro_prod  = "//*[@id=\"production\"]/tbody/tr[2]/td[3]";
    public static final String hierro_prod = "//*[@id=\"production\"]/tbody/tr[3]/td[3]";
    public static final String trigo_prod  = "//*[@id=\"production\"]/tbody/tr[4]/td[3]";
    
    /* Path spend time */
    //public static final String time = "//*[@id=\"content\"]/div[2]/div[10]/ul/li/div[2]/span";
    public static final String time = "//*[@id=\"content\"]/div[3]/div[10]/ul/li/div[2]/span";
    
    
}
