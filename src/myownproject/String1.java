/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myownproject;

import java.util.StringTokenizer;

/**
 *
 * @author shekh
 */
public class String1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String st= "java";
   String st1="hi,how,are,you";
       System.out.println("replaced one:  "+st.replace("a", "x"));
       System.out.println("length: "+st.indexOf("a"));
       StringTokenizer token=new  StringTokenizer(st1,",");
       while(token.hasMoreTokens()){
           String st2=(String)token.nextToken();
           System.out.println(st2);}
            String st3="alekhya erukula,akhil ramidi";
            StringTokenizer token1=new  StringTokenizer(st3,",");
            while(token1.hasMoreTokens()){
                String st4=(String)token1.nextToken();
                StringTokenizer token2=new StringTokenizer(st4," ");
                while(token2.hasMoreTokens()){
                    String str5=(String)token2.nextToken();
                    System.out.println(str5);
                }
            }
        }
    
}
    

