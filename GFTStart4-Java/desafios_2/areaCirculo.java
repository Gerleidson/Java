
import java.util.Scanner;

public class valorArea {

    public static void main(String[] args) {
        double n=3.14159;
        double raio;
        double area;
        Scanner ler = new Scanner(System.in);
        raio = ler.nextDouble();
        area = n*(raio*raio);
        System.out.println("A="+String.format("%.4f", area));
    }
}
