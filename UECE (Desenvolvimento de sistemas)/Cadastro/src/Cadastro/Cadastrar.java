package Cadastro;

import javax.swing.JTextField;

public class Cadastrar {
   
   private String nome;
   private String nomeMae;
   private String nomePai;
   private String estadocivil;
   private String naturalidade;
   private String profissao;
   private String escolaridade;
   private String sexo;
   private String etnia;
   private double RG;
   private double CPF;
   private double celular;
   private double salario;
   private double CEP;
   private String cidade;
   private String logradouro;
   private String complemento;
   private double numero;
   private String bairro;
   
   public String getNome(){
     return nome;}
   
   public void setNome(String nome){
     this.nome = nome;}
     
   public String getNomeMae(){
     return nomeMae;}
   
   public void setNomeMae(String nomeMae){
     this.nomeMae = nomeMae;}
   
   public String getNomePai(){
     return nomePai;}
   
   public void setNomePai(String nomePai){
     this.nomePai = nomePai;}
     
   public String getEstadocivil(){
     return estadocivil;}
   
   public void setEstadocivil(String estadocivil){
     this.estadocivil = estadocivil;}
    
    public String getNaturalidade(){
     return naturalidade;}
   
    public void setNaturalidade(String naturalidade){
     this.naturalidade = naturalidade;}
     
    public String getProfissao(){
      return profissao;}
   
    public void setProfissao(String profissao){
      this.profissao = profissao;}
      
     public String getEscolaridade(){
     return escolaridade;}
   
    public void setEscolaridade(String escolaridade){
     this.escolaridade = escolaridade;}
     
    public String getSexo(){
     return sexo;}
   
    public void setSexo(String sexo){
     this.sexo = sexo;}
     
    public String getEtnia(){
     return etnia;}
   
    public void setEtnia(String etnia){
     this.etnia = etnia;}
     
    public double getRG(){
       return RG;}
     
    public void setRG(double RG)
     {this.RG = RG;}
     
    public double getCPF(){
       return CPF;}
     
    public void setCPF(double CPF)
     {this.CPF = CPF;}
    
    public double getSalario(){
       return salario;}
     
    public void setSalario(double salario)
     {this.salario = salario;}
    
    public double getCelular(){
       return celular;}
     
    public void setCelular(double celular)
     {this.celular = celular;}
     
    public double getCEP(){
       return CEP;}
     
    public void setCEP(double CEP)
     {this.CEP = CEP;}
    
    public String getCidade(){
      return cidade;}
      
    public void setCidade(String cidade){
      this.cidade = cidade;}
     
    public String getLogradouro(){
      return logradouro;}
      
    public void setLogradouro(String logradouro){
      this.logradouro = logradouro;}
      
    public String getComplemento(){
      return complemento;}
      
    public void setComplemento(String complemento){
      this.complemento = complemento;}
      
    public String getBairro(){
      return bairro;}
      
    public void setBairro(String bairro){
      this.bairro = bairro;}
      
     public double getNumero(){
       return numero;}
     
     public void setNumero(double numero)
     {this.numero = numero;}
     
     public double CalcularSalario() {
        if (sexo.equalsIgnoreCase("Feminino")) {
            if (escolaridade.equalsIgnoreCase("Ensino medio") || escolaridade.equalsIgnoreCase("Graduacao") || escolaridade.equalsIgnoreCase("Mestrado") || escolaridade.equalsIgnoreCase("Doutorado")) {
                return this.salario + (this.salario / 100) * 10 + 200;
           } else {
               return this.salario + 200;
            }} 
        else {
            if (escolaridade.equalsIgnoreCase("Ensino medio") || escolaridade.equalsIgnoreCase("Graduacao") || escolaridade.equalsIgnoreCase("Mestrado") || escolaridade.equalsIgnoreCase("Doutorado")){
                return this.salario + (this.salario / 100) * 10;}
            else{
                return this.salario;}
        }

    }

}