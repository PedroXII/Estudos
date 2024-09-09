import java.util.LinkedList;

public class Palavra {
    private String palavra;
    private LinkedList<Integer> ocorrencias = new LinkedList<>();
    private int numeroDeOcorrencias;

    public Palavra(String palavra, int numeroDeOcorrencias) {
        this.palavra = palavra;
        this.numeroDeOcorrencias = numeroDeOcorrencias;
        this.ocorrencias = new LinkedList<>();
    }

    public String getPalavra(){
        return palavra;
    }

    public void adicionarOcorrencia(int linha) {
        ocorrencias.add(linha);
    }

    public LinkedList<Integer> getOcorrencias(){
        return ocorrencias;
    }

    public int getNumeroDeOcorrencias(){
        return numeroDeOcorrencias;
    }

    public void setNumeroDeOcorrencias(int numeroDeOcorrencias){
        this.numeroDeOcorrencias = numeroDeOcorrencias;
    }
}
