/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author wzuniga
 */
public class Util {
    
    public static int convertToInt(String time){
        
        String part_2 = time.substring(time.indexOf(":")+1, time.length());
        
        String hour = time.substring(0, time.indexOf(":"));
        String min = part_2.substring(0, part_2.indexOf(":"));
        String seg = part_2.substring(part_2.indexOf(":")+1, part_2.length());
        
        System.out.println(hour + ":" + min + ":" + seg);
        
        return Integer.parseInt(seg) + Integer.parseInt(min)*60 + Integer.parseInt(hour) * 60 * 60;
    }
}
