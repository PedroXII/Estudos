package herança;

public class Funcionário {
    
    private double salario;
    private String nome;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void aumento(int porcentagem){
        this.salario += this.salario * porcentagem/100;}
    
    public String imprimir(){
        return "Nome: " + this.nome + "\nSalário: " + this.salario;}
}
