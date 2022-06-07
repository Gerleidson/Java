import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int L = scan.nextInt();
        int P = N * L;

        System.out.println(P);
    }
}