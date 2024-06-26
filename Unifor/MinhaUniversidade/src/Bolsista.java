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
        cadastrado = super.cadastrar(cpf, bolsista, listaBolsista);
        ordenarBolsistas();
        return cadastrado;
    }

    public boolean deletarAlunoBolsista(int matricula) {
        int size = listaBolsista.size();
        boolean existe = false;
        for(int i = 0; i < size; i++){
            if(listaBolsista.get(i).getMatricula() == matricula){
                super.deletarAluno(matricula);
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
            System.out.println("\nDigite a porcetagem de desconto da bolsa e pressione [Enter]:");
            bolsa = Integer.parseInt(super.ler.nextLine());
            if (bolsa > 100 || bolsa < 0) {
                System.out.println("Valor da bolsa inválido!\nDigite um número de 0 a 100.\n\nPressione [Enter] para continuar.");
                comando = super.ler.nextLine();
            }
        }while (bolsa > 100 || bolsa < 0);
        aluno.set(4, (Boolean.toString(bolsista)));
        aluno.add(Integer.toString(bolsa));
        return aluno;
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
