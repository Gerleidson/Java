import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    double participante, coxinha, media;
    
    participante = scan.nextDouble();
    coxinha = scan.nextDouble();
    
    media = participante / coxinha;

    System.out.printf("%.2f", media);
  }
}