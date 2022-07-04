package vetores;
import java.util.Scanner;
public class Vetores {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i = 0; i < num.length; i++){
            if (num[i] % 2 != 0){
                System.out.println("Impar: "+ num[i]);}
            else if (num[i] % 2 == 0){
                System.out.println("Par: "+ num[i]);}}
        for (int x = 0; x < num.length; x++){
            if (num[x] % 2 != 0){
                int par[] = new int[x];}
            else if (num[x] % 2 == 0){
                int impar[] = new int[x];}}
}}