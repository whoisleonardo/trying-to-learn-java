import java.util.Scanner;

public class ExerDois {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int firstNumber;
        int secondNumber;

        System.out.print("Digite o primeiro número: ");
        firstNumber = leitor.nextInt();

        System.out.print("Digite o segundo número: ");
        secondNumber = leitor.nextInt();

        int result = firstNumber + secondNumber;
        System.out.print("O resultado da soma dos dois números é: " + result);
    }
}
