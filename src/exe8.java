import java.util.Scanner;

public class exe8 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma distância em metros:");
        int n = ler.nextInt();

        ler.close();

        System.out.println("Distância de "+ (n*100)+ " Cm");
        System.out.println("Distância de "+ (n/100)+ " Km");


    }
}
