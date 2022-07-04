package veiculos;

public class Veiculos {

    public static void main(String[] args) {
        
        Onibus o1 = new Onibus();
        o1.setAno(2015);
        o1.setAssentos(40);
        o1.setPlaca("5F8H2Y3E");
        o1.ExibirDados();
        System.out.println("\n");
        
        Caminhao c1 = new Caminhao();
        c1.setAno(2017);
        c1.setEixos(30);
        c1.setPlaca("5G8T2D3T");
        c1.ExibirDados();
        System.out.println("\n");
    }
    
}
