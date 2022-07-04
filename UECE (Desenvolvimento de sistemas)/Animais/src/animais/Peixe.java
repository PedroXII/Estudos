package animais;

public class Peixe extends Animal{
    
    private String caracteristica;

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    
    @Override
    public String Print(){
        return super.Print() + "\nCaracteristica: " + this.caracteristica;}
}
