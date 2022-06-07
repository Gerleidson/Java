import java.util.Scanner;

public class topN {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] TOPS = {1, 3, 5, 10, 25, 50, 100};

        int position = scan.nextInt();

        for( int pos : TOPS){
            if( position <= pos ) {
                System.out.println("Top "+ pos);
                break;
            }
        }
    }
}