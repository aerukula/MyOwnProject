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
public class ParameterP2 {
static void checkAge(int age){
    if(age<18){
        System.out.println("not an adult");
    }else{
        System.out.println("adult");
    }
}
   
    public static void main(String[] args) {
        checkAge(20);
        
    }
    
}
