import java.util.Scanner;

public class exe6 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira um número:");
        int n = ler.nextInt();

        ler.close();

        System.out.println("O antecessor de " +n+ " é " +(n-1));
        System.out.println("O sucessor de " +n+ " é " +(n+1));

    }
}
