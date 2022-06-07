import java.io.IOException;
import java.util.Scanner;

public class notacaoCientifica {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        Scanner X = leitor.nextDouble();
        System.out.println(String.format((String.value0f(X).startWith("-") ? "" : "+") + "%.6E" , X ));

    }

}