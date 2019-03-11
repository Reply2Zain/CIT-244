/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timelineObject;

/**
 *
 * @author zain.aaban
 */
public class Input {
    
    
    Input(){
        
    }
    
    void getWelcome(){
        System.out.println("Welcome to the Timeline");
    }
    
    /**
     * Creates a ComputerComponent object and asks for each field.
     * @return ComputerComponent object
     */
    ComputerComponent askForAllEntries(){
        ComputerComponent cc2 = new ComputerComponent();
        cc2.getUser();
        cc2.getBrand();
        cc2.getReleaseYear();
        cc2.getMegahertzCPUSpeed();
        cc2.getRam();
        
        return cc2;
        
        
    }
}
