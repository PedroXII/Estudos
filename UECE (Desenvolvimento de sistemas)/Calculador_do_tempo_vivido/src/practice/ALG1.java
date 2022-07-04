
package practice;
import java.util.Scanner;
public class ALG1 {
    
       public static void main(String[] args){
       //Obs: as variaveis anoa,mesa e diaa devem ser atualizados antes do uso para um resultado preciso.
       int dia = 1, mes = 30, anoa = 2021, mesa = 6, diaa = 10;
       double ano = 365.25;
       Scanner scan = new Scanner(System.in);
       System.out.println("Dia de nascimento: ");
       int dian = scan.nextInt();
       System.out.println("Mês de nascimento: ");
       int mesn = scan.nextInt();
       System.out.println("Ano de nascimento: ");
       int anon = scan.nextInt();
       double born = (mes - dian) + (ano - mesn * 30) + (anoa - anon - 1) * ano + (mesa * 30) + diaa;
       double x = born / 7;
       double y = born / 30;
       double z = born / ano;
       System.out.println("A pessoa viveu, aproximadamente\nDias: "+ born +"\nSemanas: "+ x +"\nMeses: "+ y +"\nAnos: "+ z);
       }
}
