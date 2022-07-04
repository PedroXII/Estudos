package operações_matemáticas.pkginterface;

public class Operações implements Operações_Interface {
    
    private int adiçao;
    private int subtraçao;
    private double divisao;
    private int multiplicaçao;

    public int getAdiçao() {
        return adiçao;
    }

    public void setAdiçao(int adiçao) {
        this.adiçao = adiçao;
    }

    public int getSubtraçao() {
        return subtraçao;
    }

    public void setSubtraçao(int subtraçao) {
        this.subtraçao = subtraçao;
    }

    public double getDivisao() {
        return divisao;
    }

    public void setDivisao(double divisao) {
        this.divisao = divisao;
    }

    public int getMultiplicaçao() {
        return multiplicaçao;
    }

    public void setMultiplicaçao(int multiplicaçao) {
        this.multiplicaçao = multiplicaçao;
    }

    @Override
    public void Num(int x, int y) {
        this.adiçao = x + y;
        this.subtraçao = x - y;
        this.multiplicaçao = x * y;
        this.divisao = x / y;
        System.out.println(x + " + " + y + " = " + this.getAdiçao() + "\n" + x + " - " + y + " = " + this.getSubtraçao() + "\n" + x + " * " + y + " = " + this.getMultiplicaçao() + "\n" + x + " / " + y + " = " + this.getDivisao());
    }
    
    
}
