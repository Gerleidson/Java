import java.util.Scanner;
public class FusoHorario {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int hPartida, tempo, hFuso, hChegada;

        hPartida = leitor.nextInt();

        tempo = leitor.nextInt();

        hFuso = leitor.nextInt();

        hChegada = hPartida + tempo + hFuso;

        if (hChegada > 24){

            hChegada = hChegada - 24;

        }else if (hChegada < 0) {

            hChegada = 24 - Math.abs(hChegada);

        }else if (hChegada == 24){

            hChegada = 0;

        }

        System.out.println(hChegada);

        leitor.close();

    }
}