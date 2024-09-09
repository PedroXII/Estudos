import java.util.HashMap;
import java.util.LinkedList;

public class TabelaHash {
    private HashMap <Character, LinkedList<Palavra>> indice =  new HashMap<Character, LinkedList<Palavra>>();
    private char primeiraLetra;
    private LinkedList<Palavra> listaDePalavrasComMesmaInicial;

    public void adicionarPalavra(String palavra, int linha){
        palavra = palavra.toUpperCase();
        this.primeiraLetra = Character.toUpperCase(palavra.charAt(0));
        listaDePalavrasComMesmaInicial= indice.get(primeiraLetra);
        //Adicionar ocorrências.
        for(Palavra i: this.listaDePalavrasComMesmaInicial){
            if(i.getPalavra().equalsIgnoreCase(palavra)){
                i.adicionarOcorrencia(linha);
                i.setNumeroDeOcorrencias(i.getNumeroDeOcorrencias()+1);
                return;
            }
        }
        //Adicionar novas palavras.
        Palavra novaPalavra = new Palavra(palavra, 1);
        novaPalavra.adicionarOcorrencia(linha);
        this.listaDePalavrasComMesmaInicial.add(novaPalavra);
        //ordenarListasDePalavras();
    }

    public Palavra buscarPalavra(String palavra){
        Character primeiraLetra = Character.toUpperCase(palavra.charAt(0));
        listaDePalavrasComMesmaInicial = indice.get(primeiraLetra);
        for(Palavra i: listaDePalavrasComMesmaInicial){
            if(i.getPalavra().equals(palavra)){
                return i;
            }
        }
        return null;
    }

    public void gerarIndice(){
        for(char i = 'A'; i <= 'Z'; i++){
            indice.put(i,new LinkedList<Palavra>());
        }
    }

    //Para organização e/ou funcionalidades futuras, pode ser desativado sem comprometer
    //as funcionalidades, recomendado para uma melhor perfomance.
    /*public void ordenarListasDePalavras(){
        for(char i = 'A'; i <= 'Z'; i++){
            listaDePalavrasComMesmaInicial = indice.get(i);
            int size = listaDePalavrasComMesmaInicial.size();
            boolean trocado;
            for (int x = 0; x < size - 1; x++) {
                trocado = false;
                for (int y = 0; y < size - 1 - x; y++) {
                    if ((listaDePalavrasComMesmaInicial.get(y).getPalavra()).compareToIgnoreCase(listaDePalavrasComMesmaInicial.get(y+1).getPalavra()) > 0) {
                        Palavra z = listaDePalavrasComMesmaInicial.get(y);
                        listaDePalavrasComMesmaInicial.set(y, listaDePalavrasComMesmaInicial.get(y + 1));
                        listaDePalavrasComMesmaInicial.set(y + 1, z);
                        trocado = true;
                    }
                }
                if (!trocado){
                    break;
                }
            }
        }
    }*/
}
