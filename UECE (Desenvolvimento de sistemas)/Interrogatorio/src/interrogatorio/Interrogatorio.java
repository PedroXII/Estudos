
package interrogatorio;
import java.util.Scanner;
public class Interrogatorio {

    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Digite 1 para sim e 0 para não.");
    System.out.println("Telefonou para a vítima?");
    int a = read.nextInt();
    System.out.println("Esteve no local do crime? ");
    int b = read.nextInt();
    System.out.println("Mora perto da vítima? ");
    int c = read.nextInt();
    System.out.println("Devia para a vítima? ");
    int d = read.nextInt();
    System.out.println("Já trabalhou com a vítima? ");
    int e = read.nextInt();
    int s = a+b+c+d+e;
    if (s < 2){
    System.out.println("Inocente.");}
    else if (s >+ 2 && s < 4){
    System.out.println("Suspeita.");}
    else if (s == 5){
    System.out.println("Culpada.");}
    else{
    System.out.println("Você respondeu errado.");}
    }
    
}
