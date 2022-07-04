package primeiros_6_meses;
import java.util.Scanner;
public class Primeiros_6_meses {

    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Qual mês, dos 6 primeiros: ");
    int x = read.nextInt();
    switch (x){
    case 1:
    System.out.println("Janeiro.");
    break;
    case 2:
    System.out.println("Fevereiro.");
    break;
    case 3:
    System.out.println("Março.");
    break;
    case 4:
    System.out.println("Abril.");
    break;
    case 5:
    System.out.println("Maio.");
    break;
    case 6:
    System.out.println("Junho.");
    break;
    default:
    System.out.println("Mes inválido.");}
}
}