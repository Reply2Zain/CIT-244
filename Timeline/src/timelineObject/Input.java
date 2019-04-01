/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timelineObject;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zain.aaban
 */
public class Input {
    ComputerComponent cc2 = new ComputerComponent();
    String response;
    FileWrite fw = new FileWrite();
    
    
    Input(){
        
    }
    
    String scannerGetResponse(){
        Scanner sc = new Scanner (System.in);
        response = sc.next();
        return response;
    }
    
    void getStarted(){
        while (!"3".equals(response)){
        System.out.println("Enter: 1- Add a computer component || 2- Read the Timeline || 3- Exit");
        scannerGetResponse();
        if ("1".equals(response)){
            writeComputerComponent();
            System.out.println("-Computer Component has been added.-");
            System.out.println("");
        }
        else if ("2".equals(response)){
            fw.readFilePlain();
        }
        else if ("3".equals(response)){
            System.out.println("Thank you for using the Timeline Program.");
        }
        else{
            System.out.println("Please enter '1' , '2' or '3'");
        }
        }
    }
    
    void askForMoreEntry(){
        
        System.out.print("Would you like to enter another Computer Component ('yes' or 'no') -->");
        if ("yes".equals(response)){
            writeComputerComponent();
        }
        }
    /**
     * Creates a ComputerComponent object and asks for each field.
     * @return ComputerComponent object
     */
    ComputerComponent askForAllEntries(){
        
        cc2.getUser();
        cc2.getBrand();
        cc2.getReleaseYear();
        cc2.getMegahertzCPUSpeed();
        cc2.getRam();
        
        return cc2;
        
    }
    
    ComputerComponent writeComputerComponent(){
        
        FileWrite fw = new FileWrite();
        Input ip = new Input();
        try {
            fw.writeFile(ip.askForAllEntries());
        } catch (IOException ex) {
            System.out.println("There was an error.");
        }
        return cc2;
    }
}
