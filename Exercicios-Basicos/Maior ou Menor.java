package oo.intelij;

public class Main {

    public static void main (String[] args) {

        int valor1 = 10;
        int valor2 = 15;

        if (valor1 > 10 && valor2 > 10) {
            System.out.printf("1) os dois valores sao maiores que 10");
        } else {
            System.out.printf("1) o primmeiro ou segundo nao eh maior que 10");
        }
        if (valor1 > 10 || valor2 > 10) {
            System.out.printf("2) um do numeros eh que 10");
        } else {
            System.out.printf("2) nenhum dos numeros eh maior que 10");
        }
    }
}