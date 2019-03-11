
package timelineObject;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author zain.aaban
 */
public class ComputerComponent extends TimelineObject implements Comparable <ComputerComponent>{
    
    double megahertzCPUSpeed = -1;
    int ram = -1;
    
    
    
    public ComputerComponent() {

    }
    
   public ComputerComponent(int releaseYear, String brand, int ram, double megahertzCPUSpeed , String description, String user) {
        this.releaseYear = releaseYear;
        this.brand = brand;
        this.ram = ram;
        this.megahertzCPUSpeed = megahertzCPUSpeed;
        this.description = description;
        this.user = user;
    }

   void getComputerComponent(int releaseYear, String brand, int ram, double megahertzCPUSpeed , String description, String user){
        this.releaseYear = releaseYear;
        this.brand = brand;
        this.ram = ram;
        this.megahertzCPUSpeed = megahertzCPUSpeed;
        this.description = description;
        this.user = user;
}
   /**
    * Asks the user to enter Ram
    * @return ram
    */
    int getRam(){
        System.out.print("Enter the ram: ");
        ram = input.nextInt();
        return ram;
    }
    /**
     * Asks the user to enter CPU Speed in MHz
     * @return 
     */
    double getMegahertzCPUSpeed(){
        System.out.print("Enter the CPU Speed (MHz): ");
        megahertzCPUSpeed = input.nextDouble();
        return megahertzCPUSpeed;
    }
   
   /*   To be used when wanting to add an array
        ComputerComponent[] pcArray = new ComputerComponent [3];
        pcArray[0] = new ComputerComponent(1975, "Dell", 2, 5, "Very popular.");
        pcArray[1] = new ComputerComponent(2008, "Lenovo", 4, 3400, "Matte black.");
        pcArray[2] = new ComputerComponent(2018, "Apple", 16, 3400, "Shiny");
        
   */
   
    @Override
    public int compareTo(ComputerComponent o) {
        if (o == null){
   throw new NullPointerException();
       
   }
        int x = 0;
    if (this.ram > o.ram){
    x=1;
}
    else if(this.ram < o.ram){
    x=-1;
            }
        return x;
        }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.releaseYear;
        hash = 67 * hash + this.ram;
        hash = (int) (67 * hash + this.megahertzCPUSpeed);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ComputerComponent other = (ComputerComponent) obj;
        if (this.releaseYear != other.releaseYear) {
            return false;
        }
        if (this.ram != other.ram) {
            return false;
        }
        if (this.megahertzCPUSpeed != other.megahertzCPUSpeed) {
            return false;
        }
        return true;
    }

}
