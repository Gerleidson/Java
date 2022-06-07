import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String nome = new String();
        float  n1 =  0;
        float  n2 =  0;
        float  n3 =  0;
        float  n4 =  0;

        double total = 0;
        double media = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculando a media aritmetica");
        System.out.println("-----------------------------");
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite a 1 nota: ");
        n1 = sc.nextFloat();

        System.out.println("Digite a 2 nota: ");
        n2 = sc.nextFloat();

        System.out.println("Digite a 3 nota: ");
        n3 = sc.nextFloat();

        System.out.println("Digite a 4 nota: ");
        n4 = sc.nextFloat();

        total = n1+n2+n3+n4;
        media = total/4;

        System.out.println(nome +" a sua media é: " + media );

    }
}
