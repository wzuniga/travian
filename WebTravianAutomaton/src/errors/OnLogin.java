/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errors;

/**
 *
 * @author wzuniga
 */
public class OnLogin extends Exception{
    public OnLogin(String errorMessage) {
        super(errorMessage);
    }
}
