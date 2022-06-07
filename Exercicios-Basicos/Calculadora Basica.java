import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n1, n2, n3, n4 = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("===== Bem Vindo à CalcBasic ===== ");
        System.out.println("--------------------------------- ");

        while (n4 == 0) {

            System.out.println("Digite primeiro numero: ");
            n1 = input.nextInt();

            System.out.println("Digite segundo numero: ");
            n2 = input.nextInt();

            System.out.println(" Escolha operacao: ");
            System.out.println(" 1 - Soma / 2 - Subtração / 3 - Divisão / 4 - Multiplicação");

            n3 = input.nextInt();
            switch (n3) {
                case 1:
                    System.out.println("Soma: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("Subtração: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("Divisão: " + (n1 / n2));
                    break;
                case 4:
                    System.out.println("Multiplicação: " + (n1 * n2));
                    break;

            }
            System.out.println("--------------------------------- ");
        }
    }
}
