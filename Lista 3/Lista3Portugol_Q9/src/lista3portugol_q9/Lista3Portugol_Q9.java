/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3portugol_q9;
import java.util.Scanner;

/**
 *
 * @author cliente
 */
public class Lista3Portugol_Q9 {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n,x,contador=0;
        
        System.out.println("Escreva o número que deseja descobrir se é primo: ");
        n=ler.nextInt();
        
        for(x=0; x<=n; x++){
            if(n%x==0){
                contador=contador+1;                              
            }           
            
        }
        if(contador==2){
            System.out.println("Este numero é primo");           
        }
        else{
            System.out.println("Este numero não é primo.");
        }
               
              
    }
    
}