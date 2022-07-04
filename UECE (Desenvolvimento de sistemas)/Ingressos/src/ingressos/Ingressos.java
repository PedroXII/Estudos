package ingressos;

public class Ingressos {
    
    public static void main(String[] args) {
        
        Ingresso i1 = new Ingresso();
        i1.setValor(10);
        System.out.println(i1.Print());
        
        IngressoVIP i2 = new IngressoVIP();
        i2.setValor(10);
        i2.setDiferenca(5);
        System.out.println(i2.Print());
        
        double diferenca = i2.ValorVIP() - i1.getValor();
        
        System.out.println("Diferenca de preco: " + diferenca);
    }
    
}
