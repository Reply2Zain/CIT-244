
package timelineObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author zain.aaban
 */
public class FileWrite {
    Scanner sc = new Scanner(System.in);
    
    
    FileWrite(){
       
        FileWriter fw;
       try{
           fw = new FileWriter(new File("input.txt"));
       }
       catch(IOException iex){
           System.out.println("Error IO Exception");
       }
    }
    
    Object writeObjectToFile(TimelineObject){
        FileWrite ff = new FileWrite();
        
    }
    
    
    /*
    Object inputFileString(){
        String Input = sc.next();
        
        return null;
    }
    */
}
