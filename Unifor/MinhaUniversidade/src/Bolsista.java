import java.util.ArrayList;

public class Bolsista extends Aluno{
    private int bolsa;
    private static ArrayList<Bolsista> listaBolsista = new ArrayList<>();

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    public boolean cadastrarBolsista(long cpf, Bolsista bolsista) {
        boolean cadastrado = false;
        super.cadastrarAluno(cpf, bolsista);
        super.cadastrar(cpf, bolsista, listaBolsista);
        ordenarBolsistas();
        return cadastrado;
    }

    public boolean deletarAlunoBolsista(int matricula) {
        super.deletarAluno(matricula);
        int size = listaBolsista.size();
        boolean existe = false;
        for(int i = 0; i < size; i++){
            if(listaBolsista.get(i).getMatricula() == matricula){
                listaBolsista.remove(listaBolsista.get(i));
                existe = true;
                size--;
            }
        }
        return existe;
    }

    public float pagarMensalidadeBolsista(long cpf) {
        Aluno aluno = new Aluno();
        int size = listaBolsista.size();
        boolean bolsista = false;
        int bolsa = 0;
        for(int i = 0; i < size; i++){
            if(listaBolsista.get(i).getCpf() == cpf){
                bolsa = listaBolsista.get(i).getBolsa();
            }
        }
        float desconto = (super.pagarMensalidade() / 100) * bolsa;
        return (super.pagarMensalidade() - desconto);
    }

    public void listarAlunosBolsistas(){
        ArrayList<String> informacoes = new ArrayList();
        for (int i = 0; i < listaBolsista.size(); i++) {
            informacoes.add(i + " - Nome: " + listaBolsista.get(i).getNome() + ", Idade: " + listaBolsista.get(i).getIdade() + ", CPF: " + listaBolsista.get(i).getCpf() + ", Ocupação: " + listaBolsista.get(i).getOcupacao() + ", Matricula: " + listaBolsista.get(i).getMatricula() + ", Bolsista: " + listaBolsista.get(i).isBolsista() + ", Bolsa: " + listaBolsista.get(i).getBolsa() + "%");
        }
        super.listar(informacoes);
    }

    public void ordenarBolsistas(){
        boolean foiTrocado = false;
        int size = listaBolsista.size();
        int comparacao;
        do {
            foiTrocado = false;
            for (int i = 0; i < size - 1; i++) {
                comparacao = listaBolsista.get(i).getNome().compareTo(listaBolsista.get(i+1).getNome());
                if(comparacao > 0) {
                    Bolsista aux = listaBolsista.get(i);
                    listaBolsista.set(i, listaBolsista.get(i+1));
                    listaBolsista.set(i+1, aux);
                    foiTrocado = true;
                }
            }
            size--;
        }while(foiTrocado);
    }

    public ArrayList menuDeCadastroAlunoBolsista(){
        ArrayList <String> aluno = new ArrayList();
        aluno = super.menuDeCadastroAluno();
        String comando;
        boolean bolsista = true;
        int bolsa;
        do {
            System.out.println("\nOBS: Se você se enganou e o aluno não é bolsista preencha os próximos dados com\nqualquer valor válido e reinicie o cadastro.\n\nDigite a porcetagem de desconto da bolsa e pressione [Enter]:");
            bolsa = super.ler.nextInt();
            if (bolsa > 100 || bolsa < 0) {
                System.out.println("Valor da bolsa inválido!\nDigite um número de 0 a 100.\n\nPressione [Enter] para continuar.");
                comando = super.ler.nextLine();
            }
        }while (bolsa > 100 || bolsa < 0);
        aluno.set(4, (Boolean.toString(bolsista)));
        aluno.add(Integer.toString(bolsa));
        return aluno;
    }
    public void fazerAniversarioAlunoBolsista(long cpf){
        super.fazerAniversarioAluno(cpf);
        Bolsista aniversariante = new Bolsista();
        for (int i = 0; i < listaBolsista.size(); i++){
            if(listaBolsista.get(i).getCpf() == cpf){
                aniversariante = listaBolsista.get(i);
                aniversariante.setIdade(aniversariante.getIdade() + 1);
                listaBolsista.set(i, aniversariante);
            }
        }
    }
    public void mensagemConfirmacaoAlunoBolsista(ArrayList aluno){
        super.mensagemConfirmacaoAluno(aluno);
        System.out.println("Bolsa: " + aluno.get(5));
    }
    public Bolsista obterDadosAlunoBolsista(int matricula){
        Bolsista bolsista = new Bolsista();
        for (int i = 0; i < listaBolsista.size(); i++){
            if(listaBolsista.get(i).getMatricula() == matricula){
                bolsista = listaBolsista.get(i);
            }
        }
        return bolsista;
    }
}
