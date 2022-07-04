package alg2;
import java.util.Scanner;
public class ALG2 {

    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Número: ");
    int number = read.nextInt();
    if (number % 2 != 1){
    System.out.println("O número é par.");}
    else {
    System.out.println("O número é impar.");}
    }
    
}
