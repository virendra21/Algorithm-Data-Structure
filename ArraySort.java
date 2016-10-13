/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobject;

abstract class ArraySort{
  protected int[] a ; //array to be sorted
  protected long numCompare ;
  protected long numSwap ;
  protected int numRecursion ;
  protected boolean display;
  protected static final IntUtil u = new IntUtil();
  
  private void sort1(int [] a, boolean ascend) {
  	System.out.println("---------SORT1 Start------------"); 
    this.a = a ;
    numCompare = 0 ;
    numSwap = 0 ;
    numRecursion = 0 ;
    display = false ;
    if (a.length > 0 && a.length < 20) {
      display = true ;
    }
    sort(ascend); //THIS CODE IS WRITTEN BY USER
    if (ascend) {
      u.assertAscending(a) ;
    }else {
      u.reverse(a) ;
      u.assertDescending(a) ;
    }  
    if (display) {
    	int n = a.length ;
      u.pLn(n) ;
      u.pLn(a,0,n);
    }
    u.printStatistics(a.length,numCompare,numSwap,0);
    System.out.println("---------SORT1 End---------------");
  }

  //I don't know how to write it
  //Override by the concrete class
  abstract protected void sort(boolean ascend) ;
  
  private  void testSort(int N, boolean ascend) {
    int [] b = u.generateRandomNumber(N,false);//Generates random pos and neg numbers
    sort1(b,ascend) ;
  }
  
  private  void basicTests() {
    int b[][] = u.testArray();
    int l = b.length ;
    for (int i = 0; i < l; ++i) {
      int [] c = b[i] ;
      sort1(c,true);
    }
  }
 
  protected void testBench() {
    System.out.println("------------START---------------------");
    basicTests() ;
    for (int n = 10000; n < 50000; n = n + 10000) {
      testSort(n,false); //ascending order
    }
    for (int n = 10001; n < 50001; n = n + 10000) {
      testSort(n,false); //descending order
    }
    int h = 1 ;
    for (int i = 5000 + h; i < 25001 + h; i = i + 5000) {  
      System.out.println("------------testing  " + i + " SORTED ASCENDING numbers----------"); 
      int [] b = u.generateNumberInIncreasingOrder(i,1) ;
      sort1(b,false) ;
    } 
    System.out.println("------------DONE!--------");
  }
  
  public static void main(String[] args) {
    System.out.println("ArraySort.java");
    //You cannot instantiate an object from abstract class
    //ArraySort a = new ArraySort() ;
    //a.testBench();
  }
}
