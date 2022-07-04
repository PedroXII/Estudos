package programação_orientada_ao_objeto;

public class Cachorro {
    
    public String nome;
    public String cor;
    public int peso;
    public double altura;

    public void setPeso(int peso){
        this.peso = peso;
    }
    
    public int getPeso(){
        return peso;
    }
    
    public String getCor(){
        return cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String latir(){
        return "Au, AU";
    }
    public String calcularPeso(){
    if(this.peso > 15){
        return "Obeso";}
    else {
    return "Não obeso.";}}
    
    public void setAltura(double altura){
    this.altura = altura;} 
 
    public double getAltura(){
    return altura;}
    
    public String calcularAltura(){
    if(this.altura > 0.50){
        return "Alto.";}
    else {
    return "Baixo.";}}
    
}
