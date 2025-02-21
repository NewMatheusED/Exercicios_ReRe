import java.util.Scanner;

public class exe11 {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = le.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = le.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = le.nextDouble();

        if (a == 0) {
            System.out.println("O valor de A não pode ser zero em uma equação quadrática.");
        } else {
            double delta = b * b - 4 * a * c;
            System.out.println("O valor de delta é: " + delta);
        }

        le.close();
    }
}
