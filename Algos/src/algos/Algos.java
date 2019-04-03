/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algos;

/**
 *
 * @author zain.aaban
 */
public class Algos {
    static int[] arr = {10, 4, 7, 2, 1, 9};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("7/2");
        mergeSort(arr);
        for(int r = 0; r < arr.length ; r++){
            System.out.println(arr[r] + ", ");
        }
        
    } // close main
    
    public static void mergeSort(int [] list){
        if (list.length > 1){
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, 0);
            mergeSort(firstHalf);
            // runs "on the folding back up"
            int secondHalfLength = list.length - list.length /2;
            int[] secondHalf = new int [secondHalfLength];
            System.arraycopy(list, list.length/2, secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);
            merge(firstHalf, secondHalf, list);
             
        }// close if
    }// close mergeSort
        
    public static void merge(int [] list1, int[] list2, int[] temp){
        int cursor1 = 0; 
        int cursor2 = 0;
        int cursor3 = 0;
        
        while (cursor1 < list1.length && cursor2 < list2.length){
            if(list1[cursor1] < list2[cursor2])
                temp[cursor3] = list1[cursor1];
            else
                temp[cursor3] = list2[cursor2++];
            
        } // close while
        while (cursor1 < list1.length)
            temp[cursor3++] = list1[cursor1++];
        
        while (cursor2 < list2.length)
            temp[cursor3++] = list2[cursor2++];
        
        
        
        
        
        
    }
    }
    

