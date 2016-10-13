/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaprog;

import java.util.*;
import java.io.*;

class HashSol{
   public static void main(String []argh)
   {
       Map dict=new HashMap();
       
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
     in.nextLine();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         dict.put(name,""+phone);
         in.nextLine();
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
         String phone = (String)dict.get(s); 
         System.out.println(phone==null?"Not found":s+"="+phone);
      }
   }
}