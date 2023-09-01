/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradigmas1;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class exercicio1 {
    public static void main(String[] args) {
         Scanner teclado=new Scanner(System.in);
         System.out.println("Introduza o numero: ");
        int valor=teclado.nextInt();
        
       if(valor<0){
           System.out.println(valor+ " é negativo");
       }else{
           System.out.println("O numero digitado nao é negativo.");
       }
    }
}
