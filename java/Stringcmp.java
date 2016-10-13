/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaprog;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Stringcmp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        int length = sc.nextInt();
        String smallest = "";
        String largest = "";

        for (int i = 0; i <= inputString.length() - length; i++) {
            String subString = inputString.substring(i, i + length);

         
            if (i == 0) {
                smallest = subString;
            }
            if (subString.compareTo(largest) > 0) {
                largest = subString;
            } else if (subString.compareTo(smallest) < 0) {
                smallest = subString;
            }
        }
        System.out.println(smallest);
        System.out.println(largest);

    }

}
