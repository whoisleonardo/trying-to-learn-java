import java.util.Scanner;

public class ExerNove {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int A;
        int B;

        System.out.print("Informe o valor de A: ");
        A = leitor.nextInt();

        System.out.print("Informe o valor de B: ");
        B = leitor.nextInt();

        if (A == B){
            System.out.println("Os números são iguais");
        }
        else if (A > B) {
            System.out.print("Os números são diferentes e o maior é a variavel A: " + A);
        }
        else if (A < B) {
            System.out.print("Os números são diferentes e o maior é a variavel B: " + B);
        }
    }
}
