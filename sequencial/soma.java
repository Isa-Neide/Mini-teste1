import java.util.Scanner;;
public class soma {
    
    public static void main(String[] args) {
        Scanner leitura=new Scanner(System.in);

        int n1,n2,soma;
        System.out.println("Digite o primeiro numero:");
        n1=leitura.nextInt();
        System.out.println("Digite o segundo numero:");
        n2=leitura.nextInt();
        soma=n1+n2;
        System.out.println("A soma do primeiro numero e do segundo numero e:"+soma);

        

    }
}
