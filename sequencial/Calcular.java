package entidade;

import java.util.Scanner; //importacao da classe Scanner 

public class Calcular {

	public static void main(String[] args) {
		
		
		// Exercicio nr2
		//Declaracao das variaveis 
		double raio, area;
		double  pi  = 3.14159;
		
		
		Scanner sc = new Scanner(System.in);// Declaracao da variavel Scanner
		
		System.out.println("Calculo da area de um círculo");
				
		System.out.print("Digita o valor da raio: ");
		
		raio=sc.nextDouble(); // recebendo a variavel diagitada pelo usuario
		
		area= pi*Math.pow(raio, 2); // calculo da area do circulo , usando a formula 
		
		System.out.printf("A area do circulo e: %.4f", area); // impressao do calculo da area 
		
		System.out.println();
		
		// exercicio nr: 6
		
		Double a,b,c;
		
		System.out.println("Digita os valores de a,b e c ");
		
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		
		System.out.println();
		area=(a*b)/2; // a) area do triangulo rectangulo
		System.out.printf("A area do triangulo e: %.4f", area);
		System.out.println();
		area= pi*Math.pow(c, 2); // b) area do circulo
		System.out.printf("A area do circulo e: %.4f", area);
		System.out.println();
		area= ((a+b)*c)/2; // b) area do trapezio
		System.out.printf("A area do trapezio e: %.4f", area);
		System.out.println();
		area= Math.pow(b,2); // b) area do quadrado
		System.out.printf("A area do circulo e: %.4f", area);
		System.out.println();
		area= a*b; // b) area do rectangulo
		System.out.printf("A area do circulo e: %.4f", area);
		
		
		
		
		
		
		
		}
		
		
	
	
	
	
	
	}
	

