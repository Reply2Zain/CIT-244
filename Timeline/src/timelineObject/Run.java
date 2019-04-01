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
        System.out.println("Welcome to the Timeline");
        Input ip = new Input();  
        ip.getStarted();
        
    }
         
}
/* Older run material
fw.clearFile();
        bb.getComputerComponent(1999, "Lenovo", 520, 40, "Laptop from 1999.", "CPU Generated");
        fw.writeFile(bb);
    
               
        ip.writeComputerComponent();
        fw.readFilePlain();
        fw.getFileValues();
*/

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
        ip.getStarted();

*/