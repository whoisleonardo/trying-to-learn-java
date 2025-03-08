import java.util.Scanner;

public class ExerUm {

    public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

    int number;
    
    System.out.print("Digite um número inteiro: ");
    number = leitor.nextInt();

    if (number > 10) {
        System.out.println("Número maior do que 10!");
    }
    else{
        System.out.println("Número menor ou igual a 10!");
    }
    }
}
