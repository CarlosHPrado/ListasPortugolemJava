/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3portugol_q7;
import java.util.Scanner;

/**
 *
 * @author cliente
 */
public class Lista3Portugol_Q7 {


     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float medmaior=0,medmenor=0,medturma=0,soma=0,medaluno=1,contmed;
        int contador=0;
        
        while (medaluno>=0){
            System.out.println("Digite a média do Aluno: ");
            medaluno = ler.nextFloat();
            
            if(contador==1){
                medmaior=medaluno;
                medmenor=medaluno;                                                    
            }
            else if(medaluno>medmaior){
                medmaior=medaluno;                
            }
            else if(medmenor<medaluno){
                medmenor=medaluno;                
            }
            contador=contador+1;
            soma=soma+medaluno;
            medturma=soma/contador;               
    }
        System.out.println("Maior média: "+medmaior);
        System.out.println("Menor média: "+medmenor);
        System.out.println("Média da turma: "+medturma);
    }
    
}