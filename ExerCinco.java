import java.util.Scanner;

public class ExerCinco {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int A;
        int B;
        
        System.out.print("Digite o valor de A: ");
        A = leitor.nextInt();

        System.out.print("Digite o valor de B: ");
        B = leitor.nextInt();

        System.out.println("Valores originais:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        int change = A;
        A = B;
        B = change;

        System.out.println("Valores depois da troca:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

    }
}
