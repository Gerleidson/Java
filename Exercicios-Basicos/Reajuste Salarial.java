package oo.intelij;

import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    String Colaborador;
    int resp, salario, salfinal;
    float abono, perc;

        resp = 1;  perc = 7.5F; abono = 150;

        while (resp == 1) {
            double reajuste = 0;
            System.out.println("=========================================================");
            System.out.println("Empresa: DevSoft Ltda.\n Nome: Gerleidson a. Bomfim");
            System.out.println("Digite nome do colaborador: ");
            Colaborador = scanner.next();
            System.out.println("Digite salario do colaborador: ");
            salario = scanner.nextInt();
            System.out.println("=========================================================");
            reajuste = (salario * perc) / 100;
            if (salario <= 1750) {
                salfinal = (int) (salario + abono + reajuste);
                System.out.println("Reajuste Salarial: " + reajuste);
                System.out.println("Abono Salarial: " + abono);
                System.out.println("Possivel Salario: " + salfinal);

            } else {
                salfinal = (int) (salario + abono);
                System.out.println("Reajuste Salarial: " + reajuste);
                System.out.println("Possivel salario: " + salfinal);
            }
        }
    }
    }