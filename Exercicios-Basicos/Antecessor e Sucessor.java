import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, ant,suc;

        System.out.println("Digite um numero: ");
        num = sc.nextInt();
        ant = num - 1;
        suc = num + 1;

        System.out.println("O numero e: " + num);
        System.out.println("O antecessor e: " + ant);
        System.out.println("O sucessor e: "+ suc);
    }
}

