package verificador_de_maiores_de_idade;

public class Verificador_de_Maiores_de_Idade {

    public static void main(String[] args) {
        int idades[] = {10, 15, 13, 20, 45, 18, 13, 19, 20, 30};
        int total = 0;
        for (int i = 0; i < idades.length; i++){
            if (idades[i] >= 18){
                total++;}}
         for (int x = 0; x < idades.length; x++){
            System.out.println("Idade "+ x +": "+ idades[x]);}
    System.out.println("Há "+ total +" pessoas maiores de idade no grupo.");
    }
    
}
