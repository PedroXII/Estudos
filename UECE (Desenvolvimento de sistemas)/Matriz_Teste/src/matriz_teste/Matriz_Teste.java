package matriz_teste;
import java.util.Scanner;
public class Matriz_Teste {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Número de linhas: ");
        int x = read.nextInt();
        System.out.println("Número de colunas: ");
        int y = read.nextInt();
        int matriz[][] = new int [x][y];
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                System.out.println("Digite o valor da linha[" + i + "] coluna[" + j + "]: ");
                matriz [i][j] = read.nextInt();}}
        System.out.println("\n");
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                System.out.println("linha[" + i + "] coluna[" + j + "]: " + matriz[i][j]);}}
    }
}
