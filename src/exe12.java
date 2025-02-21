import java.util.Scanner;

public class exe12 {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = le.nextDouble();

        double desconto = preco * 0.05;
        double precoPromocional = preco - desconto;

        System.out.printf("O preço promocional com 5%% de desconto é: R$ %.2f%n", precoPromocional);

        le.close();
    }
}
