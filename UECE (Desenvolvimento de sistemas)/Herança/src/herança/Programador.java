package herança;

public class Programador extends Funcionário{
    
    private String linguagem;
    private int experiencia;
    private String area;
    private String diploma;
    private int projetos;
    private int cafe;

    public int getProjetos() {
        return projetos;
    }

    public void setProjetos(int projetos) {
        this.projetos = projetos;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public String getLinguagem() {
        return linguagem;
    }
    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }
    
    @Override
    public String imprimir (){
        return super.imprimir() + "Linguagem: " + this.linguagem + "\nAnos de experiência: " + this.experiencia + "\nArea: " + this.area + "\nDiploma: " + this.diploma + "\nNúmero de projetos: " + this.projetos;}
    
    @Override
    public void aumento (int porcentagem){
        super.aumento(porcentagem);}
    
    public void Dormir(){
        System.out.println(this.getNome() + " dormiu.");}
    
    public void Cafe(){
        System.out.println(this.getNome() + " bebeu: " + this.cafe +" xícaras de café.");}
}
