import java.util.Scanner;

public class ExerOito {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int number;

        System.out.print("Digite um número: ");
        number = leitor.nextInt();

        if (number >= 50) {
            System.out.println("O número é maior ou igual a 50");
        }
        else{
            System.out.println("O número é menor que 50");
        }
    }
}
