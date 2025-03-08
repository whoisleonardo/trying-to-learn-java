import java.util.Scanner;

public class ExerDoze {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        float radius;
        float height;

        System.out.print("Informe o valor do raio: ");
        radius = leitor.nextFloat();
        System.out.print("Informe o valor da altura: ");
        height = leitor.nextFloat();

        double volume = 3.14 * (radius * radius) * height;

        System.out.println("O volume do cilindro é: " + volume);
    }
}
