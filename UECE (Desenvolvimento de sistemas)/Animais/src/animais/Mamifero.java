package animais;

public class Mamifero extends Animal {
    
    private String alimento;

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    
    @Override
        public String Print(){
        return super.Print() + "\nAlimento: " + this.alimento;}
}