import java.util.Scanner;
import java.util.Formatter;

public class filme {

    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);

        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double aumento = ((B-A) / A) * 100.0;
        System.out.println(String.format("%.2f%%", aumento));
    }

}