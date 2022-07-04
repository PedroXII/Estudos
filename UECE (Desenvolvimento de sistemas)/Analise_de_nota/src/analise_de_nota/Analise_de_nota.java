package analise_de_nota;
import java.util.Scanner;
public class Analise_de_nota {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Nota: ");
        double nota = read.nextDouble();
        if (nota >= 7 && nota <= 10){
            System.out.println("Passou.");}
        else if (nota <= 7 && nota >= 4){
            System.out.println("Recuperação.");}
        else if (nota < 4){
            System.out.println("Reprovado.");}
        else{
        System.out.println("Nota inválida.");}
    }
}
