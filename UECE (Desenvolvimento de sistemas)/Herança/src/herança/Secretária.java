package herança;

public class Secretária extends Funcionário{
    
    private int telefone;
    private String email;

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public void aumento (int porcentagem){
        super.aumento(porcentagem);}
    
    @Override
    public String imprimir (){
        return super.imprimir() + "\nEmail: " + this.email + "\nTelefone: " + this.telefone;}
    
    public void FazerLigaçao(){
        System.out.println("Ligação realizada.");}
    
    public void Agendamento(int dia, String mes){
        System.out.println("Agendada para o dia: " + dia + ", do mes: " + mes);}
}
