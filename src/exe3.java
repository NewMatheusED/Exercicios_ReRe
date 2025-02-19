import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) throws Exception {
        Scanner le = new Scanner(System.in);
        System.out.println("Nome do funcionário: ");
        String nome = le.nextLine();

        System.out.println("Salário: ");
        double salario = le.nextDouble();

        le.close();

        System.out.println("O funcionário " + nome + " tem um salário de R$ " + salario + " em junho");

    }
}
