package soma_de_idades;
import java.util.Scanner;
public class Soma_de_Idades {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int grupo[] = new int[2];
        int total = 0;
        for (int i = 0; i < grupo.length; i++){
            System.out.println("Idade "+ i +" : ");
            grupo[i] = read.nextInt();}
        for (int x = 0; x < grupo.length; x++){
            total = total + grupo[x];}
        System.out.println("Juntos o grupo possui: "+ total +" anos.");
    }
}
