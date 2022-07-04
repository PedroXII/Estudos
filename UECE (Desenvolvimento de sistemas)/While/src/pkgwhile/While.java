package pkgwhile;
import java.util.Scanner;
public class While {

    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Digite um número menor que 100.");
    int x = read.nextInt();
    if (x < 100){
        while(x < 100){
        System.out.println(x);
        x++;}}
    else{
        System.out.println("Você não digitou um número menor que 100.");}
    }
    
}
