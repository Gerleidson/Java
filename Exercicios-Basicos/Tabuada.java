import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = 0, n;

        Scanner sc = new Scanner(System.in);

        System.out.println("---> Tabuada <---");
        System.out.println("--------------------------------");
        System.out.println("Escolha operação: ");
        System.out.println("1 - Soma / 2 - Subtração / 3 - Multiplicação / 4 - Divisão:");
        n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("---SOMA--- ");
                System.out.println("Digite um numero: ");
                num = sc.nextInt();

                System.out.println(num + " + 1 = " + (  num + 1 ));
                System.out.println(num + " + 2 = " + (  num + 2 ));
                System.out.println(num + " + 3 = " + (  num + 3 ));
                System.out.println(num + " + 4 = " + (  num + 4 ));
                System.out.println(num + " + 5 = " + (  num + 5 ));
                System.out.println(num + " + 6 = " + (  num + 6 ));
                System.out.println(num + " + 7 = " + (  num + 7 ));
                System.out.println(num + " + 8 = " + (  num + 8 ));
                System.out.println(num + " + 9 = " + (  num + 9 ));
                System.out.println(num + " + 10 = " + (  num + 10 ));
                break;
            case 2:
                System.out.println("---SUBTRAÇÃO--- ");
                System.out.println("Digite um numero: ");
                num = sc.nextInt();

                System.out.println(num + " - 1 = " + (  num - 1 ));
                System.out.println(num + " - 2 = " + (  num - 2 ));
                System.out.println(num + " - 3 = " + (  num - 3 ));
                System.out.println(num + " - 4 = " + (  num - 4 ));
                System.out.println(num + " - 5 = " + (  num - 5 ));
                System.out.println(num + " - 6 = " + (  num - 6 ));
                System.out.println(num + " - 7 = " + (  num - 7 ));
                System.out.println(num + " - 8 = " + (  num - 8 ));
                System.out.println(num + " - 9 = " + (  num - 9 ));
                System.out.println(num + " - 10 = " + (  num - 10 ));
                break;
            case 3:
                System.out.println("---MULTIPLICAÇÃO--- ");
                System.out.println("Digite um numero: ");
                num = sc.nextInt();

                System.out.println(num + " x 1 = " + (  num * 1 ));
                System.out.println(num + " x 2 = " + (  num * 2 ));
                System.out.println(num + " x 3 = " + (  num * 3 ));
                System.out.println(num + " x 4 = " + (  num * 4 ));
                System.out.println(num + " x 5 = " + (  num * 5 ));
                System.out.println(num + " x 6 = " + (  num * 6 ));
                System.out.println(num + " x 7 = " + (  num * 7 ));
                System.out.println(num + " x 8 = " + (  num * 8 ));
                System.out.println(num + " x 9 = " + (  num * 9 ));
                System.out.println(num + " x 10 = " + (  num * 10 ));
                break;
            case 4:
                System.out.println("---DIVISÃO--- ");
                System.out.println("Digite um numero: ");
                num = sc.nextInt();

                System.out.println(num + " / 1 = " + (  num / 1 ));
                System.out.println(num + " / 2 = " + (  num / 2 ));
                System.out.println(num + " / 3 = " + (  num / 3 ));
                System.out.println(num + " / 4 = " + (  num / 4 ));
                System.out.println(num + " / 5 = " + (  num / 5 ));
                System.out.println(num + " / 6 = " + (  num / 6 ));
                System.out.println(num + " / 7 = " + (  num / 7 ));
                System.out.println(num + " / 8 = " + (  num / 8 ));
                System.out.println(num + " / 9 = " + (  num / 9 ));
                System.out.println(num + " / 10 = " + (  num / 10 ));
                break;
        }
    }
}