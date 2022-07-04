package jogador_de_futebol;

public class Jogador_de_Futebol {

    public static void main(String[] args) {
        Jogador p1 = new Jogador(8000);
        
        p1.setNome ("Ronaldo");
        p1.setPosiçao("Atacante");
        p1.setAnon(1993);
        p1.setNacionalidade("Português");
        p1.setAltura(1.90);
        p1.setPeso(78.5);
        p1.Show();
    }
}