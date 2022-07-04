package animais;

public class Animais {

    public static void main(String[] args) {
        
        Mamifero m1 = new Mamifero();
        m1.setNome("Camelo");
        m1.setComprimento(1.5);
        m1.setPatas(4);
        m1.setCor("Amarelo");
        m1.setAmbiente("Terra");
        m1.setAlimento("Herbivoro");
        m1.setVelocidade(0.5);
        System.out.println(m1.Print() + "\n");
        
        Peixe p1 = new Peixe();
        p1.setNome("Tubarão");
        p1.setComprimento(3);
        p1.setPatas(0);
        p1.setCor("Cinzento");
        p1.setAmbiente("Mar");
        p1.setVelocidade(1.5);
        p1.setCaracteristica("Barbatanas e Cauda");
        System.out.println(p1.Print() + "\n");
        
        Mamifero m2 = new Mamifero();
        m2.setNome("Urso-do-Canada");
        m2.setComprimento(1.8);
        m2.setPatas(4);
        m2.setCor("Vermelho");
        m2.setAmbiente("Terra");
        m2.setVelocidade(0.5);
        m2.setAlimento("Mel");
        System.out.println(m2.Print() + "\n");
    }
    
}