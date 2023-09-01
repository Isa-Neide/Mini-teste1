import java.util.Scanner;

public class Exercicio3 {
    int a, b, c, d;

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        int a = leitura.nextInt();
        System.out.println("digite o valor de B:");
        int b = leitura.nextInt();
        System.out.println("Digite o valor de C");
        int c = leitura.nextInt();
        System.out.println("Digite o valor de D");
        int d = leitura.nextInt();

       int diferenca = (a * b) - (c * d);
        System.out.println("O resultado e:" + diferenca);

    }



}