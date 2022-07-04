package alg3;
import java.util.Scanner;
public class Alg3 {

    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Lado 1: ");
    float lado1 = read.nextFloat();
    System.out.println("Lado 2: ");
    float lado2 = read.nextFloat();
    System.out.println("Lado 3: ");
    float lado3 = read.nextFloat();
    if (lado1 + lado2 < lado3 || lado1 + lado3 < lado2 || lado2 + lado3 < lado1){
    System.out.println("O triângulo é invalido, pois um lado é maior que a soma dos outros dois.");}
    else if (lado1 == 0 || lado2 == 0 || lado3 == 0){
    System.out.println("O triângulo é inválido, pois nenhum de seus lados pode ser igual a 0.");}
    else{
         if(lado1 == lado2 && lado1 == lado3)
         {System.out.println("É um triângulo equilátero.");}
         else if (lado1 == lado2|| lado1 == lado3 || lado2 == lado3)
         {System.out.println("É um triângulo isósceles.");}
         else{
         System.out.println("É um triângulo escaleno.");}
            }
    }
    
}
