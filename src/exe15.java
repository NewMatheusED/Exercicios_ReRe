import java.util.Scanner;

public class exe15 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a quantidade de dias:");
        int dias = ler.nextInt();

        ler.close();


        System.out.println("O preço total foi de: R$"+(25*8)*dias);

    }
}
