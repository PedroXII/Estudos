package ingressos;

public class Ingresso {
    
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String Print(){
        return "Valor do ingresso: " + this.valor;}
    

}
