import java.util.Scanner;

public class exe14 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a quantidade de Km percorrido:");
        int km = ler.nextInt();
        System.out.println("Digite a quantidade de dias alugados:");
        int dias = ler.nextInt();

        ler.close();

        System.out.println("O preço total foi de: R$"+(90*dias) + (0.20*km));

    }
}
