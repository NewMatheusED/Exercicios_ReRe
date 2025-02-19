import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) throws Exception {
        Scanner le = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double valor = le.nextDouble();
        System.out.println("Digite outro valor: ");
        double valor2 = le.nextDouble();
        le.close();
        System.out.println("A soma entre "+ valor +" e "+ valor2 +" é: " + (valor + valor2));
    }
}
