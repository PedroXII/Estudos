package veiculos;

public class Caminhao extends Veiculo{
    
    private int eixos;

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    
    @Override
    public void ExibirDados(){
        super.ExibirDados();
        System.out.println("Eixos do caminhao: " + this.eixos);}
}
