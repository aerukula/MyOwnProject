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
public class PrintingPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            for(int j=0;j<i;j++){
                if(i%2==0){
                    System.out.print("*");
                }else{
                    System.out.println("1");
                }
            }
        }
    }
    
}
