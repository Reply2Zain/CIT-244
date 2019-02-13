/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordsystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reply
 */
public class PasswordSystem {
    private int x = 0;
    private String Input;
    private int userbase = 0; //how big you would want the array
    private String password;
    Scanner sc = new Scanner(System.in);
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
   ArrayList<String> passwords = new ArrayList<>();

   /**
    * This sets the size of the array which holds
    * the passwords
    * @param x
    * @return Userbase
    */
public int setUserBase(int x){    
    userbase = this.x = x;
    System.out.println("Userbase is " + userbase);
    return userbase;
}

/**
 * This asks the user to enter a password
 * and the enters the password into an open
 * array slot
 * @return null
 */
/*
public String askPassword(){
    
    
    Input = sc.next();
    passwords[]x = Input;
    System.out.println("Your password: " + passwords[0]);
    x++;
    return null;
}
*/
    
public String askPasswordNew(){
    Input = sc.next();
    passwords.add(0, Input);
    System.out.println("Your password: " + passwords.get(0));
    x++;
    return null;
}

//Will get the pass length, does not work yet
public int getPassLength(){
    
        return 0;
}

public String checkPassword(){
    char charVal;
    char[] charArray = new char[password.length()];
    for(int i = 0; i < password.length(); i++){
        charVal = password.charAt(i);
        charArray[i]=charVal;
    }
        return password;
}
    
    public static void main(String[] args) {
        PasswordSystem ps = new PasswordSystem();
        
        ps.getWelcomeText();
        ps.setUserBase(5);
        ps.askPasswordNew();
        
    }
    
}
