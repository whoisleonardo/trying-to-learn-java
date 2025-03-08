import java.util.Scanner;

public class ExerQuatro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int firstNumber;
        int secondNumber;

        System.out.print("Digite o primeiro número: ");
        firstNumber = leitor.nextInt();

        System.out.print("Digite o segundo número: ");
        secondNumber = leitor.nextInt();

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;

        System.out.print("Adição: " + addition);
        System.out.print("\nSubtração: " + subtraction);
        System.out.print("\nMultiplicação: " + multiplication);
        System.out.print("\nDivisão: " + division);
    }

}
