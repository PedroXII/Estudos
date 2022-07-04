package programaçâo_orientada_ao_objeto;

public class POO {
    
    public String nome;
    public String sobrenome;
    public double altura;
    public double peso;
    
    public void setNome(String nome){
    this.nome = nome;}
    
    public String getNome(){
    return nome;}
    
    public void setSobrenomeome(String sobrenome){
    this.sobrenome = sobrenome;}
    
    public String getSobrenome(){
    return sobrenome;}
    
    public void setAltura(double altura){
    this.altura = altura;}
    
    public double getAltura(){
    return altura;}
    
    public void setPeso(double peso){
    this.peso = peso;}
    
    public double getPeso(){
    return peso;}
    
    public double IMC(){
        double imc = peso / (altura * altura);
        return imc;}
}
