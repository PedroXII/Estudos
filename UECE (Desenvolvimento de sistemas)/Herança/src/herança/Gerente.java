package herança;

public class Gerente extends Funcionário {
    
    private int numFuncionarios;

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public void aumento (int porcentagem){
        super.aumento(porcentagem);}
    
    @Override
    public String imprimir (){
        return super.imprimir() + "\nNúmero de funcionarios: " + this.numFuncionarios;}
}
