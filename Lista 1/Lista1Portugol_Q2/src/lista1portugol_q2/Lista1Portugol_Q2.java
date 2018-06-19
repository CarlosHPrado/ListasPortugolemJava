/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1portugol_q2;

import java.util.Scanner;
/**
 *
 * @author Cliente
 */
public class Lista1Portugol_Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        float TempC, TempF;
        
        Scanner ler = new Scanner (System.in);
        System.out.println ("Digite a temperatura em Centígrados:");
        TempC = ler.nextFloat();
        
        TempF = (9*TempC+160)/5;
        
        System.out.printf("Temeperatura em fahrenheir: "+TempF);
        
               
    }
    
}