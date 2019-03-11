/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timelineObject;

import java.io.IOException;

/**
 *
 * @author zain.aaban
 */
public class Run {
    
    public static void main(String[] args) throws IOException {
        FileWrite fw = new FileWrite();
        ComputerComponent bb = new ComputerComponent();
        fw.clearFile();
        bb.getComputerComponent(1999, "Lenovo", 520, 40, "Laptop from 1999.", "CPU Generated");
        fw.writeFile(bb);
    
        Input ip = new Input();
               
        fw.writeFile(ip.askForAllEntries());
         fw.readFile();
        ip.getWelcome();
    }
         
}

/*
FileWrite fw = new FileWrite();
        ComputerComponent bb = new ComputerComponent();
        fw.clearFile();
        bb.getComputerComponent(1999, "Lenovo", 5, 4, "Laptop from 1999.");
        fw.writeFile(bb);
        fw.readFile();
        
        ComputerComponent cc3 = new ComputerComponent ();
        cc3.getUser();
        cc3.getBrand();
        cc3.getRam();
        cc3.getMegahertzCPUSpeed();
        cc3.getDescription();

        Input ip = new Input();
               
        fw.writeFile(ip.askForAllEntries());
         fw.readFile();
        ip.getWelcome();

*/