package elevador;

public class Elevador_Main {

    public static void main(String[] args) {
        
        Elevador e1 = new Elevador();
        e1.setAndar_atual(4);
        e1.setPessoas_presentes(12);
        e1.setCapacidade(20);
        e1.setAndar_total(40);
        e1.setFluxo(7);
        e1.setMovimento(8);
        e1.Subir();
        e1.Sair();
        e1.Iniciar();
    }
    
}
