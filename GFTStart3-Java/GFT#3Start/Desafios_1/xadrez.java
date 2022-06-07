import java.util.Scanner;
public class xadrez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int C = sc.nextInt();
        if (((L%2 !=0)&&(C%2 !=0))||((L%2 ==0)&&(C%2 ==0)))
            System.out.println("1");
        else
            System.out.println("0");
        sc.close();
    }
}