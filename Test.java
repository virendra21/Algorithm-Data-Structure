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
public class Test {
    public static void main(String[] args) {
        //checkForUnique("Awesom");
     
        System.out.println("a"+   uniqueChars("abc"));
    }
    public static boolean uniqueChars(String s) {
        boolean[] mask = new boolean[256];
        for (int i = 0; i < s.length(); i++) {
  
            if (mask[s.charAt(i)])
                return false;
            mask[s.charAt(i)] = true;
        }
        return true;
    }
}

