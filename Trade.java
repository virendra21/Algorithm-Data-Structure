/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobject;
 import java.lang.*;
/**
 *
 * @author Viru
 */
public class Trade {
     public static int k;
    public static void main(String[] args) {
       
          int arr[] = {1, 2, 3,4};
          int n = arr.length/arr[0];
          System.out.println("array");

            subArray(arr, n);
           //  printSubsequences(arr, n);
            int[] array = new int[]{5,4,7,8,2,3,6,9,8,6,2,3,4,5};
        PrintSubsequences printSubsequences = new PrintSubsequences();
        printSubsequences.printAllSequences(array,0);
    
    }
   public static void subArray(int arr[], int n)
{
 
    for (int i=0; i <n; i++)
    {
       
        for (int j=i; j<n; j++)
        {
          
            for ( k=i; k<=j; k++)
                System.out.println(arr[k]);
           
            System.out.println("");
            
 
        }
    }
}
 /* public static void printSubsequences(int arr[], int n)
{
	 Number of subsequences is (2**n -1)*/
/*	double opsize = Math.pow(2, n);

	/* Run from counter 000..1 to 111..1*/
	//for (int counter = 1; counter < opsize; counter++)
	/*{
		for (int j = 0; j < n; j++)
		{
			/* Check if jth bit in the counter is set
				If set then print jth element from arr[] 
			if (counter==j)
                            System.out.println(arr[j]);
				
		}
		          System.out.println("");
	}
}
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
    }}
