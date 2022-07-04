package programação_orientada_ao_objeto.pessoas;

public class Programação_Orientada_ao_ObjetoPessoas {

    public static void main(String[] args) {
    Pessoas p1 = new Pessoas();
    Pessoas p2 = new Pessoas();
    
    p1.setNome("Pedro");
    p1.setIdade(20);
    
    p2.setNome("Carol");
    p2.setIdade(15);
    
    System.out.println("Nome: "+ p1.getNome() +"\nIdade: "+ p1.getIdade() +"\n" + p1.calcularIdade() + "\n");
    System.out.println("Nome: "+ p2.getNome() +"\nIdade: "+ p2.getIdade() +"\n" + p2.calcularIdade() + "\n");
    }
}
