package veiculos;

public class Veiculo {
    
    private String placa;
    private int ano;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void ExibirDados(){
        System.out.println("Ano do veiculo: " + this.ano + "\nPlaca do veiculo: " + this.placa);}
}
