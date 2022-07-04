package PainelImageFundo;

public class SorteioClass {
    
    private int numerosecreto;
    private int tentativa;
    private int ntry;
    private boolean permissao;

    public boolean isPermissao() {
        return permissao;
    }

    public void setPermissao(boolean permissao) {
        this.permissao = permissao;
    }

    public int getNtry() {
        return ntry;
    }

    public void setNtry(int ntry) {
        this.ntry = ntry;
    }

    public int getNumerosecreto() {
        return numerosecreto;
    }

    public void setNumerosecreto(int numerosecreto) {
        this.numerosecreto = numerosecreto;
    }

    public int getTentativa() {
        return tentativa;
    }

    public void setTentativa(int tentativa) {
        this.tentativa = tentativa;
    }
}
