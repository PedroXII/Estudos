package controllers.cadastropessoasinterface;

public class Pessoa {

    private String nome;
    private String email;
    private int idade;
    private String cpf;
    private double peso;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculaImc() {
        return this.peso / (this.altura * this.altura);
    }

    public String exibirImc() {

        if (calculaImc() < 18.5) {
            return "Peso baixo";
        } else if (calculaImc() >= 18.5 && calculaImc() <= 24.9) {
            return "Peso normal";
        } else if (calculaImc() >= 25 && calculaImc() <= 29.9) {
            return "Sobrepeso";
        } else if (calculaImc() >= 30 && calculaImc() <= 34.9) {
            return "Obesidade (Grau I)";
        } else if (calculaImc() >= 35.00 && calculaImc() <= 39.9) {
            return "Obesidade Severa (Grau II)";
        } else {
            return "Obesidade Morbida (Grau III)";
        }
    }

}
