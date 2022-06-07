import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String T = scan.nextLine();
        String rCompetidores = scan.nextLine();
        String[] rCompetidoresSplit = rCompetidores.split(" ");

        int count = 0;

        for (int i = 0 ; i < rCompetidoresSplit.length ; i++) {
            if (rCompetidoresSplit[i].equals(T)) {
                count++;
            }
        }

        System.out.println(count);
    }
}