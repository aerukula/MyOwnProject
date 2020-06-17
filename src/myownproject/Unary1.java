/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myownproject;

/**
 *
 * @author shekh
 */
public class Unary1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x=3;
        System.out.println(x>=3 ? true:false);//condition,question mark,answer(just like if))inline if
        String st= "java";
        System.out.println("replaced one:  "+st.replace("a", "x"));
        System.out.println("length: "+st.indexOf("a"));
    }
    
}
