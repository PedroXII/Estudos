import java.util.Random;
import java.util.ArrayList;

public class Turma {
    private int codigo;
    private Disciplina disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private static  ArrayList<Integer> listaCodigosTurma = new ArrayList<>();
    private static  ArrayList<Turma> listaTurma = new ArrayList<>();

    public int getCodigo() {
        return codigo;
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public boolean adicionarAluno(Aluno aluno, int codigo) {
        boolean adicionado = false;
        Turma turma = new Turma();
        turma = obterDadosTurma(codigo);
        if(!existeEsseAlunoNaTurma(aluno.getMatricula(), turma.getCodigo())){
            turma.alunos.add(aluno);
            turma.ordenarAlunos();
            adicionado = true;
        }
        return adicionado;
    }

    public boolean cadastrarTurma(Turma turma){
        boolean cadastrado = false;
        listaTurma.add(turma);
        turma.ordenarTurmas();
        cadastrado = true;
        return  cadastrado;
    }

    public void definirCodigoTurma() {
        Random aleatorio = new Random();
        int codigoTurma;
        do {
            codigoTurma = aleatorio.nextInt(90000) + 10000;
        }while(listaCodigosTurma.contains(codigoTurma));
        listaCodigosTurma.add(codigoTurma);
        this.codigo = codigoTurma;
    }

    public boolean removerAluno(int codigo, int matricula) {
        boolean deletado = false;
        Turma turma = new Turma();
        turma = obterDadosTurma(codigo);
        for(int i = 0; i < turma.alunos.size(); i++){
            if(turma.alunos.get(i).getMatricula() == matricula){
                turma.alunos.remove(i);
                deletado = true;
            }
        }
        return deletado;
    }

    public boolean deletarTurma(int codigo) {
        boolean deletado = false;
        for(int i = 0; i < listaTurma.size(); i++){
            if(listaTurma.get(i).getCodigo() == codigo){
                listaCodigosTurma.remove(listaTurma.get(i).getCodigo());
                listaTurma.remove(i);
                deletado = true;
            }
        }
        return deletado;
    }

    public boolean existeEsseAlunoNaTurma(int matricula, int codigo) {
        boolean existe = false;
        Turma turma = new Turma();
        turma = obterDadosTurma(codigo);
        for(int i = 0; i < turma.alunos.size(); i++){
            if(turma.alunos.get(i).getMatricula() == matricula){
                existe = true;
            }
        }
        return existe;
    }

    public boolean existeTurma(int codigo){
        boolean existe = false;
        int size = listaTurma.size();
        for(int i = 0; i < size; i++){
            if(listaTurma.get(i).getCodigo() == codigo){
                existe = true;
            }
        }
        return existe;
    }

    public void listarTurmas(){
        System.out.println("=============== Turmas ===============");
        for(int i = 0; i < listaTurma.size(); i++){
            System.out.println(i + " - Disciplina: " + listaTurma.get(i).getDisciplina().getNome() + ", Semestre: " + listaTurma.get(i).getDisciplina().getSemestre() + ", Professor(a): " + listaTurma.get(i).getProfessor().getNome() + ", CPF do(a) professor: " + listaTurma.get(i).getProfessor().getCpf() + ", Quantidade de alunos: " + listaTurma.get(i).alunos.size() + ", Código: " + listaTurma.get(i).getCodigo());
        }
    }

    public ArrayList<Aluno> obterAlunos(int codigo) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        for(int i = 0; i < listaTurma.size(); i++){
            if(listaTurma.get(i).getCodigo() == codigo){
                for(int x = 0; x < listaTurma.get(i).alunos.size(); x++){
                    alunos.add(listaTurma.get(i).alunos.get(x));
                }
            }
        }
        return alunos;
    }

    public Turma obterDadosTurma(int codigo){
        Turma turma = new Turma();
        for(int i = 0; i < listaTurma.size(); i++){
            if(listaTurma.get(i).getCodigo() == codigo){
                turma = listaTurma.get(i);
            }
        }
        return turma;
    }

    public void ordenarAlunos() {
        boolean foiTrocado = false;
        int size = alunos.size();
        int comparacao;
        do {
            foiTrocado = false;
            for (int i = 0; i < size - 1; i++) {
                comparacao = alunos.get(i).getNome().compareTo(alunos.get(i+1).getNome());
                if(comparacao > 0) {
                    Aluno aux = alunos.get(i);
                    alunos.set(i, alunos.get(i+1));
                    alunos.set(i+1, aux);
                    foiTrocado = true;
                }
            }
            size--;
        }while(foiTrocado);
    }

    public void ordenarTurmas() {
        boolean foiTrocado = false;
        int size = listaTurma.size();
        int comparacao;
        do {
            foiTrocado = false;
            for (int i = 0; i < size - 1; i++) {
                comparacao = listaTurma.get(i).getDisciplina().getNome().compareTo(listaTurma.get(i+1).getDisciplina().getNome());
                if(comparacao > 0) {
                    Turma aux = listaTurma.get(i);
                    listaTurma.set(i, listaTurma.get(i+1));
                    listaTurma.set(i+1, aux);
                    foiTrocado = true;
                }
            }
            size--;
        }while(foiTrocado);
    }

    public void exibirDadosTurma(int codigo) {
        for(int i = 0; i < listaTurma.size(); i++){
            if(listaTurma.get(i).getCodigo() == codigo){
                System.out.println("========== Turma ==========");
                System.out.println("Código da turma: " + listaTurma.get(i).getCodigo() +
                        "\nProfessor: " + listaTurma.get(i).getProfessor().getNome() +
                        "\nDisciplina: " + listaTurma.get(i).getDisciplina().getNome() +
                        "\n\nAlunos:\n");
                for (int x = 0; x < listaTurma.get(i).alunos.size(); x++) {
                    System.out.println("Nome: " + listaTurma.get(i).getAlunos().get(x).getNome() + ", Idade: " + listaTurma.get(i).getAlunos().get(x).getIdade() + ", CPF: " + listaTurma.get(i).getAlunos().get(x).getCpf() + ", Matricula: " + listaTurma.get(i).getAlunos().get(x).getMatricula() + ", Bolsista: " + listaTurma.get(i).getAlunos().get(x).isBolsista());
                }
            }
        }
    }
}