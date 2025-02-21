import java.util.Scanner;

public class exe9 {
    public static void main(String[] args) {
        Scanner le = new Scanner (System.in);
        double dolar = 3.45;
        double realUser;

        System.out.println("Digite o valor em reais: ");
        realUser = le.nextDouble();
        le.close();

        System.out.println("O valor em dolar é: " + (realUser/dolar));
    }
}
