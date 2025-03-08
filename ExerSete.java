import java.util.Scanner;

public class ExerSete {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int number;

        do {

        System.out.print("Informe um número: ");
        number = leitor.nextInt();

        if (number < 100 || number > 200) {
            System.out.println("Número fora do intervalo. Tente novamente");
        }

    } while (number < 100 || number > 200);
    }
}
