/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils.validation;
import java.util.Random;

/**
 *
 * @author Zain.aaban
 */
public class StrengthChecker {
    double randomDoubles; 
    String [] Password = new String [1];    
}

public class StrengthCheckProgram {
    
        
    /**
     * 
     */
    
    String checkPassword;
    String checkChars;
    String [] password = new String [1];    
    password [0] = "test0";
    
    
    String [] RequiredChars = new String [2];
    RequiredChars [0] = "a";
    RequiredChars [1] = "@";
   
   checkPassword = password[0];
   checkChars = RequiredChars [0];
   
   boolean equals = checkPassword.contains(checkChars);
   if (equals == false){
       System.out.println("This is wrong");
   }
    


    
    System.out.println("Password is: " + Password[0]); 
          
    }
    
}
