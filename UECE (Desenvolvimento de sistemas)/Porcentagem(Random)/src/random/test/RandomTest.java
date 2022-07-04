package random.test;
import java.util.Scanner;
import java.util.Random;

public class RandomTest {

    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    Random crazy = new Random();
    
    int W = 15, X = 40, Y = 50, Z = 70;
    int porcentagem = crazy.nextInt(100);
    System.out.println("W = 15%\nX = 40%\nY = 50%\nZ = 70%\nDigite o escolhido: ");
    String choose = read.next();
    
    if (("W").equalsIgnoreCase(choose)){
        if (porcentagem <= W){
        System.out.println("Você ganhou!\nNúmero ganhador: "+ porcentagem);}
        else{
        System.out.println("Você perdeu...\nNúmero ganhador: "+ porcentagem);}}
    else if (("X").equalsIgnoreCase(choose)){
        if (porcentagem <= X){
        System.out.println("Você ganhou!\nNúmero ganhador: "+ porcentagem);}
        else{
        System.out.println("Você perdeu...\nNúmero ganhador: "+ porcentagem);}}
    else if (("Y").equalsIgnoreCase(choose)){
        if (porcentagem <= Y){
        System.out.println("Você ganhou!\nNúmero ganhador: "+ porcentagem);}
        else{
        System.out.println("Você perdeu...\nNúmero ganhador: "+ porcentagem);}}
    else if (("Z").equalsIgnoreCase(choose)){
        if (porcentagem <= Z){
        System.out.println("Você ganhou!\nNúmero ganhador: "+ porcentagem);}
        else{
        System.out.println("Você perdeu...\nNúmero ganhador: "+ porcentagem);}}
    }
}