package try_and_catch;
import java.util.Scanner;
import java.util.Arrays;
public class Try_and_Catch {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        try {System.out.println("Digite o tamanho do vetor: ");
        int size = read.nextInt();
        int vet[] = new int[size];
        System.out.println("\nDigite somente números inteiros e não se preocupe com a ordem, pois seu \nvetor poderá ser ordenado do menor pro maior ordenado após a criação.\n");
        for (int i = 0; i < vet.length; i++){
            System.out.println("Digite um número inteiro: ");
            vet[i] = read.nextInt();}
        System.out.println("\nDeseja que o vetor seja ordenado?\nResponda com 'Sim' ou 'Nao'.");
        String resposta = read.next();
        if (resposta.equalsIgnoreCase("Sim")){
            Arrays.sort(vet);
                System.out.println("\nSeu vetor foi ordenado do menor pro maior.\n");
            for (int x = 0; x < vet.length; x++){
                System.out.println("Posição[" + x + "] tem valor: " + vet[x]);}}
        if (resposta.equalsIgnoreCase("Nao")){
            for (int y = 0; y < vet.length; y++){
                System.out.println("Posição[" + y + "] tem valor: " + vet[y]);}}
        else{
            System.out.println("Resposta Inválida, reinicie o algoritmo.");}}
        catch (Exception a) {
            System.out.println("Resposta inválida, reinicie o algoritmo.");}
    }
    
}
