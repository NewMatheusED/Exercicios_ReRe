import java.util.Scanner;

public class exe13 {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        System.out.print("Digite o salário do funcionário: ");
        double salario = le.nextDouble();
        double novoSalario = salario * 1.15;
        System.out.printf("O novo salário com 15%% de aumento é: %.2f", novoSalario);
        le.close();
    }
}
