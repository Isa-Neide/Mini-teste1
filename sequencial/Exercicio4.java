import java.util.Scanner;;
public class Exercicio4 {
     public static void main(String[] args) {
        int codigo,horas_trabalho;
    double valor_porhora,salario;
        Scanner leitura=new Scanner(System.in);
        System.out.println("Digite o codigo do funcionario:");
        codigo=leitura.nextInt();
        System.out.println("Digite as horas de trabalho:");
        horas_trabalho=leitura.nextInt();
        System.out.println("Digite o valor que recebe por hora de trabalho");
        valor_porhora=leitura.nextInt();
        salario=valor_porhora*horas_trabalho;
        System.out.printf("O salario do funcionario e %.2f:",salario);
        System.out.printf("O numero de funcionario e %.2d:",codigo);
         

    }
}
