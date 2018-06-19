/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1portugol_q4;
import java.util.Scanner;

/**
 *
 * @author cliente
 */
public class Lista1Portugol_Q4 {
public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        int a, b, c;
        
        System.out.println("Escreva o valor de A: ");
        a = ler.nextInt();
        System.out.println("Escreva o valor de B: ");
        b = ler.nextInt();
        
        c = a;
        a = b;
        b = c;  
        
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        
              
        
               
        
        
    }
    
}