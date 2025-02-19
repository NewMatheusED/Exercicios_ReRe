import java.util.Scanner;

public class exe7 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira um número:");
        float n = ler.nextFloat();
        ler.close();

        System.out.println("O dobro de " +n+ " é " +(n*2));
        System.out.println("A terça parte de " +n+ " é " +(n/3));

    }
}
