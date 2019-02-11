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
    private int Userbase; //how big you would want the array
   
    //creates the "user base size"
   String[] passwords = new String[Userbase];
  
   
public String askPassword(){
    Scanner sc = new Scanner(System.in);
    Input = sc.next();
    passwords[x] = Input;
    System.out.println(passwords[x]);
    x++;
    return "Your password has been generated";
}

public int getPassLength(){
    
        return 0;
}
    
    public static void main(String[] args) {
        System.out.println(askPassword());
    }
    
}
