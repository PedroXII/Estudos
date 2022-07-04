package pkgfor;
import java.util.Scanner;
public class For {

    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Quantidade de produtos comprados: ");
    int qprod = read.nextInt();
    double valor[] = new double[qprod];
    double valortotal = 0;
    
    for (int i = 0; i < valor.length; i++){
        System.out.println("Valor do "+ i +"º produto: ");
        valor[i] = read.nextDouble();}
    for (int x = 0; x < valor.length; x++){
        valortotal = valortotal + valor[x];}
    System.out.println("Você gastou: "+ valortotal +"\nEm "+ qprod +" produtos.");
    }
}