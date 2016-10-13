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
import java.util.ArrayList;
import java.util.List;

class SubSeqByRecursion {

    void longestSubSeq(String rest, List list) {
        for (int i = 0; i < rest.length(); i++) {
            helperSubSeq("", rest.substring(i), list);
        }
    }

    private void helperSubSeq(String soFar, String rest, List list) {
        if (rest.length() == 0) {
//System.out.println(soFar); 
            list.add(soFar);
        } else {
            if (soFar == "") {
                soFar = soFar + rest.charAt(0);
//System.out.println(soFar); 
            } else if (soFar.charAt(soFar.length() - 1) < rest.charAt(0)) {
                soFar = soFar + rest.charAt(0);
//helperSubSeq(soFar, rest.substring(1), list);	
            }
            helperSubSeq(soFar, rest.substring(1), list);
        }
    }
}

public class SubSeq {

    public static void main(String[] args) {

        SubSeqByRecursion subseq = new SubSeqByRecursion();
        List list = new ArrayList();
        subseq.longestSubSeq("54782369862345", list);
        System.out.println("List with all increasing sub seqs:" + list);
        int maxLength = 0;
        for (int i = 0; i < list.size(); i++) {
            String temp = (String) list.get(i);
            if (temp.length() > maxLength) {
                maxLength = temp.length();
            }
        }
        System.out.println("Max Increasing sub seq strings");
        for (int i = 0; i < list.size(); i++) {
            String temp = (String) list.get(i);
            if (temp.length() == maxLength) {
                System.out.println(temp);
            }
        }
    }

}
