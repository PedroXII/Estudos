package programação_orientada_ao_objeto.pessoas;

public class Pessoas {

    public String nome;
    public int idade;

    public void setNome (String nome){
    this.nome = nome;}
    
    public String getNome(){
    return nome;}
    
    public void setIdade (int idade){
    this.idade = idade;}
    
    public int getIdade(){
    return idade;}
    
    public String calcularIdade(){
        if(this.idade < 18){
        return "Menor de idade.";}
        else {
        return "Maior de idade.";}}
}
