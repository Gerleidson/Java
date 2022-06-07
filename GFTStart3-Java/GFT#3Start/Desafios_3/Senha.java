import java.io.IOException;
import java.util.Scanner;

public class Senha {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int senha;
        while (true) {
            senha = leitor.nextInt();
            if (senha == 2002){
                System.out.println("Acesso Permitido");
                break;
            }
            else System.out.println("Senha Invalida");
        }
    }
}