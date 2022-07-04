package scan;
import java.util.Scanner;
public class Scan {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Quantas vezes a palavra 'sol' será escrita?");
        int times = read.nextInt();
        int x = 0;
        
        while (x < times){
        System.out.println("Sun.");
        x++;}
        System.out.println("A palavra 'Sun' foi escrita "+ times +" vezes.");
    }
    
}
