import java.util.Scanner;

public class ExerSeis {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        float celsius;

        System.out.print("Digite a temperatura em Celsius: ");
        celsius = leitor.nextFloat();

        float fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
    }
}
