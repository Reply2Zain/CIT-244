/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapsort;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Zain.aaban
 */
public class SortClient {
    static int[] randList;
    static int listSize;
    static int bound;
    
    public static int[] getRand(int listSize, int bound){
        Random rand = new Random();
        randList = new int[listSize];
        int random;
        
        for (int i = 0; i< listSize; i++){
        
        random = rand.nextInt(bound);
        randList[i] = random; 
        
        }// close for loop
        
        SortClient.listSize = listSize;      
        return randList;
}// close method
    
    public static int[] getRand(int listSize){
        Random rand = new Random();
        randList = new int[listSize];
        int random;
        
        for (int i = 0; i< listSize; i++){
        
        random = rand.nextInt();
        randList[i] = random; 
        
        }// close for loop
        
        SortClient.listSize = listSize;      
        return randList;
}// close method
    
    public static int[] getRand(){
        SortClient.askUserForListAndBound();
        Random rand = new Random();
        randList = new int[listSize];
        int random;
        
        for (int i = 0; i< listSize; i++){
        
        random = rand.nextInt(bound);
        randList[i] = random; 
        
        }// close for loop
        
        SortClient.listSize = listSize;      
        return randList;
}// close method
    
    public static void readList(){
        System.out.println("List:");
        for (int i = 0; i< listSize; i++){
            System.out.print(i+1 + ". ");
            System.out.println(randList[i]);
        }

    } // close readList
    
    public static void askUserForListSize(){
        Scanner input = new Scanner (System.in);
        int inputSize;
        System.out.println("Type in the random list size:");
        inputSize = input.nextInt();
        SortClient.listSize = inputSize;
    }
    
    public static void askUserForBound(){
        Scanner input = new Scanner (System.in);
        System.out.println("Type in the integer upper-bound size (exclusive):");
        bound = input.nextInt();
    }
    
    public static void askUserForListAndBound(){
        SortClient.askUserForListSize();
        SortClient.askUserForBound();
    }
    
    public static void testSort(int[] e){
        int cursor1 = 0;
        int cursor2 = 1;
        
        if (e[cursor1] < e[cursor2]){
            
        }
        
        
    }
    
}
