

package timelineObject;

import java.io.IOException;



/**
 *
 * @author zain.aaban
 */
public class TimelineObject {
    int releaseYear;
    String brand;
    String description;
    String user;
    
    
    //FileWriter fw = new FileWriter("input.txt");
    //java.io.File file = new java.io.File(input);
 
    
    int getReleaseYear(int releaseYear){
      return releaseYear;
}
    
    String getBrand(){
        return brand;
    }
    String getBrand(String brand){
        this.brand = brand;
        return this.brand;
    }
    
    String getDescription(){
      return description;  
    }
    String getDescription(String description){
        this.description = description;
        return this.description;  
    }

    String getAuthor(){
        return user;
    } 
    String getAuthor(String user){
        this.user = user;
        return this.user;
    } 
    
   
    
     
    
   
    
    
    
    

}
