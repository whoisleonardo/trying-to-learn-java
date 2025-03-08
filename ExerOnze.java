import java.util.Scanner;

public class ExerOnze {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int a1;
        int r;
        int n;

        System.out.print("Informe o valor de a1: ");
        a1 = leitor.nextInt();
        System.out.print("Informe o valor de n: ");
        n = leitor.nextInt();
        System.out.print("Informe o valor de r: ");
        r = leitor.nextInt();

        int result = a1 + (n - 1) * r;

        System.out.println("O n-ésimo termo da progressão aritmética é: " + result);
    }
}
