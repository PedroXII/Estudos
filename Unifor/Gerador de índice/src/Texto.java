import java.io.*;
import java.text.Normalizer;
import java.util.LinkedList;

public class Texto {
    //Lê o documento com o texto e define as ocorrências de cada palavra.
    public static void processarTexto(String nomeArquivoTexto, TabelaHash tabela) throws IOException {
        BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivoTexto));
        String linha;
        int numeroLinha = 1;

        while ((linha = leitor.readLine()) != null) {
            String[] palavrasNaLinha = linha.split("\\W+");
            for (String palavra : palavrasNaLinha) {
                if (!palavra.isEmpty()) {
                    palavra = palavra.toUpperCase();
                    tabela.adicionarPalavra(palavra.toUpperCase(), numeroLinha);
                }
            }
            numeroLinha++;
        }
        leitor.close();
    }

    //Lê o documento com as palavras-chave.
    public static LinkedList<String> processarPalavrasChave(String nomeArquivoPalavrasChave) throws IOException {
        BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivoPalavrasChave));
        LinkedList<String> listaPalavrasChave = new LinkedList<>();
        String palavraChave;
        while ((palavraChave = leitor.readLine()) != null){
            listaPalavrasChave.add(palavraChave.toUpperCase());
        }
        leitor.close();
        return listaPalavrasChave;
    }

    public static void gerarIndice(LinkedList<String> listaPalavrasChave, String documentoIndice, TabelaHash tabela) throws IOException {
        BufferedWriter escritor = new BufferedWriter(new FileWriter(documentoIndice));
        for(String palavraChave : listaPalavrasChave){
            Palavra palavra = tabela.buscarPalavra(palavraChave);
            if(palavra != null){
                escritor.write(palavraChave + ", Número de ocorrências: " + palavra.getNumeroDeOcorrencias() + ", Linhas das ocorrências: " + palavra.getOcorrencias());
            }
            else{
                escritor.write(palavraChave + ": Palavra não encontrada.");
            }
            escritor.newLine();
        }
        escritor.close();
    }
}
