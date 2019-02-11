/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordsystem;

import java.util.Scanner;


/**
 *
 * @author reply
 */
public class PasswordSystem {
    private int x = 0;
    private String Input;
    private int Userbase = 0; //how big you would want the array
   
  
   /**
    * 
    * @return 
    */
public String getWelcomeText(){
       System.out.println("Welcome to the Password System");
    return null;
}
//creates the "user base size"
   String[] passwords = new String[Userbase];
   
public int setUserBase(int x){
    Userbase = x;
    System.out.println("Userbase is " + Userbase);
    return Userbase;
}
public String askPassword(){
    Scanner sc = new Scanner(System.in);
    Input = sc.next();
    passwords[x] = Input;
    System.out.println("Your password: " + passwords[x]);
    x++;
    return null;
}

public int getPassLength(){
    
        return 0;
}
    
    public static void main(String[] args) {
        PasswordSystem ap = new PasswordSystem();
        ap.getWelcomeText();
        ap.setUserBase(5);
        ap.askPassword();
    }
    
}
