package locaçao;

public class Locaçao {

    public static void main(String[] args) {
        
        Filme i1 = new Filme();
        i1.setCategoria("Infantil");
        i1.setTitulo("Peppa Pig");
        i1.setPreco(4);
        i1.ValorTotal();
        i1.Print();
        System.out.println("\n");
        
        Filme l1 = new Filme();
        l1.setCategoria("Lancamento");
        l1.setTitulo("Viuva Negra");
        l1.setPreco(4);
        l1.ValorTotal();
        l1.Print();
        System.out.println("\n");
        
        Filme p1 = new Filme();
        p1.setCategoria("Promocao");
        p1.setTitulo("Lanterna Verde");
        p1.setPreco(4);
        p1.ValorTotal();
        p1.Print();
        System.out.println("\n");
        
        Filme g1 = new Filme();
        g1.setCategoria("Geral");
        g1.setPreco(4);
        g1.setTitulo("Vigadores: Ultimato");
        g1.ValorTotal();
        g1.Print();
    }
    
}
