/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3portugol_q6;
import java.util.Scanner;

/**
 *
 * @author cliente
 */
public class Lista3Portugol_Q6 {


    public static void main(String[] args) {
        int n1,n2,n3,Prod,soma;
        float Media;        
        Scanner ler = new Scanner(System.in);
        
        do{
            System.out.println("Digite o 1º valor: ");
            n1 = ler.nextInt();
            System.out.println("Digite o 2º valor: ");
            n2 = ler.nextInt();
            System.out.println("Digite o 3º valor: ");
            n3 = ler.nextInt();
            
            soma=n1+n2+n3;
            Prod=n1*n2*n3;
            Media=(n1+n2+n3)/3;
            
            System.out.println("Soma: "+n1+" + "+n2+" + "+n3+" = "+soma);
            System.out.println("Produto: "+n1+" X "+n2+" X "+n3+" = "+soma);
            System.out.println("Media: "+Media);
        }while (n1>n2 || n2>n3);
        
        
            
        
        
    }
    
}