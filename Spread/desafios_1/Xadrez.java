import java.util.Scanner;
public class Xadrez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite primeira entrada: ");
        int L = sc.nextInt();

        System.out.println("digite segunda entrada: ");
        int C = sc.nextInt();

        if (((L%2 !=0)&&(C%2 !=0))||((L%2 ==0)&&(C%2 ==0)))
            System.out.println("1");
        else
            System.out.println("0");
        sc.close();
    }
}