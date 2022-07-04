
package pkgnew;
import java.util.Scanner;

public class New {

    public static void main(String[] args) {
    int size = 2, i, s;    
    String aluno[] = new String[size];
    Scanner read = new Scanner(System.in);
    double nota[] = new double[size];
    for (i = 0; i < size; i++){
    System.out.println("Digite o nome do aluno: ");
    aluno[i] = read.next();
    System.out.println("Digite a nota do aluno: ");
    nota[i] = read.nextDouble();}
    
    for (s = 0;s < size;s++){
    if (nota[s] >= 7){
    System.out.println("Aluno: "+ aluno);
    System.out.println("Nota: "+ nota);}}
    }
    
}
