package programaçâo_orientada_ao_objeto;
import java.util.Scanner;
public class Programaçâo_Orientada_ao_Objeto {

    public static void main(String[] args) {
        POO p1 = new POO();
        p1.nome = "Maria";
        p1.sobrenome = "Alencar";
        p1.altura = 1.60;
        p1.peso = 68.50;
        
        Scanner read = new Scanner(System.in);
        POO p2 = new POO();
        System.out.println("Nome: ");
        String x = read.next();
        System.out.println("Sobrenome: ");
        String y = read.next();
        System.out.println("Altura: ");
        double z = read.nextDouble();
        System.out.println("Peso: ");
        double w = read.nextDouble();
        
        p2.nome = x;
        p2.sobrenome = y;
        p2.altura = z;
        p2.peso = w;
        
        System.out.println("Pessoa 1\nNome: "+ p1.getNome() +" "+ p1.getSobrenome() +"\nAltura: "+ p1.getAltura() +"\nPeso: " + p1.getPeso() + "\nIMC: " + p1.IMC() + "\n");
        System.out.println("Pessoa 2\nNome: "+ p2.getNome() +" "+ p2.getSobrenome() +"\nAltura: "+ p2.getAltura() + "\nPeso: " + p2.getPeso() + "\nIMC: " + p2.IMC());
    }   
}