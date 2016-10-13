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
class Int {
  /*
   * Private data members
   */
  private int x;

  public Int(int n) {
    x = n;
  }

  public Int() {
    this(0); // This must be first
  }

  public int get() {
    return x;
  }

  public void set(int n) {
    x = n;
  }

  public void increment() {
    x++;
  }

  public void decrement() {
    x--;
  }

  public void swap(Int o) {
    int t = x;
    x = o.x;
    o.x = t;
  }

  public void p() {
    System.out.print(x);
  }

  public void pLn() {
    p();
    System.out.println();
  }

  public void pLn(String t) {
    System.out.print(t);
    pLn();
  }
  
  private static void swap1(Int x, Int y) {
    x.pLn("start swap1 x= ") ;
    y.pLn("start swap1 y= ");
    Int t = x ;
    x.set(y.get()) ;
    y.set(t.get());
    x.pLn("end swap1 x= ") ;
    y.pLn("end swap1 y= ");
  }
  
  private static void testSwap1() {
    Int x  = new Int(10);
    Int y = new Int(20) ;
    x.pLn("start testSwap1 x= ") ;
    y.pLn("start testSwap1 y= ");
    swap1(x,y) ;
    x.pLn("end testSwap1 x= ") ;
    y.pLn("end testSwap1 y= ");
  }
  
  private static void swap2(Int x, Int y) {
    x.pLn("start swap2 x= ") ;
    y.pLn("start swap2 y= ");
    Int t = new Int(x.get()) ;
    x.set(y.get()) ;
    y.set(t.get());
    x.pLn("end swap2 x= ") ;
    y.pLn("end swap2 y= ");
  }}