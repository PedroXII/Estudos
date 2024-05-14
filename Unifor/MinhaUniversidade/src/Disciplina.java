import java.util.Random;
import java.util.ArrayList;

public class Disciplina {
    private int codigo;
    private String nome;
    private int semestre;
    private static ArrayList<Integer> listaCodigosDisciplina = new ArrayList<>();
    private static ArrayList<Disciplina> listaDisciplinas = new ArrayList<>();

    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void definirCodigoDisciplina(){
        Random aleatorio = new Random();
        int codigoDisciplina;
        do {
            codigoDisciplina = aleatorio.nextInt(9000) + 1000;
        }while(listaCodigosDisciplina.contains(codigoDisciplina));
        listaCodigosDisciplina.add(codigoDisciplina);
        this.codigo = codigoDisciplina;
    }

    public void listarDisciplinas(){
        int size = listaDisciplinas.size();
        for(int i = 0; i < size; i++){
            System.out.println("Nome: " + listaDisciplinas.get(i).getNome() + ", Semestre: " + listaDisciplinas.get(i).getSemestre() + ", Código: " + listaDisciplinas.get(i).getCodigo());
        }
    }

    public boolean cadastrarDisciplina(Disciplina disciplina){
        boolean cadastrado = false;
        listaDisciplinas.add(disciplina);
        ordenarDisciplinas();
        cadastrado = true;
        return cadastrado;
    }

    public boolean deletarDisciplina(int codigo){
        int size = listaDisciplinas.size();
        boolean existe = false;
        for(int i = 0; i < size; i++){
            if(listaDisciplinas.get(i).getCodigo() == codigo){
                existe = true;
                listaDisciplinas.remove(i);
                listaCodigosDisciplina.remove(listaCodigosDisciplina.indexOf(codigo));
                size--;
            }
        }
        return existe;
    }

    public void ordenarDisciplinas() {
        boolean foiTrocado = false;
        int size = listaDisciplinas.size();
        int comparacao;
        do {
            foiTrocado = false;
            for (int i = 0; i < size - 1; i++) {
                comparacao = listaDisciplinas.get(i).getNome().compareTo(listaDisciplinas.get(i+1).getNome());
                if(comparacao > 0) {
                    Disciplina aux = listaDisciplinas.get(i);
                    listaDisciplinas.set(i, listaDisciplinas.get(i+1));
                    listaDisciplinas.set(i+1, aux);
                    foiTrocado = true;
                }
            }
            size--;
        }while(foiTrocado);
    }

    public boolean checarDuplicacaoDisciplina(String nome, int semestre){
        boolean existe = false;
        int size = listaDisciplinas.size();
        for(int i = 0; i < size; i++){
            if(listaDisciplinas.get(i).getNome() == nome && listaDisciplinas.get(i).getSemestre() == semestre){
                existe = true;
            }
        }
        return existe;
    }

    public boolean existeDisciplina(int codigo){
        boolean existe = false;
        int size = listaDisciplinas.size();
        for(int i = 0; i < size; i++){
            if(listaDisciplinas.get(i).getCodigo() == codigo){
                existe = true;
            }
        }
        return existe;
    }

    public Disciplina obterDadosDisciplina(int codigo){
        Disciplina disciplina = new Disciplina();
        int size = listaDisciplinas.size();
        for(int i = 0; i < size; i++){
            if(listaDisciplinas.get(i).getCodigo() == codigo){
                disciplina = listaDisciplinas.get(i);
            }
        }
        return disciplina;
    }
}
