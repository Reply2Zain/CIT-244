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
    * Welcomes the user with an introductory phrase letting
    * the user know what the program is and what it is called
    * @return null
    * @param null
    */
public String getWelcomeText(){
       System.out.println("Welcome to the Password System");
    return null;
}
//creates the "user base size"
   String[] passwords = new String[Userbase];

   /**
    * This sets the size of the array which holds
    * the passwords
    * @param x
    * @return Userbase
    */
public int setUserBase(int x){
    Userbase = x;
    System.out.println("Userbase is " + Userbase);
    return Userbase;
}

/**
 * This asks the user to enter a password
 * and the enters the password into an open
 * array slot
 * @return null
 */
public String askPassword(){
    Scanner sc = new Scanner(System.in);
    Input = sc.next();
    passwords[x] = Input;
    System.out.println("Your password: " + passwords[x]);
    x++;
    return null;
}

//Will get the pass length, does not work yet
public int getPassLength(){
    
        return 0;
}
    
    public static void main(String[] args) {
        PasswordSystem ps = new PasswordSystem();
        ps.getWelcomeText();
        ps.setUserBase(5);
        ps.askPassword();
    }
    
}
