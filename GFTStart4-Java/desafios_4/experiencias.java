import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int ratos=0,coelhos=0,sapos=0;
        int quantidadeDeInputs=input.nextInt();
        Double totalDeAnimais = 0.0;

        //Escreva o seu código aqui
        input.nextLine();

        for (int i = 0; i < quantidadeDeInputs; i++) {
            String casoTeste[] = input.nextLine().split(" ");
            char animal = casoTeste[1].charAt(0);
            int quantidade = Integer.parseInt(casoTeste[0]);
            totalDeAnimais += quantidade;
            switch (animal) {
                case 'R':
                    ratos += quantidade;
                    break;
                case 'C':
                    coelhos += quantidade;
                    break;
                case 'S':
                    sapos += quantidade;
                    break;
            }
        }

        Double percentualCoelhos = coelhos / totalDeAnimais;
        Double percentualRatos = ratos / totalDeAnimais;
        Double percentualSapos = sapos / totalDeAnimais;

        DecimalFormat format = new DecimalFormat("0.00 %");

        System.out.printf("Total: %.0f cobaias\n", totalDeAnimais);
        System.out.printf("Total de coelhos: %d\n", coelhos);
        System.out.printf("Total de ratos: %d\n", ratos);
        System.out.printf("Total de sapos: %d\n", sapos);
        System.out.printf("Percentual de coelhos: %s\n", format.format(percentualCoelhos));
        System.out.printf("Percentual de ratos: %s\n", format.format(percentualRatos));
        System.out.printf("Percentual de sapos: %s\n", format.format(percentualSapos));

        input.close();

    }
}