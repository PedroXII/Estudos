package alg4;
import java.util.Scanner;
public class ALG4 {

    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Ângulo 1: ");
    int x = read.nextInt();
        System.out.println("Ângulo 2: ");
        int y = read.nextInt();
        System.out.println("Ângulo 3: ");
        int z = read.nextInt();
            if (x + y + z != 180){
            System.out.println("O triângulo é inválido, pois a some de seus âgulos não é 180 graus.");}
            else {
            if (x > 90 || y > 90 || z > 90){
            System.out.println("É um triângulo obtusângulo.");}
            else if (x < 90 && y < 90 && z < 90){
            System.out.println("É um triângulo acutângulo.");}
            else{
            System.out.println("É um triângulo retângulo.");}

    }
    }
    
}
