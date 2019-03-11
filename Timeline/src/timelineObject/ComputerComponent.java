
package timelineObject;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author zain.aaban
 */
public class ComputerComponent extends TimelineObject{
    
    double megahertzCPUSpeed;
    int componentReleaseYear;
    int ram;
    
    
    
    public ComputerComponent() {

    }
    
   public ComputerComponent(int releaseYear, String brand, int ram, double megahertzCPUSpeed , String description) {
        this.releaseYear = releaseYear;
        this.brand = brand;
        this.ram = ram;
        this.megahertzCPUSpeed = megahertzCPUSpeed;
        this.description = description;
    }

   void getComputerComponent(int releaseYear, String brand, int ram, double megahertzCPUSpeed , String description){
        this.releaseYear = releaseYear;
        this.brand = brand;
        this.ram = ram;
        this.megahertzCPUSpeed = megahertzCPUSpeed;
        this.description = description;
}

  
    
}
