/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1portugol_q5;
import java.util.Scanner;
/**
 *
 * @author cliente
 */
public class Lista1Portugol_Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
        float Num, Quad;
        
        System.out.println("Digite  o numero que deseja elevar ao quadrado: ");
        Num = ler.nextFloat();
        
        Quad = (float) Math.pow(Num, 2);
        
        System.out.println("O resultado é: "+Quad);
        
        
        
        
    
}
}