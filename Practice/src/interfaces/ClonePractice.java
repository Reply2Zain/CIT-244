/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.Arrays;


class Computer implements Comparable <Computer>{
    
    int year;
    int kbRam;
    int hrtz;
    String manufactuerer;
    /**
     * No Arg Constructor
     */
    Computer(){
        
    }
    /**
     * Generates a fully populated computer object
     * @param yr year of release
     * @param kb Kilobytes of ram
     * @param hz Hertz
     * @param m Manufacturer
     */
    Computer(int year, int kb, int hz, String m){
        
        this.year = year;
        kbRam = kb;
        hrtz = hz;
        manufactuerer = m;
    }

    @Override
public int compareTo(Computer o){
   if (o == null){
   throw new NullPointerException();
       
   }

    int x = 0;
    if (this.kbRam > o.kbRam){
    x=1;
}
    else if(this.kbRam < o.kbRam){
    x=-1;
            }
        return x;


}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.year;
        hash = 67 * hash + this.kbRam;
        hash = 67 * hash + this.hrtz;
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
        final Computer other = (Computer) obj;
        if (this.year != other.year) {
            return false;
        }
        if (this.kbRam != other.kbRam) {
            return false;
        }
        if (this.hrtz != other.hrtz) {
            return false;
        }
        return true;
    }





} //close class Computer
/**
 *
 * @author zain.aaban
 */
public class ClonePractice {
    public static void main(String[] args) {
        
        /*
        Integer [] intArray = new Integer[5];
        
            intArray[0] = 8;
            intArray[1] = 32;
            intArray[2] = 56;
            intArray[3] = -1;
            intArray[4] = 90;
            
        // Just print out each array
            System.out.println("Before sort");
            for(int i=0; i< (intArray.length); i++){
                System.out.println(intArray[i]);
            }
        
        // uses the .sort to sort the array     
        Arrays.sort(intArray);
        System.out.println("");
        System.out.println("After sort:");
        for(int i=0; i< (intArray.length); i++){
        System.out.println(intArray[i]);
        }
       */
        
     
        
        /*  gets rid of .sort
        System.out.println("");
        System.out.println("Before Sort: ");
    
        for(int i=0; i< (pcArray.length); i++){
        System.out.println(pcArray[i].hrtz);
        System.out.println(pcArray[i].kbRam);
        System.out.println(pcArray[i].manufactuerer);
        System.out.println(pcArray[i].year);
    }
        System.out.println("");
        Arrays.sort(pcArray);
        System.out.println("After sort");
        
    for(int i=0; i< (pcArray.length); i++){
        System.out.println(pcArray[i].hrtz);
        System.out.println(pcArray[i].kbRam);
        System.out.println(pcArray[i].manufactuerer);
        System.out.println(pcArray[i].year);
    }
   */
        
        
   Computer cc = new Computer();
   cc.hrtz = 3;
   cc.kbRam = 100;
   cc.manufactuerer = "dell";
   cc.year = 2000;
   
   Computer apple = new Computer();
   apple.hrtz = 35;
   apple.kbRam = 10;
   apple.manufactuerer = "apple";
   apple.year = 2005;
   
      Computer[] pcArray = new Computer [3];
        pcArray[0] = new Computer(1975, 2, 2, "IMASI");
        pcArray[1] = new Computer(2008, 8000000, 3400, "Dell");
        pcArray[2] = new Computer(2018, 32000000, 3400, "Alienware");
   
        System.out.println("");
    
    int fc = 2; //first array comparison
    int sc = 1; // second array comparison
        
        
        System.out.println("First brand: " + pcArray[fc].manufactuerer);
        System.out.println("Second brand: " + pcArray[sc].manufactuerer);
        
        System.out.println("compare to val: " + pcArray[fc].compareTo(pcArray[sc]));
        System.out.println(cc.equals(cc));
        
        System.out.println("");
        Arrays.sort(pcArray);
        
    
    } // close psvm
    
}

