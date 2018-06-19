/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3portugol_q3;

/**
 *
 * @author cliente
 */
public class Lista3Portugol_Q3 {




    public static void main(String[] args) {
       float divi, result=0; 
       int N1, contador=0;
       
        for(N1=0; N1<100; N1=N1+2){
            contador=contador+1;
            divi=(N1/contador);
            result=result+divi;            
        }
        System.out.println(N1+"+"+contador+" = "+result);
        
       
    }
    
}