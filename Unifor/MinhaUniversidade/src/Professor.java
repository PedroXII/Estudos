import java.util.ArrayList;

public class Professor extends Pessoa{
    private String centro;
    private static ArrayList<Professor> listaProfessores = new ArrayList<>();

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public boolean cadastrarProfessor(long cpf, Professor professor){
        boolean cadastrado = false;
        super.cadastrarPessoa(cpf, professor);
        cadastrar(cpf, professor, listaProfessores);
        ordenarProfessores();
        return cadastrado;
    }

    public void darAula(int codigo){
        System.out.println("O(A) professor(a) " + super.getNome() + " deu uma aula de " + this.centro + " para a turma "+ codigo +".");
    }



    public boolean deletarProfessor(long cpf){
        int size = listaProfessores.size();
        boolean existe = false;
        for(int i = 0; i < size; i++){
            if(listaProfessores.get(i).getCpf() == cpf){
                listaProfessores.remove(listaProfessores.get(i));
                existe = true;
                size--;
            }
        }
        return existe;
    }

    public boolean existeProfessor(long cpf){
        boolean existe = false;
        for(int i = 0; i <listaProfessores.size(); i++){
            if(listaProfessores.get(i).getCpf() == cpf){
                existe = true;
            }
        }
        return existe;
    }

    public void fazerAniversarioProfessor(long cpf){
        super.fazerAniversario(cpf);
        Professor aniversariante = new Professor();
        for (int i = 0; i < listaProfessores.size(); i++){
            if(listaProfessores.get(i).getCpf() == cpf){
                aniversariante = listaProfessores.get(i);
                aniversariante.setIdade(aniversariante.getIdade() + 1);
                listaProfessores.set(i, aniversariante);
            }
        }
    }

    public void ordenarProfessores() {
        boolean foiTrocado = false;
        int size = listaProfessores.size();
        int comparacao;
        do {
            foiTrocado = false;
            for (int i = 0; i < size - 1; i++) {
                comparacao = listaProfessores.get(i).getNome().compareTo(listaProfessores.get(i+1).getNome());
                if(comparacao > 0) {
                    Professor aux = listaProfessores.get(i);
                    listaProfessores.set(i, listaProfessores.get(i+1));
                    listaProfessores.set(i+1, aux);
                    foiTrocado = true;
                }
            }
            size--;
        }while(foiTrocado);
    }

    public void listarProfessores(){
        ArrayList<String> informacoes = new ArrayList();
        for (int i = 0; i < listaProfessores.size(); i++) {
            informacoes.add(i + " - Nome: " + listaProfessores.get(i).getNome() + ", Idade: " + listaProfessores.get(i).getIdade() + ", CPF: " + listaProfessores.get(i).getCpf() + ", Ocupação: " + listaProfessores.get(i).getOcupacao() + ", Centro: " + listaProfessores.get(i).getCentro());
        }
        super.listar(informacoes);
    }


    public void mensagemConfirmacaoProfessor(ArrayList professor){
        super.mensagemConfirmacaoCadastro(professor);
        System.out.println("Centro: " + professor.get(4));
    }
    public Professor obterDadosProfessor(long cpf){
        Professor professor = new Professor();
        for (int i = 0; i < listaProfessores.size(); i++){
            if(listaProfessores.get(i).getCpf() == cpf){
                professor = listaProfessores.get(i);
            }
        }
        return professor;
    }
    public ArrayList menuCadastroProfessor(){
        ArrayList professor = new ArrayList();
        professor = super.menuDeCadastro("PROFESSOR");
        System.out.println("Digite o centro de ensino do(a) professor(a): ");
        String centro = ler.nextLine().toUpperCase();
        professor.add(centro);
        return professor;
    }
}
