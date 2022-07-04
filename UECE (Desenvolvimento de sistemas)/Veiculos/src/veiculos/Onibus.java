package veiculos;

public class Onibus extends Veiculo{
    
    private int assentos;

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    
    @Override
    public void ExibirDados(){
        super.ExibirDados();
        System.out.println("Assentos do onibus: " + this.assentos);}
}
