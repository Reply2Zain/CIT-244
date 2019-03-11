
package timelineObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author zain.aaban
 */
public class FileWrite {
    FileWriter fWriter;
    String fileName = "input.txt"; //Name of the file
    
    
    /**
     * Can write to a file without having a parameters set, needs all of the
     * variables to be initialized within the method before running
     * @throws IOException 
     */
    public void writeFile() throws IOException{
        java.io.File file = new java.io.File(fileName); 
        ComputerComponent cc = new ComputerComponent();
        try{
        fWriter.write(cc.releaseYear);
        fWriter = new FileWriter(fileName,true); // true keeps existing files
        fWriter.write(cc.brand);
        fWriter.write(cc.ram);
        fWriter.write((int) cc.megahertzCPUSpeed);
        fWriter.write(cc.description);
        }
        catch(NullPointerException np){
            System.out.println("Error: Not all of the variables were "
                    + "initalized under the writeFile method");
        }
        fWriter.close();
    }
    /**
     * Takes in ComputerComponent cc and writes it to the text file. Does not 
     * need all of the variables to be entered to work since they are all pre-initialized.
     * @param  cc
     * @throws IOException 
     */
     public void writeFile(ComputerComponent cc) throws IOException{
        java.io.File file = new java.io.File(fileName);
        
        
        fWriter = new FileWriter(fileName,true); // true keeps existing files
        
        
        
        if (cc.releaseYear != -1){
            String releaseYearString = Integer.toString(cc.releaseYear);
            fWriter.write("Year:" + releaseYearString + ". ");
        }
        
        else
            fWriter.write("Year: N/A. ");
        
        fWriter.write("Brand:" + cc.brand + ". ");
        
        if (cc.ram != -1){
            String ramString = Integer.toString(cc.ram);
            fWriter.write("Ram:" + ramString + "Kb. ");
        }
        else
            fWriter.write("Ram: N/A. ");
        String megahertzCPUSpeedString = Double.toString(cc.megahertzCPUSpeed);
        if (cc.megahertzCPUSpeed != -1){
            fWriter.write("CPU-Speed:" + megahertzCPUSpeedString + "MHz. ");
            
        }
        else
            fWriter.write("CPU-Speed: N/A. ");
        
        
        fWriter.write("Description:" + cc.description + " ");
        fWriter.write("Entered by: " + cc.user);
        fWriter.append(System.lineSeparator());
        fWriter.close();
     }
    
     /**
      * Reads the file and returns the contents of the text file in the console output.
      * For use when there is a specified file name that is different from the
      * "String fileName" that is initialized at the beginning of the FileWrite class.
      * @param fileName 
      */
    public void readFile(String fileName) {
       try {
         File file = new File(fileName);
           try (Scanner scanner = new Scanner(file)) {
               while (scanner.hasNextLine()) {
                   System.out.println(scanner.nextLine());
               } 
           }
       } 
       
       
       catch (FileNotFoundException e) {
           System.out.println("Error: File not found");
       }
     }
    
    /**
     * Reads the file and returns the contents of the text file in the console output.
     * Uses the file name that is initialized at the beginning of the FileWrite class. 
     */
    public void readFile() {
       try {
         File file = new File(fileName);
           try (Scanner scanner = new Scanner(file)) {
               while (scanner.hasNextLine()) {
                   System.out.println(scanner.nextLine());
               } 
           }
       } 
       
       
       catch (FileNotFoundException e) {
           System.out.println("Error: File not found");
       }
     }
    /**
     * Deletes the old file and creates a new one with the same name.
     * @throws IOException 
     */
    void clearFile() throws IOException{
        java.io.File file = new java.io.File(fileName);
        fWriter = new FileWriter(fileName,false); // true keeps existing files

    }
    
    
   
    
        
         
         
} // close class     
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
        
        // -------------- OLD CODE -------------------
        
         /*
    public void makeFile() throws IOException{
        java.io.File file = new java.io.File("input.txt");        
        if (file.exists() == false){
            try{
                fWriter = new FileWriter("input.txt",true);
                fWriter.write("Zain's file:");
                
                System.out.println("File has been created");        
            } // close try

            catch (IOException o){
                System.out.println("There was an IOException");
            } // close catch
        } // close if
        
        else{ 
            System.out.println("File exists");
            fWriter.write("Test else");
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

