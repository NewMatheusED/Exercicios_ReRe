import java.util.Scanner;

public class exe10 {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        double altura;
        double largura;

        System.out.println("Digite a altura da parede: ");
        altura = le.nextDouble();

        System.out.println("Digite a largura da parede: ");
        largura = le.nextDouble();

        le.close();

        System.out.println("A área da parede é: " + (altura*largura));
        System.out.println("A quantidade de tinta necessária é: " + (altura*largura)/2);
    }
}
