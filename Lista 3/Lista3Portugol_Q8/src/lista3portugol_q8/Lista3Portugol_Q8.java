/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3portugol_q8;
import java.util.Scanner;

/**
 *
 * @author cliente
 */
public class Lista3Portugol_Q8 {


     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n,x,par, impar;
        
        System.out.println("Digite um numero: ");
        n=ler.nextInt();
        
        for (x=0; x<=n; x++){
            if (x%2==0){
                par=x;
                System.out.println("Par: "+par);
            }
            else{
                impar=x;
                System.out.println("Impar: "+impar);
            }
            
        }
        
    }
    
}