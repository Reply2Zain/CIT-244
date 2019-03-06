
package timelineObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;

/**
 *
 * @author zain.aaban
 */
public class FileWrite {
    
    
    
    public void makeFile(){
    
    java.io.File file = new java.io.File("input.txt");
        try{
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        output.print("Test");
        output.close();
            System.out.println("ran");        
        }
        catch (IOException o){
            System.out.println("There was an IOException");
        }
        
        
    }
    
    
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
    
        public static void main(String[] args) throws IOException {
        FileWrite filewrite = new FileWrite();
        //Scanner sc1;
        //sc1 = filewrite.sc;
        filewrite.makeFile();
      
    }
    
    /*
    Object inputFileString(){
        String Input = sc.next();
        
        return null;
    }
    */
}
