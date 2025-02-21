import java.util.Scanner;

public class exe16 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a quantidade de cigarros fumados por dia:");
        int qtd = ler.nextInt();
        System.out.println("Digite a quantidade de anos fumando:");
        int anos = ler.nextInt();

        ler.close();



        System.out.println("A quantidade de dias de vida perdidos são: "+((((qtd*30)*12)*anos)*10)/1440);

    }
}
