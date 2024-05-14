import java.util.Random;
import java.util.ArrayList;

public class Turma {
    private int codigo;
    private Disciplina disciplina;
    private Professor professor;
    private Aluno aluno;
    private ArrayList<Aluno> turma = new ArrayList<Aluno>();
    private static  ArrayList<Integer> listaCodigosTurma = new ArrayList<>();

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

    public void definirCodigoTurma() {
        Random aleatorio = new Random();
        int codigoTurma;
        do {
            codigoTurma = aleatorio.nextInt(90000) + 10000;
        }while(listaCodigosTurma.contains(codigoTurma));
        listaCodigosTurma.add(codigoTurma);
        this.codigo = codigoTurma;
    }

    public void adicionarAluno(Aluno aluno) {
        turma.add(aluno);
        ordenarAlunos();
    }

    public void removerAluno(Aluno aluno) {
        turma.remove(aluno);
    }

    public void ordenarAlunos() {
        boolean foiTrocado = false;
        int size = turma.size();
        int comparacao;
        do {
            foiTrocado = false;
            for (int i = 0; i < size - 1; i++) {
                comparacao = turma.get(i).getNome().compareTo(turma.get(i+1).getNome());
                if(comparacao > 0) {
                    Aluno aux = turma.get(i);
                    turma.set(i, turma.get(i+1));
                    turma.set(i+1, aux);
                    foiTrocado = true;
                }
            }
            size--;
        }while(foiTrocado);
    }

    public void listarTurma() {
        System.out.println("Código da turma: " + this.codigo +
                "\nProfessor: " + this.professor +
                "\nDisciplina: " + this.disciplina +
                "\n\nAlunos:\n");
        for (int i = 0; i < turma.size(); i++) {
            System.out.println("Nome: " + turma.get(i).getNome() + ", Idade: " + turma.get(i).getIdade() + ", CPF: " + turma.get(i).getCpf() + ", Ocupação: " + turma.get(i).getOcupacao() + ", Matricula: " + turma.get(i).getMatricula() + ", Bolsista: " + turma.get(i).isBolsista());
        }
    }
}