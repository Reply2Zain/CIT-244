

package timelineObject;

import java.io.IOException;
import java.util.Scanner;



/**
 *
 * @author zain.aaban
 */
public class TimelineObject {
    int releaseYear = -1;
    String brand = "N/A";
    String description = "N/A";
    String user = "N/A" ;
    
    Scanner input = new Scanner(System.in);
    
    //FileWriter fw = new FileWriter("input.txt");
    //java.io.File file = new java.io.File(input);
 
    /**
     * Asks user to enter the release year.
     * @return releaseYear
     */
    int getReleaseYear(){
        System.out.print("Enter the release year: ");
        releaseYear = input.nextInt();
        return releaseYear;
    }
    
    
    
    int getReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
        return this.releaseYear;
}
    
    /**
     * Asks user to enter brand.
     * @return brand
     */
    String getBrand(){
        System.out.print("Enter the brand name: ");
        brand = input.next();
        return brand;
    }
    String getBrand(String brand){
        this.brand = brand;
        return this.brand;
    }
    /**
     * Asks user to enter a description. 
     * @return description
     */
    String getDescription(){
        System.out.print("Enter the description: ");
        description = input.next();
      return description;  
    }
    String getDescription(String description){
        this.description = description;
        return this.description;  
    }
    /**
     * Asks user to enter their name.
     * @return user
     */
    String getUser(){
        System.out.print("Enter user: ");
        user = input.next();
        return user;
    } 
    String getUser(String user){
        this.user = user;
        return this.user;
    } 
    
   
    
     
    
   
    
    
    
    

}
