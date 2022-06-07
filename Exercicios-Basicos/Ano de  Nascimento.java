import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int idade;
        int ano;
        int anoatual;
        String nome;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite Sua idade: ");
        idade = sc.nextInt();

        System.out.println("Digite ano atual: ");
        anoatual = sc.nextInt();

        ano = anoatual - idade;

        System.out.println("O nome é: "+ nome);
        System.out.println("A sua idade é: "+ idade);
        System.out.println("O ano atual é: "+ anoatual);
        System.out.println("O ano de nascimento é: "+ ano);

    }
}
