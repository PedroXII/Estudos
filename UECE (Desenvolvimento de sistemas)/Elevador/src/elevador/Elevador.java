package elevador;

public class Elevador {

    private int andar_atual;
    private int andar_total;
    private int capacidade;
    private int pessoas_presentes;
    private int movimento;
    private int fluxo;

    public int getFluxo() {
        return fluxo;
    }

    public void setFluxo(int fluxo) {
        this.fluxo = fluxo;
    }

    public int getAndar_atual() {
        return andar_atual;
    }

    public void setAndar_atual(int andar_atual) {
        this.andar_atual = andar_atual;
    }

    public int getAndar_total() {
        return andar_total;
    }

    public void setAndar_total(int andar_total) {
        this.andar_total = andar_total;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoas_presentes() {
        return pessoas_presentes;
    }

    public void setPessoas_presentes(int pessoas_presentes) {
        this.pessoas_presentes = pessoas_presentes;
    }

    public int getMovimento() {
        return movimento;
    }

    public void setMovimento(int movimento) {
        this.movimento = movimento;
    }
    
    public void Subir(){
        if (this.andar_atual < 40 && this.andar_atual + this.movimento < 40){
            this.setAndar_atual(this.andar_atual += this.movimento);}}
    
    public void Descer(){
        if (this.andar_atual > 0 && this.andar_atual - this.movimento < 0){
            this.setAndar_atual(this.andar_atual -= this.movimento);}}
    
    public void Entrar(){
        if (this.pessoas_presentes < 20 && this.fluxo + this.pessoas_presentes <= 20){
            this.setPessoas_presentes(this.pessoas_presentes += this.fluxo);}}
    
    public void Sair(){
        if (this.pessoas_presentes > 0 && this.fluxo - this.pessoas_presentes <= 0){
            this.setPessoas_presentes(this.pessoas_presentes -= this.fluxo);}}
    
    public void Iniciar(){
        if (this.pessoas_presentes > 0){
            System.out.println("O elevador funcionou.\nPessoas presentes: " + this.getPessoas_presentes() + "\nAndar atual: " + this.getAndar_atual() + "\nAndares percorridos: " + this.movimento + "\nTotal de andares: " + this.andar_total + "\nCapacidade: " + this.capacidade);}
        else{
            System.out.println("O elevador nao funcionou.");}}
    
}

