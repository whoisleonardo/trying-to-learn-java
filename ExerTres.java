import java.util.Scanner;

public class ExerTres {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int A;
        int B;

        System.out.print("Escreva o valor de A: ");
        A = leitor.nextInt();

        System.out.print("Escreva o valor de B: ");
        B = leitor.nextInt();

        if (A > B) {
            System.out.print("O maior número é a variavel A: " + A);
        }
        else if (A == B) {
            System.out.print("A sequência de números informados é inválida");
        }
        else{
            System.out.print("O maior número é a variavel B: " + B);
        }
    }
}
