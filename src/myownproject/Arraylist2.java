/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myownproject;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author shekh
 */
public class Arraylist2 {

    
    public static void main(String[] args) {
        
        String str="hi,how,are,you";
        ArrayList<String> str1=new ArrayList<String>();
        
        StringTokenizer token=new StringTokenizer(str,",");
        while(token.hasMoreTokens()){
            String str2=(String)token.nextToken();
            str1.add(str2);
            
        }
        for(String str2:str1){
            System.out.println(str2);
}
    }
    
}
