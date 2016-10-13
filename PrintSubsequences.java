/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobject;

/**
 *
 * @author Viru
 */
public class PrintSubsequences {
    public void printSubsequence(int[] array, int index, int biggestNumber){
        if(index < array.length){
            if(array[index] >= biggestNumber){
                System.out.print(array[index]);
                printSubsequence(array,index+1, array[index]);
            }else
                printSubsequence(array, index+1, biggestNumber);
        }
        
    }

    public void printAllSequences(int[] array, int index){
        if(index < array.length){
            printSubsequence(array, index, array[index]);
            System.out.println("\none more sequence completed ");
            System.out.println("\n one more sequence completed ");
            printAllSequences(array, index+1);
        }
    }
    
    public static void main(String[] args){
        int[] array = new int[]{1,2,3,4};
        PrintSubsequences printSubsequences = new PrintSubsequences();
        printSubsequences.printAllSequences(array,0);
    }

}