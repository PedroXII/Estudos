package numero.impar_ou_par_conjunto;
import java.util.Scanner;
public class NumeroImpar_ou_par_conjunto {

    public static void main(String[] args) {
    int i, x;
    Scanner read = new Scanner(System.in);
    System.out.println("Quantidade de números: ");
    int num = read.nextInt();
    int con[] = new int[num];
    for (i = 0; i < num; i++){
    System.out.println("Numero "+ i +" : ");
    con[i] = read.nextInt();}
    for (x = 0; x < num; x++){
    if (con[x] % 2 == 0){System.out.println(con[x]);
    }}
    }
    
}
