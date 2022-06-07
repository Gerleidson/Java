import java.io.IOException;
import java.util.Scanner;

public class padre {
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        while (leitor.hasNext()) {

            // alfabeto utilizado
            String alphabet = leitor.next();

            //quantidade letras acionadas
            int letters = leitor.nextInt();

            // mensagem passada
            String word = "";

            for ( int i = 1; i <= letters; i++ ) {
                // receber cada lampada acionada
                int lamps = leitor.nextInt();

                // acrescenta a letra da posição na string
                // lembrando que toda String é uma array
                // que inicia no indice 0 ( zero )
                word += alphabet.substring(lamps-1 , lamps);
            }
            System.out.println( word );
        }
    }

}