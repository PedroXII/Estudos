package ingressos;

public class IngressoVIP extends Ingresso{
    
    private double diferenca;

    public double getDiferenca() {
        return diferenca;
    }

    public void setDiferenca(double diferenca) {
        this.diferenca = diferenca;
    }
    
    public double ValorVIP(){
       return super.getValor() + this.diferenca;}
    
    @Override
    public String Print(){
        return "Valor do ingresso VIP: " + ValorVIP();}
    }
