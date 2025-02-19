import java.util.Scanner;

public class exe5 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira a nota 1:");
        float n1 = ler.nextFloat();

        System.out.println("Insira a nota 2:");
        float n2 = ler.nextFloat();

        ler.close();

        double media = (n1+n2)/2;

        System.out.println("A média entre " +n1+ " e " +n2+ " é igual a "+media);

    }
}
