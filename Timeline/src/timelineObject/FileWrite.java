
package timelineObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;

/**
 *
 * @author zain.aaban
 */
public class FileWrite {
    
    ComputerComponent cc = new ComputerComponent();
    FileWriter pWriter;
   
    
    public void writeFile() throws IOException{
        java.io.File file = new java.io.File("input.txt");        
        
        pWriter = new FileWriter("input.txt",true); // true keeps existing files
/*        pWriter.write(cc.name);
        pWriter.write(cc.description);
        pWriter.write(cc.ram);
        pWriter.write(cc.releaseYear);
        pWriter.write((int) cc.megahertzCPUSpeed);
*/        
        pWriter.close();
    }
    
    
         public static void main(String[] args) throws IOException {
        FileWrite fw = new FileWrite();
        fw.writeFile();
        TimelineObject to = new TimelineObject();
        
             System.out.println(to.getReleaseYear(1998));
                
    }
         
   
    
        
        
        // -------------- OLD CODE -------------------
        
         /*
    public void makeFile() throws IOException{
        java.io.File file = new java.io.File("input.txt");        
        if (file.exists() == false){
            try{
                pWriter = new FileWriter("input.txt",true);
                pWriter.write("Zain's file:");
                
                System.out.println("File has been created");        
            } // close try

            catch (IOException o){
                System.out.println("There was an IOException");
            } // close catch
        } // close if
        
        else{ 
            System.out.println("File exists");
            pWriter.write("Test else");
        }
    */
        
        
        
        
        /*
    FileWrite(){
       
        FileWriter fw;
       try{
           fw = new FileWriter(new File("input.txt"));
       }
       catch(IOException iex){
           System.out.println("Error IO Exception");
       }
    }
    */
    //Object writeObjectToFile(TimelineObject){
        
        
    //}
        
  
        
        
        
    /*
    Object inputFileString(){
        String Input = sc.next();
        
        return null;
    }
    */
}
