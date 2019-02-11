/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.Arrays;

class Computer{
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
}
/**
 *
 * @author zain.aaban
 */
public class ClonePractice {
    public static void main(String[] args) {
        Integer [] intArray = new Integer[5];
        
            intArray[0] = 8;
            intArray[1] = 32;
            intArray[2] = 56;
            intArray[3] = -1;
            intArray[4] = 90;
            
            for(int i=0; i< intArray.length; i++){
                System.out.println(intArray[i]);
            }
            
        Arrays.sort(intArray);
            
        for(int i=0; i< intArray.length; i++){
        System.out.println("After sort: " + intArray[i]);
        
            }
        Computer[] pcArray = new Computer [3];
        pcArray[0] = new Computer(1975, 2, 2, "IMASI");
        pcArray[1] = new Computer(2008, 8000000, 3400, "Dell");
        pcArray[2] = new Computer(2018, 32000000, 3400, "Alienware");
       
        System.out.println("Before Sort: ");
    for(int i=0; i< intArray.length; i++){
        System.out.println("After sort: " + intArray[i]);
        System.out.println(pcArray[i].hrtz);
        System.out.println(pcArray[i].kbRam);
        System.out.println(pcArray[i].manufactuerer);
        System.out.println(pcArray[i].year);
        }
    
        Arrays.sort(pcArray);
        System.out.println("After sort");
        
    for(int i=0; i< intArray.length; i++){
        System.out.println(pcArray[i].hrtz);
        System.out.println(pcArray[i].kbRam);
        System.out.println(pcArray[i].manufactuerer);
        System.out.println(pcArray[i].year);
    }
   }
    
}

