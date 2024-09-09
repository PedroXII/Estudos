import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        TabelaHash tabela = new TabelaHash();
        tabela.gerarIndice();
        boolean concluido = false;
        do {
            try {
                Texto.processarTexto("src/Texto.txt", tabela);
                LinkedList<String> palavrasChave = Texto.processarPalavrasChave("src/PalavrasChave.txt");

                System.out.println("=============== ÍNDICE REMISSIVO ===============\n\nIntruções\nHá dois arquivos na pasta um é o 'Texto.txt' e o outro é o 'PalavrasChave.txt', para utilizar essa ferramenta você precisa\nseguir os seguintes passos\n\n" +
                        "1 - Copie o texto desejado para o arquivo Texto.txt\n" +
                        "2 - Escreva ou copie as palavras a serem procuradas no arquivo PalavrasChave.txt, uma em cada linha.\n" +
                        "3 - Execute o programa.\n" +
                        "4 - O índice gerado está no arquivo IndiceRemissivo.txt.\n\n" +
                        "OBS: Há dois arquivos com o nome 'Texto', mas um é .java e outro é .txt o arquivo mencionado nas instruções é o .txt,\n" +
                        "não modifique nenhum arquivo .java e só modifique o conteúdo do arquivo .txt e não seus nomes senão o programa pode\n" +
                        "não funcionar corrretamente.\n" +
                        "Não é possível localizar palavras com acento, palavras compostas ou com 'ç'.\n" +
                        "Gostaria que a ordem das palavras do índice seja a original ou em ordem alfabetica?\n" +
                        "\n1 - Original." +
                        "\n2 - Alfabetica." +
                        "\n3 - Sair do programa." +
                        "\nDigite o comando e pressione [Enter]:");
                String comando = ler.nextLine();
                switch (comando) {
                    case "1":
                        Texto.gerarIndice(palavrasChave, "src/IndiceRemissivo.txt", tabela);
                        concluido = true;
                        System.out.println("O índice foi gerado com sucesso!\nConfira o arquivo IndiceRemissivo.txt.");
                        break;
                    case "2":
                        int size = palavrasChave.size();
                        boolean trocado;
                        for (int x = 0; x < size - 1; x++) {
                            trocado = false;
                            for (int y = 0; y < size - 1 - x; y++) {
                                if ((palavrasChave.get(y)).compareToIgnoreCase(palavrasChave.get(y + 1)) > 0) {
                                    String z = palavrasChave.get(y);
                                    palavrasChave.set(y, palavrasChave.get(y + 1));
                                    palavrasChave.set(y + 1, z);
                                    trocado = true;
                                }
                            }
                            if (!trocado) {
                                break;
                            }
                        }
                        Texto.gerarIndice(palavrasChave, "src/IndiceRemissivo.txt", tabela);
                        concluido = true;
                        System.out.println("O índice foi gerado com sucesso!\nConfira o arquivo IndiceRemissivo.txt.");
                        break;
                    case "3":
                        concluido = true;
                        break;
                    default:
                        System.out.println("Comando inválido!\nPressione [Enter] para tentar novamente:");
                        ler.nextLine();
                        break;
                }
            } catch (Exception e) {
                System.out.println("Ocorreu um erro, tente novamente ou encerre o programa.\nPressione [Enter] para prosseguir.");
                ler.nextLine();
            }
        }while (!concluido);
        ler.close();
    }
}