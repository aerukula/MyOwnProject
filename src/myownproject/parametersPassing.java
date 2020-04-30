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
public class parametersPassing {
/*public void method(String fname,int i){
    System.out.println(fname + " "+i); 
}
   
    public static void main(String[] args) {
        parametersPassing pp=new parametersPassing();
        pp.method("hello",1);*/
        static int myMethod(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    int z = myMethod(5, 3);
    System.out.println(z);
  }
    }
    

