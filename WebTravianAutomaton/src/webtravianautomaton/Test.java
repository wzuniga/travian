/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webtravianautomaton;

import java.util.ArrayList;

/**
 *
 * @author wzuniga
 */
public class Test {
 
    public static void allFieldUpOne(String ... list){
        ArrayList <Integer> faltantes = new ArrayList<Integer>();
        for (String item : list) 
            faltantes.add(Integer.parseInt(item));

    }
    
    public static void main(String [] args){
        allFieldUpOne();
    }
}
