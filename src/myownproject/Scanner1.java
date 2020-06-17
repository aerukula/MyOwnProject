/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myownproject;

import java.util.Scanner;

/**
 *
 * @author shekh
 */
public class Scanner1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int x[]=new int[3];
         int sum=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<x.length;i++){
                  System.out.println("enter vaue of x" + i);
                  x[i]=sc.nextInt();
                  sum=sum+x[i];

        
        }
        System.out.println(sum);
                for(int i=0;i<x.length;i++){

      System.out.println(x[i]);}
      
    }
}
    
    

