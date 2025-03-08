import java.util.Scanner;

public class ExerDez {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int number;

        do{
            System.out.print("Digite um número entre 1 e 50: ");
            number = leitor.nextInt();
            if (number > 1 || number < 50) {
                System.out.println("Número invalido");
            }
        }while (number < 1 || number > 50);

        int i;

        for(i = number; i<=50; i++)
        System.out.println(i);
    }
}
