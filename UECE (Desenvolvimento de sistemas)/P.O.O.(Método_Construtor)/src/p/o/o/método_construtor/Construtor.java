package p.o.o.método_construtor;

public class Construtor {
    
    private String nome;
    private int anon;
    private double altura;
    
    public Construtor(String nome, int anon, double altura){
    this.nome = nome;
    this.anon = anon;
    this.altura = altura;}
    
    public int Idade(){
    return 2021 - anon;}
    
    public void Show(){
    System.out.println("Nome: "+ this.nome);
    System.out.println("Ano de nascimento: "+ this.anon);
    System.out.println("Altura: "+ this.altura);
    System.out.println("Idade: pelo menos, "+ Idade() +" anos.");}
}