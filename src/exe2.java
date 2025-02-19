import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) throws Exception {
        Scanner le = new Scanner(System.in);

        System.out.println("Qual é o seu nome: ");
        String nome = le.nextLine();
        le.close();

        System.out.println("Olá " + nome + ", é um prazer te conhecer!");
    }
}
