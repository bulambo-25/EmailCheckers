/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.emailcheckers;

import org.apache.commons.validator.routines.EmailValidator;

/**
 *
 * @author HP
 */
public class Checker
{
    public static boolean isValidEmail (String str)
    {
       return EmailValidator.getInstance().isValid(str);
    }
    public static void main(String[] args)
    {
        boolean result = Checker.isValidEmail("dray@gmail.com");
        
        System.out.println(result);
    }
}
