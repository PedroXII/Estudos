package jogador_de_futebol;

public class Jogador {
    
    private String nome;
    private String posiçao;
    private int anon;
    private String nacionalidade;
    private double altura;
    private double peso;
    private double salario;
    
    public void setNome(String nome){
    this.nome = nome;}
    
    public String getNome(){
    return nome;}
    
    public void setPosiçao(String posiçao){
    this.posiçao = posiçao;}
    
    public String getPosiçao(){
    return posiçao;}
    
    public void setAnon(int anon){
    this.anon = anon;}
    
    public int getAnon(){
    return anon;}
    
    public void setNacionalidade(String nacionalidade){
    this.nacionalidade = nacionalidade;}
    
    public String getNacionalidade(){
    return nacionalidade;}
    
    public void setAltura(double altura){
    this.altura = altura;}
    
    public double getAltura(){
    return altura;}
    
    public void setPeso(double peso){
    this.peso = peso;}

    public double getPeso(){
    return peso;}
    
    public Jogador(double salario){
    this.salario = salario + 4000;}
    
    public void Show(){
    System.out.println("Nome: "+ this.nome);
    System.out.println("Posição: "+ this.posiçao);
    System.out.println("Ano de nascimento: "+ this.anon);
    System.out.println("Nacionalidade: "+ this.nacionalidade);
    System.out.println("Altura: "+ this.altura);
    System.out.println("Peso: "+ this.peso);
    System.out.println("Idade: pelo menos, " + Idade() + " anos.");
    System.out.println("Faltando para aposentadoria: "+ Aposentadoria());
    System.out.println("Salário atual: "+ this.salario);}
    
    public int Idade(){
    return 2021 - anon;}
    
    public int Aposentadoria(){
    if ((this.posiçao).equalsIgnoreCase("Atacante")){
        if (Idade() >= 35){
            System.out.println("Você já está aposentado.");}
        else{return 35 - Idade();}}
    if ((this.posiçao).equalsIgnoreCase("Meio-Campo")){
        if (Idade() >= 38){
        System.out.println("Você já está aposentado.");}
        else{return 38 - Idade();}}
    if ((this.posiçao).equalsIgnoreCase("Defesa")){
        if (Idade() >= 40){
            System.out.println("Você já está aposentado.");}
        else{return 40 - Idade();}}
        return 0;}
    }
