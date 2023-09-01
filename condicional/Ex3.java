/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturasequencial;
import java.util.Scanner;
/**
 *
 * @author ivobo
 */
public class Ex3 {

    
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner entrada=new Scanner(System.in);
            
       
        System.out.println("Informe dois numeros de forma crescente ou decrescente de modo a saber se sao multiplos entre si");    
        System.out.println("1. crescente");
        System.out.println("2. Decrescente");
        int escolha=entrada.nextInt();
        
        System.out.println("Digite um numero inteiro");
        int valor1=entrada.nextInt();
        
        System.out.println("Digite um numero inteiro");
        int valor2=entrada.nextInt();
        
       
        switch(escolha){
           
           case 1: 
               
           if(valor1<valor2){
                if((valor2/valor1)%2==0){
                    
            System.out.println("Sao Multiplos");
        }else
           {
               System.out.println("Numeros nao Multiplos");
            }
           }else{System.out.println("Digitou na forma decrescente");}
          
           break;
           case 2: 
            if(valor2<valor1){
                if((valor1/valor2)%2==0){
            System.out.println("Sao Multiplos");
        }else
           {
               System.out.println("Numeros nao Multiplos");
            }
           }else{System.out.println("Digitou na forma crescente");}
          
           break;
           default:System.out.println("invalido");
       }
        
    }
    
}
