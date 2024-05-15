import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {
    private long cpf;
    private String nome;
    private int idade;
    private String ocupacao;
    private static ArrayList<Pessoa> listaPessoas = new ArrayList<>();
    protected Scanner ler = new Scanner(System.in);

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public boolean cadastrar(long cpf, Object pessoa, ArrayList lista){
        boolean cadastrado = false, existe = false;
        if(lista.contains(cpf)){
            existe = true;
        }
        if(!existe) {
            lista.add(pessoa);
            cadastrado = true;
        }
        return cadastrado;
    }

    public boolean cadastrarPessoa(long cpf, Pessoa pessoa){
        boolean cadastrado = false;
        cadastrar(cpf, pessoa, listaPessoas);
        ordenarPessoas();
        return cadastrado;
    }

    public boolean deletarPessoa(long cpf){
        int size = listaPessoas.size();
        boolean existe = false;
        for(int i = 0; i < size; i++){
            if(listaPessoas.get(i).getCpf() == cpf){
                existe = true;
                listaPessoas.remove(listaPessoas.get(i));
                size--;
            }
        }
        return existe;
    }

    public void exibirDadosPessoa(long cpf){
        Pessoa pessoa = new Pessoa();
        pessoa = pessoa.obterDadosPessoa(cpf);
        System.out.println("Nome: " + pessoa.getNome() + "\nIdade: " + pessoa.getIdade() + "\nCPF: " + pessoa.getCpf() + "\nOcupacao: " + pessoa.getOcupacao());
    }

    public boolean existe(long cpf){
        boolean existe = false;
        for (int i = 0; i < listaPessoas.size(); i++){
            if(listaPessoas.get(i).getCpf() == cpf){
                existe = true;
            }
        }
        return existe;
    }

    public void fazerAniversario(long cpf){
        Pessoa aniversariante = new Pessoa();
        for (int i = 0; i < listaPessoas.size(); i++){
            if(listaPessoas.get(i).getCpf() == cpf){
                aniversariante = listaPessoas.get(i);
                aniversariante.setIdade(aniversariante.getIdade() + 1);
                listaPessoas.set(i, aniversariante);
            }
        }
    }

    public void listar(ArrayList lista){
        int size = lista.size();
        for(int i = 0; i < size; i++){
            System.out.println(lista.get(i));
        }
    }

    public void listarPessoas(){
        ArrayList<String> informacoes = new ArrayList();
        for (int i = 0; i < listaPessoas.size(); i++) {
            informacoes.add(i + " - Nome: " + listaPessoas.get(i).getNome() + ", Idade: " + listaPessoas.get(i).getIdade() + ", CPF: " + listaPessoas.get(i).getCpf() + ", Ocupação: " + listaPessoas.get(i).getOcupacao());
        }
        listar(informacoes);
    }

    public void listarPessoasPorOcupacao(String ocupacao){
        ArrayList<String> informacoes = new ArrayList();
        for(int i = 0; i < listaPessoas.size(); i++){
            if(listaPessoas.get(i).getOcupacao().equals(ocupacao)) {
                informacoes.add(i + " - Nome: " + listaPessoas.get(i).getNome() + ", Idade: " + listaPessoas.get(i).getIdade() + ", CPF: " + listaPessoas.get(i).getCpf() + ", Ocupação: " + listaPessoas.get(i).getOcupacao());
            }
        }
        listar(informacoes);
    }

    public void mensagemConfirmacaoCadastro(ArrayList pessoa){
        System.out.println("Confira os dados:\n\nNome: " + pessoa.get(0) + "\nCPF: " + pessoa.get(1) + "\nIdade: " + pessoa.get(2) + "\nOcupacao: " + pessoa.get(3));
    }

    public ArrayList menuDeCadastro(String ocupacao){
        String nome;
        long cpf;
        int idade;
        System.out.println("Digite o nome a ser cadastrado: ");
        nome = ler.nextLine();
        System.out.println("OBS: certifique-se de digitar o CPF corretamente!\n\nDigite o CPF a ser cadastrado: ");
        cpf = Long.parseLong(ler.nextLine());
        System.out.println("Digite a idade a ser cadastrada: ");
        idade = Integer.parseInt(ler.nextLine());
        ArrayList<String> pessoa = new ArrayList<>();
        pessoa.add(nome);
        pessoa.add(Long.toString(cpf));
        pessoa.add(Integer.toString(idade));
        pessoa.add(ocupacao);
        return pessoa;
    }

    public Pessoa obterDadosPessoa(long cpf){
        Pessoa pessoa = new Pessoa();
        for (int i = 0; i < listaPessoas.size(); i++){
            if(listaPessoas.get(i).getCpf() == cpf){
                pessoa = listaPessoas.get(i);
            }
        }
        return pessoa;
    }

    public void ordenarPessoas() {
        boolean foiTrocado = false;
        int size = listaPessoas.size();
        int comparacao;
        do {
            foiTrocado = false;
            for (int i = 0; i < size - 1; i++) {
                comparacao = listaPessoas.get(i).getNome().compareTo(listaPessoas.get(i+1).getNome());
                if(comparacao > 0) {
                    Pessoa aux = listaPessoas.get(i);
                    listaPessoas.set(i, listaPessoas.get(i+1));
                    listaPessoas.set(i+1, aux);
                    foiTrocado = true;
                }
            }
            size--;
        }while(foiTrocado);
    }
}
