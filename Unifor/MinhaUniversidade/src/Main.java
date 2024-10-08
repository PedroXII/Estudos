import java.util.Scanner;
import java.util.ArrayList;

/*
Commentários sobre o envio:
=============== Equipe 86 ===============
Ilana das Neves Barbosa - Matrícula: 2326948
Ionara dos Santos Ferreira - Matrícula: 2326251
Joao Pedro Almeida Santos - Matrícula: 2327071
Lucas Kauã Portela da Silva Nogueira - Matrícula: 2323857
Maria Vitoria Sampaio da Silva - Matrícula: 2323856
Vivian Leigh Teixeira Salvi - Matrícula: 2313542

O programa está maior e tem mais funcionalidades do
que o pedido, mas tudo o que foi pedido está incluso
e está tudo bem sinalizado.

O método "dar aula" está no menu dos professores.
*/

public class Main {
    public static void main(String[] args) {
        String comando;
        int codigo;
        long cpf;
        boolean sair = false, voltarAoMenu = false;
        Scanner ler = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        Aluno aluno = new Aluno();
        Bolsista bolsista = new Bolsista();
        Disciplina disciplina = new Disciplina();
        Pessoa pessoa = new Pessoa();
        Professor professor = new Professor();
        Turma turma = new Turma();
        Visitante visitante = new Visitante();
        String mensagemErro = "ERRO!\nVerifique se você inseriu os dados corretamente e tente de novo.\nPressione [Enter] para continuar.";

        Aluno a1 = new Aluno();
        a1.setNome("Ana Julia");
        a1.setCpf(Long.parseLong("08541721401"));
        a1.setIdade(30);
        a1.setOcupacao("ALUNO");
        a1.setBolsista(false);
        a1.definirMatricula();
        a1.cadastrarAluno(a1.getCpf(), a1);

        Aluno a2 = new Aluno();
        a2.setNome("Virginia Santos");
        a2.setCpf(Long.parseLong("06382915734"));
        a2.setIdade(27);
        a2.setOcupacao("ALUNO");
        a2.setBolsista(false);
        a2.definirMatricula();
        a2.cadastrarAluno(a2.getCpf(), a2);

        Bolsista b1 = new Bolsista();
        b1.setNome("Paulo Andrade");
        b1.setCpf(Long.parseLong("42528464231"));
        b1.setIdade(32);
        b1.setOcupacao("ALUNO");
        b1.setBolsista(true);
        b1.setBolsa(50);
        b1.definirMatricula();
        b1.cadastrarBolsista(b1.getCpf(), b1);

        Bolsista b2 = new Bolsista();
        b2.setNome("Carlos Luiz");
        b2.setCpf(Long.parseLong("37418924560"));
        b2.setIdade(29);
        b2.setOcupacao("ALUNO");
        b2.setBolsista(true);
        b2.setBolsa(75);
        b2.definirMatricula();
        b2.cadastrarBolsista(b2.getCpf(), b2);

        Disciplina d1 = new Disciplina();
        d1.setNome("MATEMATICA");
        d1.setSemestre(1);
        d1.definirCodigoDisciplina();
        d1.cadastrarDisciplina(d1);

        Disciplina d2 = new Disciplina();
        d2.setNome("COMPUTACAO");
        d2.setSemestre(2);
        d2.definirCodigoDisciplina();
        d2.cadastrarDisciplina(d2);

        Disciplina d3 = new Disciplina();
        d3.setNome("BIOLOGIA");
        d3.setSemestre(1);
        d3.definirCodigoDisciplina();
        d3.cadastrarDisciplina(d3);

        Professor p1 = new Professor();
        p1.setNome("Stephen Hawking");
        p1.setCpf(Long.parseLong("25478691321"));
        p1.setIdade(76);
        p1.setCentro("MATEMATICA");
        p1.setOcupacao("PROFESSOR");
        p1.cadastrarProfessor(p1.getCpf(), p1);

        Professor p2 = new Professor();
        p2.setNome("Alan Turing");
        p2.setCpf(Long.parseLong("52143674895"));
        p2.setIdade(41);
        p2.setCentro("COMPUTACAO");
        p2.setOcupacao("PROFESSOR");
        p2.cadastrarProfessor(p2.getCpf(), p2);

        Professor p3 = new Professor();
        p3.setNome("Charles Darwin");
        p3.setCpf(Long.parseLong("24657891356"));
        p3.setIdade(73);
        p3.setCentro("BIOLOGIA");
        p3.setOcupacao("PROFESSOR");
        p3.cadastrarProfessor(p3.getCpf(), p3);

        Visitante v1 = new Visitante();
        v1.setNome("Camila Santos");
        v1.setCpf(Long.parseLong("54862130478"));
        v1.setIdade(28);
        v1.setOcupacao("VISITANTE");
        v1.cadastrarPessoa(v1.getCpf(), v1);

        Visitante v2 = new Visitante();
        v2.setNome("Alexandre Silva");
        v2.setCpf(Long.parseLong("74578671278"));
        v2.setIdade(35);
        v2.setOcupacao("VISITANTE");
        v2.cadastrarPessoa(v2.getCpf(), v2);

        Turma t1 = new Turma();
        t1.setDisciplina(d1);
        t1.setProfessor(p1);
        t1.definirCodigoTurma();
        t1.cadastrarTurma(t1);
        t1.adicionarAluno(a1, t1.getCodigo());
        t1.adicionarAluno(a2, t1.getCodigo());
        t1.adicionarAluno(b1, t1.getCodigo());
        t1.adicionarAluno(b2, t1.getCodigo());

        Turma t2 = new Turma();
        t2.setDisciplina(d2);
        t2.setProfessor(p2);
        t2.definirCodigoTurma();
        t2.cadastrarTurma(t2);
        t2.adicionarAluno(a1, t2.getCodigo());
        t2.adicionarAluno(a2, t2.getCodigo());
        t2.adicionarAluno(b1, t2.getCodigo());
        t2.adicionarAluno(b2, t2.getCodigo());

        Turma t3 = new Turma();
        t3.setDisciplina(d3);
        t3.setProfessor(p3);
        t3.definirCodigoTurma();
        t3.cadastrarTurma(t3);
        t3.adicionarAluno(a1, t3.getCodigo());
        t3.adicionarAluno(a2, t3.getCodigo());
        t3.adicionarAluno(b1, t3.getCodigo());
        t3.adicionarAluno(b2, t3.getCodigo());

        do {
            try{
                System.out.println
                        ("=============== MINHA UNIVERSIDADE ==============\n" +
                                "1 - Gerenciar alunos.\n" +
                                "2 - Gerenciar disciplinas.\n" +
                                "3 - Gerenciar professores.\n" +
                                "4 - Gerenciar turmas.\n" +
                                "5 - Gerenciar visitantes.\n" +
                                "6 - Fazer aniversário.\n" +
                                "7 - Sair.\n\n" +
                                "Digite o número do menu desejado e pressione [Enter]:");
                comando = ler.nextLine();
                switch (comando){

                    //Gerenciar alunos.
                    case "1":
                        do {
                            voltarAoMenu = false;
                            System.out.println("=============== Alunos ==============\n" +
                                "1 - Cadastrar aluno.\n" +
                                "2 - Listar alunos.\n" +
                                "3 - Remover aluno.\n" +
                                "4 - Pagar mensalidade.\n" +
                                "5 - Voltar para o menu principal.\n" +
                                "\nDica: se não souber o dado de algum(a) aluno(a) é só usar a função 'Listar alunos'.\n\nDigite o número do comando desejado e pressione [Enter]:");
                            comando = ler.nextLine();
                            switch (comando){
                                //Cadastrar aluno.
                                case "1":
                                    System.out.println("O(A) aluno(a) é bolsista?\n\n1 - Sim.\n2 - Não.\n3 - Cancelar cadastro.\n\nDigite o número da resposta e pressione [Enter]:");
                                    comando = ler.nextLine();
                                    switch (comando){
                                        case "1":
                                            lista = bolsista.menuDeCadastroAlunoBolsista();
                                            bolsista.mensagemConfirmacaoAlunoBolsista(lista);
                                            System.out.println("Tem certeza que quer cadastrar esse(a) aluno(a)?\n\n1 - Sim.\n2 - Não.\n\nDigite o número da resposta e pressione [Enter]:");
                                            comando = ler.nextLine();
                                            switch (comando){
                                                case "1":
                                                    bolsista.setNome(lista.get(0));
                                                    bolsista.setCpf(Long.parseLong(lista.get(1)));
                                                    bolsista.setIdade(Integer.parseInt(lista.get(2)));
                                                    bolsista.setOcupacao(lista.get(3));
                                                    bolsista.setBolsista(Boolean.parseBoolean(lista.get(4)));
                                                    bolsista.definirMatricula();
                                                    bolsista.setBolsa(Integer.parseInt((lista.get(5))));
                                                    boolean cadastradoBolsista = bolsista.cadastrarBolsista(bolsista.getCpf(), bolsista);
                                                    if (!cadastradoBolsista) {
                                                        System.out.println("Este CPF já foi cadastrado anteriormente na lista Bolsistas!");
                                                        comando = ler.nextLine();
                                                    }
                                                     else if (cadastradoBolsista){
                                                        System.out.println("O(A) aluno(a) foi cadastrado(a) com sucesso!\n\nPressione [Enter] para continuar.");
                                                        comando = ler.nextLine();
                                                    }
                                                    break;
                                                case "2":
                                                    break;
                                                default:
                                                    System.out.println(mensagemErro);
                                                    comando = ler.nextLine();
                                                    break;
                                            }
                                            break;
                                        case "2":
                                            lista = aluno.menuDeCadastroAluno();
                                            aluno.mensagemConfirmacaoAluno(lista);
                                            System.out.println("Tem certeza que quer cadastrar esse(a) aluno(a)?\n\n1 - Sim.\n2 - Não.\n\nDigite o número da resposta e pressione [Enter]:");
                                            comando = ler.nextLine();
                                            switch (comando){
                                                case "1":
                                                    aluno.setNome(lista.get(0));
                                                    aluno.setCpf(Long.parseLong(lista.get(1)));
                                                    aluno.setIdade(Integer.parseInt(lista.get(2)));
                                                    aluno.setOcupacao(lista.get(3));
                                                    aluno.setBolsista(Boolean.parseBoolean(lista.get(4)));
                                                    aluno.definirMatricula();
                                                    boolean cadastradoAluno = aluno.cadastrarAluno(aluno.getCpf(), aluno);
                                                    if (!cadastradoAluno) {
                                                        System.out.println("Este CPF já foi cadastrado anteriormente na lista Alunos!");
                                                        comando = ler.nextLine();
                                                    }
                                                    if (cadastradoAluno){
                                                        System.out.println("O(A) aluno(a) foi cadastrado(a) com sucesso!\n\nPressione [Enter] para continuar.");
                                                        comando = ler.nextLine();
                                                    }
                                                    break;
                                                case "2":
                                                    break;
                                                default:
                                                    System.out.println(mensagemErro);
                                                    comando = ler.nextLine();
                                                    break;
                                            }
                                            break;
                                        case "3":
                                            break;
                                        default:
                                            System.out.println(mensagemErro);
                                            comando = ler.nextLine();
                                            break;
                                    }
                                    break;
                                //Listar alunos.
                                case "2":
                                    aluno.listarAlunos();
                                    System.out.println("\nPressione [Enter] para continuar.");
                                    comando = ler.nextLine();
                                    break;
                                //Remover aluno.
                                case "3":
                                    aluno.listarAlunos();
                                    System.out.println("Digite a matricula do(a) aluno(a) a ser deletado(a):");
                                    int matricula = Integer.parseInt(ler.nextLine());
                                    if(aluno.existeMatricula(matricula)){
                                        aluno = aluno.obterDadosAluno(matricula);
                                        System.out.println("Tem certeza que quer deletar o(a) seguinte aluno(a)?\n");
                                        aluno.exibirDadosPessoa(aluno.getCpf());
                                        System.out.println("\n1 - Sim.\n2 - Não.\n\nDigite o comando desejado e pressione [Enter]:");
                                        comando = ler.nextLine();
                                        if(aluno.isBolsista()){
                                            bolsista = bolsista.obterDadosAlunoBolsista(matricula);
                                            switch (comando){
                                                case "1":
                                                    bolsista.deletarAlunoBolsista(bolsista.getMatricula());
                                                    System.out.println("Aluno(a) deletado(a) com sucesso!\n\nPressione [Enter] para continuar.");
                                                    comando = ler.nextLine();
                                                    break;
                                                case "2":
                                                    break;
                                                default:
                                                    System.out.println(mensagemErro);
                                                    comando = ler.nextLine();
                                                    break;
                                            }
                                        }
                                        else if(!aluno.isBolsista()){
                                            switch (comando){
                                                case "1":
                                                    aluno.deletarAluno(aluno.getMatricula());
                                                    System.out.println("Aluno(a) deletado(a) com sucesso!\n\nPressione [Enter] para continuar.");
                                                    comando = ler.nextLine();
                                                    break;
                                                case "2":
                                                    break;
                                                default:
                                                    System.out.println(mensagemErro);
                                                    comando = ler.nextLine();
                                                    break;
                                            }
                                        }
                                    }
                                    else {
                                        System.out.println("Não foi nenhum encontrado aluno com essa matricula!\n\nPressione [Enter] para continuar.");
                                        comando = ler.nextLine();
                                    }
                                    break;
                                //Pagar mensalidade.
                                case "4":
                                    aluno.listarAlunos();
                                    System.out.println("Digite a matricula do(a) aluno(a) que vai pagar mensalidade:");
                                    matricula = Integer.parseInt(ler.nextLine());
                                    if(aluno.existeMatricula(matricula)) {
                                        aluno = aluno.obterDadosAluno(matricula);
                                        if (aluno.isBolsista()) {
                                            bolsista = bolsista.obterDadosAlunoBolsista(matricula);
                                            System.out.println("========== Aluno ==========\n");
                                            bolsista.exibirDadosPessoa(bolsista.getCpf());
                                            System.out.println("Este(a) aluno(a) tem uma bolsa de " + bolsista.getBolsa() + "%.\n\n" + "Mensalidade: " + bolsista.pagarMensalidadeBolsista(bolsista.getCpf()) + "\nPagar mensalidade?\n\n1 - Sim.\n2 - Não.\n\nDigite o comando desejado e pressione [Enter]:");
                                            comando = ler.nextLine();
                                            switch (comando) {
                                                case "1":
                                                    System.out.println("Mensalidade paga!\n\nPressione [Enter] para continuar.");
                                                    comando = ler.nextLine();
                                                    break;
                                                case "2":
                                                    System.out.println("A mensalidade não foi paga!\n\nPressione [Enter] para continuar.");
                                                    comando = ler.nextLine();
                                                    break;
                                                default:
                                                    System.out.println(mensagemErro);
                                                    comando = ler.nextLine();
                                                    break;
                                            }
                                        }
                                        else if (!aluno.isBolsista()) {
                                            System.out.println("========== Aluno ==========\n");
                                            aluno.exibirDadosPessoa(aluno.getCpf());
                                            System.out.println("Mensalidade: " + aluno.pagarMensalidade() + "\nPagar mensalidade?\n\n1 - Sim.\n2 - Não.\n\nDigite o comando desejado e pressione [Enter]:");
                                            comando = ler.nextLine();
                                            switch (comando) {
                                                case "1":
                                                    System.out.println("Mensalidade paga!\n\nPressione [Enter] para continuar.");
                                                    comando = ler.nextLine();
                                                    break;
                                                case "2":
                                                    System.out.println("A mensalidade não foi paga!\n\nPressione [Enter] para continuar.");
                                                    comando = ler.nextLine();
                                                    break;
                                                default:
                                                    System.out.println(mensagemErro);
                                                    comando = ler.nextLine();
                                                    break;
                                            }
                                        }
                                    }
                                    else {
                                        System.out.println("Não foi encontrado nenhum aluno com essa matricula!\n\nPressione [Enter] para continuar.");
                                        comando = ler.nextLine();
                                    }
                                    break;
                                //Voltar ao menu.
                                case "5":
                                    voltarAoMenu = true;
                                    break;
                                //Comando incorreto.
                                default:
                                    System.out.println(mensagemErro);
                                    comando = ler.nextLine();
                                    break;
                            }
                        }while(!voltarAoMenu);
                        break;

                    //Gerenciar disciplinas.
                    case "2":
                        do{
                            System.out.println("========== Disciplinas ==========\n" +
                                    "1 - Adicionar disciplina.\n" +
                                    "2 - Deletar disciplina.\n" +
                                    "3 - Listar disciplinas.\n" +
                                    "4 - Voltar ao menu principal.\n" +
                                    "\nDica: se não souber o dado de alguma disciplina é só usar a função 'Listar disciplinas'.\n\nDigite o número do comando e pressione [Enter]:");
                            comando = ler.nextLine();
                            //Adicionar disciplina.
                            switch (comando){
                                case "1":
                                    System.out.println("Digite o nome da disciplina: ");
                                    disciplina.setNome(ler.nextLine().toUpperCase());
                                    System.out.println("Digite o semestre da disciplina: ");
                                    disciplina.setSemestre(Integer.parseInt(ler.nextLine()));
                                    if(disciplina.checarDuplicacaoDisciplina(disciplina.getNome(), disciplina.getSemestre())){
                                        System.out.println("Já existe uma disciplina com esse nome e semestre!\nQuer continuar o cadastro dessa disciplina?\n\nNome: " + disciplina.getNome() + "\nSemestre: " + disciplina.getSemestre() + "\n\n1 - Sim.\n2 - Não.\n\nDigite o número do comando e pressione [Enter]:");
                                        comando = ler.nextLine();
                                        switch (comando){
                                            case "1":
                                                disciplina.definirCodigoDisciplina();
                                                disciplina.cadastrarDisciplina(disciplina);
                                                System.out.println("Disciplina cadastrada com sucesso!\n\nPressione [Enter] para continuar.");
                                                comando = ler.nextLine();
                                                break;
                                            case "2":
                                                break;
                                            default:
                                                System.out.println(mensagemErro);
                                                comando = ler.nextLine();
                                                break;
                                        }
                                    }
                                    else{
                                        System.out.println("Tem certeza que quer cadastrar a seguinte disciplina?\n\nNome: " + disciplina.getNome() + "\nSemestre: " + disciplina.getSemestre() + "\n\n1 - Sim.\n2 - Não.\n\nDigite o número do comando e pressione [Enter]:");
                                        comando = ler.nextLine();
                                        switch (comando){
                                            case "1":
                                                disciplina.definirCodigoDisciplina();
                                                disciplina.cadastrarDisciplina(disciplina);
                                                System.out.println("Disciplina cadastrada com sucesso!\n\nPressione [Enter] para continuar.");
                                                comando = ler.nextLine();
                                                break;
                                            case "2":
                                                break;
                                            default:
                                                System.out.println(mensagemErro);
                                                comando = ler.nextLine();
                                                break;
                                        }
                                    }
                                    break;
                                //Deletar disciplina.
                                case "2":
                                    disciplina.listarDisciplinas();
                                    System.out.println("Digite o codigo da disciplina a ser deletada: ");
                                    codigo = Integer.parseInt(ler.nextLine());
                                    if(disciplina.existeDisciplina(codigo)){
                                        disciplina = disciplina.obterDadosDisciplina(codigo);
                                        System.out.println("Tem certeza que quer deletar a seguinte Disciplina?\n\nCódigo: " + disciplina.getCodigo() + "\nNome: " + disciplina.getNome() + "\nSemestre: " + disciplina.getSemestre() + "\n\n1 - Sim.\n2 - Não.\n\nDigite o número do comando e pressione [Enter]:");
                                        comando = ler.nextLine();
                                        switch (comando){
                                            case "1":
                                                disciplina.deletarDisciplina(codigo);
                                                System.out.println("Disciplina deletada com sucesso!\n\nPressione [Enter] para continuar.");
                                                comando = ler.nextLine();
                                                break;
                                            case "2":
                                                break;
                                            default:
                                                System.out.println(mensagemErro);
                                                comando = ler.nextLine();
                                                break;
                                        }
                                    }
                                    else {
                                        System.out.println("Disciplina não encontrada!\n\nPressione [Enter] para continuar.");
                                        comando = ler.nextLine();
                                    }
                                    break;
                                //Listar disciplina.
                                case "3":
                                    disciplina.listarDisciplinas();
                                    System.out.println("\nPressione [Enter] para continuar.");
                                    comando = ler.nextLine();
                                    break;
                                case "4":
                                    voltarAoMenu = true;
                                    break;
                                default:
                                    System.out.println(mensagemErro);
                                    comando = ler.nextLine();
                                    break;
                            }

                        }while(!voltarAoMenu);
                        break;

                    //Gerenciar professores.
                    case "3":
                        do {
                            System.out.println("========== Professores ==========\n" +
                                    "1 - Adicionar professor.\n" +
                                    "2 - Deletar professor.\n" +
                                    "3 - Listar professores.\n" +
                                    "4 - Dar aula.\n" +
                                    "5 - Voltar ao menu principal.\n" +
                                    "\nDica: se não souber o dado de algum(a) professor(a) é só usar a função 'Listar professores'.\n\nDigite o número do comando e pressione [Enter]:");
                            comando = ler.nextLine();
                            switch (comando){
                                //Adicionar professor.
                                case "1":
                                    lista = professor.menuCadastroProfessor();
                                    professor.mensagemConfirmacaoProfessor(lista);
                                    System.out.println("Tem certeza que quer cadastrar esse(a) professor(a)?\n\n1 - Sim.\n2 - Não.\n\nDigite o número da resposta e pressione [Enter]:");
                                    comando = ler.nextLine();
                                    switch (comando){
                                        case "1":
                                            professor.setNome(lista.get(0));
                                            professor.setCpf(Long.parseLong(lista.get(1)));
                                            professor.setIdade(Integer.parseInt(lista.get(2)));
                                            professor.setOcupacao(lista.get(3));
                                            professor.setCentro(lista.get(4));
                                            boolean cadastradoProfessor = professor.cadastrarProfessor(professor.getCpf(), professor);
                                            if (!cadastradoProfessor) {
                                                System.out.println("Este CPF já foi cadastrado anteriormente na lista Professores!");
                                                comando = ler.nextLine();
                                            }
                                            else {
                                                System.out.println("O(A) professor(a) foi cadastrado(a) com sucesso!\n\nPressione [Enter] para continuar.");
                                                comando = ler.nextLine();
                                            }
                                        case "2":
                                            break;
                                        default:
                                            System.out.println(mensagemErro);
                                            comando = ler.nextLine();
                                            break;
                                    }
                                    break;
                                //Deletar professor.
                                case "2":
                                    professor.listarProfessores();
                                    System.out.println("Digite o CPF do(a) professor(a) a ser deletado(a): ");
                                    cpf = Long.parseLong(ler.nextLine());
                                    if(professor.existeProfessor(cpf)){
                                        professor = professor.obterDadosProfessor(cpf);
                                        System.out.println("Tem certeza que quer deletar o(a) seguinte professor(a)?\n\nNome: " + professor.getNome() + "\nCPF: " + professor.getCpf()  + "\nCentro: " + professor.getCentro() + ", Idade: " + professor.getIdade() + "\n\n1 - Sim.\n2 - Não.\n\nDigite o número do comando e pressione [Enter]:");
                                        comando = ler.nextLine();
                                        switch (comando){
                                            case "1":
                                                professor.deletarProfessor(cpf);
                                                System.out.println("Professor(a) deletado(a) com sucesso!\n\nPressione [Enter] para continuar.");
                                                comando = ler.nextLine();
                                                break;
                                            case "2":
                                                break;
                                            default:
                                                System.out.println(mensagemErro);
                                                comando = ler.nextLine();
                                                break;
                                        }
                                    }
                                    else {
                                        System.out.println("Professor(a) não encontrado(a)!\n\nPressione [Enter] para continuar.");
                                        comando = ler.nextLine();
                                    }
                                    break;
                                //Listar professores
                                case "3":
                                    System.out.println("========== Professores ==========");
                                    professor.listarProfessores();
                                    System.out.println("\nPressione [Enter] para continuar.");
                                    comando = ler.nextLine();
                                    break;
                                //Dar aula.
                                case "4":
                                    professor.listarProfessores();
                                    System.out.println("Digite o CPF do(a) professor(a) que vai dar aula: ");
                                    cpf = Long.parseLong(ler.nextLine());
                                    if(professor.existeProfessor(cpf)){
                                        professor = professor.obterDadosProfessor(cpf);
                                        turma.listarTurmas();
                                        System.out.println("=============== Turmas ===============\n");
                                        turma.listarTurmas();
                                        System.out.println("Digite o código da turma que o(a) professor(a) vai dar aula: ");
                                        int codigoTurma = Integer.parseInt(ler.nextLine());
                                        if(turma.existeTurma(codigoTurma)){
                                            turma = turma.obterDadosTurma(codigoTurma);
                                            if(turma.getDisciplina().getNome().equalsIgnoreCase(professor.getCentro())){
                                                if(turma.getProfessor().getCpf() == professor.getCpf()){
                                                    professor.darAula(turma.getCodigo());
                                                    System.out.println("\nPressione [Enter] para continuar.");
                                                    comando = ler.nextLine();
                                                }
                                                else{
                                                    do {
                                                        System.out.println("Alerta!\nO(A) professor(a) não é o professor(a) dessa turma!\nQuer que ele(a) der aula mesmo assim?\n\n1 - Sim.\n2 - Não.\n\nDigite o número do comando e pressione [Enter]:");
                                                        comando = ler.nextLine();
                                                        switch (comando) {
                                                            case "1":
                                                                professor.darAula(turma.getCodigo());
                                                                System.out.println("\nPressione [Enter] para continuar.");
                                                                comando = ler.nextLine();
                                                                break;
                                                            case "2":
                                                                break;
                                                            default:
                                                                System.out.println(mensagemErro);
                                                                comando = ler.nextLine();
                                                                break;
                                                        }
                                                    }while (!comando.equals("1") || !comando.equals("2"));
                                                }
                                            }
                                            else {
                                                System.out.println("O professor não ensina a disciplina dessa turma!\nEssa turma é de " + turma.getDisciplina().getNome() + "e o professor ensina " + professor.getCentro() + "\n\nPressione [Enter] para continuar.");
                                                comando = ler.nextLine();
                                            }
                                        }
                                        else {
                                            System.out.println("Turma não encontrado(a)!\n\nPressione [Enter]:");
                                            comando = ler.nextLine();
                                        }
                                    }
                                    else{
                                        System.out.println("Professor(a) não encontrado(a)!\n\nPressione [Enter] para continuar.");
                                        comando = ler.nextLine();
                                    }
                                    break;
                                //Sair.
                                case "5":
                                    voltarAoMenu = true;
                                    break;
                                default:
                                    System.out.println(mensagemErro);
                                    comando = ler.nextLine();
                                    break;
                            }
                        }while(!voltarAoMenu);
                        break;

                    //Gerenciar turmas.
                    case "4":
                        do {
                            System.out.println("========== Turmas ==========\n" +
                                    "1 - Adicionar turma.\n" +
                                    "2 - Remover turma.\n" +
                                    "3 - Listar turmas.\n" +
                                    "4 - Exibir dados de uma turma.\n" +
                                    "5 - Adicionar um aluno a uma turma.\n" +
                                    "6 - Remover um aluno de uma turma.\n" +
                                    "7 - Voltar ao menu.\n" +
                                    "\nDica: se não souber o dado de alguma turma é só usar a função 'Listar turmas'.\n\nDigite o número do comando desejado e pressione [Enter]:");
                            comando = ler.nextLine();
                            switch (comando){
                                //Adicionar turma
                                case "1":
                                    disciplina.listarDisciplinas();
                                    System.out.println("\nDigite o código da disciplina e pressione [Enter]: ");
                                    codigo = Integer.parseInt(ler.nextLine());
                                    if(disciplina.existeDisciplina(codigo)){
                                        disciplina = disciplina.obterDadosDisciplina(codigo);
                                        turma.setDisciplina(disciplina);
                                        professor.listarProfessores();
                                        System.out.println("\nDigite o CPF do(a) professor(a) e pressione [Enter]: ");
                                        cpf = Long.parseLong(ler.nextLine());
                                        if(professor.existeProfessor(cpf)){
                                            professor = professor.obterDadosProfessor(cpf);
                                            turma.setProfessor(professor);
                                            boolean turmaCadastrada;
                                            System.out.println("Quer copiar os alunos de alguma turma existente?\n1 - Sim.\n2 - Não.\n\nDigite o número do comando e pressione [Enter]: ");
                                            comando = ler.nextLine();
                                            switch (comando){
                                                case "1":
                                                    turma.listarTurmas();
                                                    System.out.println("Digite o código da turma a ter seus alunos copiados e pressione [Enter]: ");
                                                    codigo = Integer.parseInt(ler.nextLine());
                                                    if (turma.existeTurma(codigo)){
                                                        turma.setAlunos(turma.obterAlunos(codigo));
                                                        System.out.println("Tem certeza que quer cadastrar essa turma?\n\nDisciplina\nNome: " + disciplina.getNome() + ", Semestre: " + disciplina.getSemestre() + "\nProfessor\nNome: " + professor.getNome() + ", CPF: " + professor.getCpf() + ", Centro: " + professor.getCentro() + "\nAlunos");
                                                        for(int i = 0; i < turma.getAlunos().size(); i++){
                                                            System.out.println("Matricula: " + turma.getAlunos().get(i).getMatricula() + ", Nome: " + turma.getAlunos().get(i).getNome());
                                                        }
                                                        System.out.println("\n\n1 - Sim.\n2 - Não.\n\nDigite o número do comando e pressione [Enter]: ");
                                                        comando = ler.nextLine();
                                                        switch (comando){
                                                            case "1":
                                                                turma.definirCodigoTurma();
                                                                turmaCadastrada = turma.cadastrarTurma(turma);
                                                                if(turmaCadastrada){
                                                                    System.out.println("Turma cadastrada com sucesso!\n\nPressione [Enter] para continuar.");
                                                                    comando = ler.nextLine();
                                                                }
                                                                else {
                                                                    System.out.println(mensagemErro);
                                                                    comando = ler.nextLine();
                                                                }
                                                                break;
                                                            case "2":
                                                                break;
                                                            default:
                                                                System.out.println(mensagemErro);
                                                                comando = ler.nextLine();
                                                                break;
                                                        }
                                                    }
                                                    else {
                                                        System.out.println("Turma não encontrada!\nVerifique se você digitou o código corretamente e tente novamente.\n\nPressione [Enter] para continuar.");
                                                        comando = ler.nextLine();
                                                    }
                                                    break;
                                                case "2":
                                                    System.out.println("Tem certeza que quer cadastrar essa turma?\n\nDisciplina\nNome: " + disciplina.getNome() + ", Semestre: " + disciplina.getSemestre() + "\nProfessor\nNome: " + professor.getNome() + ", CPF: " + professor.getCpf() + ", Centro: " + professor.getCentro() + "\n\n1 - Sim.\n2 - Não.\n\nDigite o número do comando e pressione [Enter]: ");
                                                    comando = ler.nextLine();
                                                    switch (comando){
                                                        case "1":
                                                            turma.definirCodigoTurma();
                                                            turmaCadastrada = turma.cadastrarTurma(turma);
                                                            if(turmaCadastrada){
                                                                System.out.println("Turma cadastrada com sucesso!\n\nPressione [Enter] para continuar.");
                                                                comando = ler.nextLine();
                                                            }
                                                            else {
                                                                System.out.println(mensagemErro);
                                                                comando = ler.nextLine();
                                                            }
                                                            break;
                                                        case "2":
                                                            break;
                                                        default:
                                                            System.out.println(mensagemErro);
                                                            comando = ler.nextLine();
                                                            break;
                                                    }
                                                    break;
                                                default:
                                                    System.out.println(mensagemErro);
                                                    comando = ler.nextLine();
                                                    break;
                                            }
                                        }
                                        else {
                                            System.out.println("Não existe professor(a) com esse CPF!\n\nPressione [Enter] para continuar.");
                                            comando = ler.nextLine();
                                        }
                                    }
                                    else{
                                        System.out.println("Não existe disciplina com esse código!\n\nPressione [Enter] para continuar.");
                                        comando = ler.nextLine();
                                    }
                                    break;
                                //Remover turma.
                                case "2":
                                    turma.listarTurmas();
                                    System.out.println("Digite o código da turma a ser deletada: ");
                                    codigo = Integer.parseInt(ler.nextLine());
                                    if(turma.existeTurma(codigo)){
                                        System.out.println("Tem certeza que quer deletar a seguinte turma?\n");
                                        turma.exibirDadosTurma(codigo);
                                        System.out.println("\n1 - Sim.\n2 - Não.\n\nDigite o número do comando e pressione [Enter]: ");
                                        comando = ler.nextLine();
                                        switch (comando){
                                            case "1":
                                                boolean deletada = turma.deletarTurma(codigo);
                                                if(deletada){
                                                    System.out.println("Turma deletada com sucesso!\n\nPressione [Enter] para continuar.");
                                                    comando = ler.nextLine();
                                                }
                                                else {
                                                    System.out.println(mensagemErro);
                                                    comando = ler.nextLine();
                                                }
                                                break;
                                            case "2":
                                                break;
                                            default:
                                                System.out.println(mensagemErro);
                                                comando = ler.nextLine();
                                                break;
                                        }
                                    }
                                    break;
                                //Listar turmas.
                                case "3":
                                    turma.listarTurmas();
                                    System.out.println("\nPressione [Enter] para continuar.");
                                    comando = ler.nextLine();
                                    break;
                                //Exibir dados de uma turma.
                                case "4":
                                    turma.listarTurmas();
                                    System.out.println("Digite o código da turma:");
                                    codigo = Integer.parseInt(ler.nextLine());
                                    if(turma.existeTurma(codigo)){
                                        turma.exibirDadosTurma(codigo);
                                        System.out.println("\nPressione [Enter] para continuar.");
                                        comando = ler.nextLine();
                                    }
                                    else{
                                        System.out.println("Nenhuma turma encontrada com esse código!\n\nPressione [Enter] para continuar.");
                                        comando = ler.nextLine();
                                    }
                                    break;
                                //Adicionar um aluno a uma turma.
                                case "5":
                                    turma.listarTurmas();
                                    System.out.println("Digite o código da turma: ");
                                    codigo = Integer.parseInt(ler.nextLine());
                                    if(turma.existeTurma(codigo)){
                                        turma = turma.obterDadosTurma(codigo);
                                        aluno.listarAlunos();
                                        System.out.println("Digite a matricula do(a) aluno(a) a ser adicionado(a) na turma: ");
                                        codigo = Integer.parseInt(ler.nextLine());
                                        if(!turma.existeEsseAlunoNaTurma(codigo, turma.getCodigo())){
                                            aluno = aluno.obterDadosAluno(codigo);
                                            System.out.println("Quer adicionar esse(a) aluno(a):\n\nNome: " + aluno.getNome() + ", Matricula: " + aluno.getMatricula() + "\n\nNessa turma?\n\nDisciplina: " + turma.getDisciplina().getNome() + ", Semestre: " + turma.getDisciplina().getSemestre() + ", Professor: " + turma.getProfessor().getNome() + "\n\n1 - Sim.\n2 - Não.\n\nDigite o número do comando e pressione [Enter]: ");
                                            comando = ler.nextLine();
                                            switch (comando){
                                                case "1":
                                                    boolean adicionado = turma.adicionarAluno(aluno, turma.getCodigo());
                                                    if(adicionado){
                                                        System.out.println("Aluno(a) adicionado(a) com sucesso!\n\nPressione [Enter] para continuar.");
                                                        comando = ler.nextLine();
                                                    }
                                                    else{
                                                        System.out.println(mensagemErro);
                                                        comando = ler.nextLine();
                                                    }
                                                    break;
                                                case "2":
                                                    break;
                                                default:
                                                    System.out.println(mensagemErro);
                                                    comando = ler.nextLine();
                                                    break;
                                            }
                                        }
                                        else{
                                            System.out.println("Esse(a) aluno(a) já está nesta turma então não pode ser adicionado(a)!\n\nPressione [Enter] para continuar.");
                                            comando = ler.nextLine();
                                        }
                                    }
                                    else{
                                        System.out.println("Nenhuma turma encontrada com esse código!\n\nPressione [Enter] para continuar.");
                                        comando = ler.nextLine();
                                    }
                                    break;
                                //Remover um aluno de uma turma.
                                case "6":
                                    turma.listarTurmas();
                                    System.out.println("Digite o código da turma: ");
                                    codigo = Integer.parseInt(ler.nextLine());
                                    if(turma.existeTurma(codigo)){
                                        turma = turma.obterDadosTurma(codigo);
                                        turma.exibirDadosTurma(turma.getCodigo());
                                        System.out.println("Digite a matricula do(a) aluno(a) a ser removido(a) da turma: ");
                                        codigo = Integer.parseInt(ler.nextLine());
                                        if(turma.existeEsseAlunoNaTurma(codigo, turma.getCodigo())){
                                            aluno = aluno.obterDadosAluno(codigo);
                                            System.out.println("Quer deletar esse(a) aluno(a):\n\nNome: " + aluno.getNome() + ", Matricula: " + aluno.getMatricula() + "\n\nDessa turma?\n\nDisciplina: " + turma.getDisciplina().getNome() + ", Semestre: " + turma.getDisciplina().getSemestre() + ", Professor: " + turma.getProfessor().getNome() + "\n\n1 - Sim.\n2 - Não.\n\nDigite o número do comando e pressione [Enter]: ");
                                            comando = ler.nextLine();
                                            switch (comando){
                                                case "1":
                                                    boolean deletado = turma.removerAluno(turma.getCodigo(), aluno.getMatricula());
                                                    if (deletado){
                                                        System.out.println("Aluno(a) removido(a) da turma com sucesso!\n\nPressione [Enter] para continuar.");
                                                        comando = ler.nextLine();
                                                    }
                                                    else {
                                                        System.out.println(mensagemErro);
                                                        comando = ler.nextLine();
                                                    }
                                                    break;
                                                case "2":
                                                    break;
                                                default:
                                                    System.out.println(mensagemErro);
                                                    comando = ler.nextLine();
                                                    break;
                                            }
                                        }
                                        else{
                                            System.out.println("Esse(a) aluno(a) não está nesta turma!\n\nPressione [Enter] para continuar.");
                                            comando = ler.nextLine();
                                        }
                                    }
                                    else{
                                        System.out.println("Nenhuma turma encontrada com esse código!\n\nPressione [Enter] para continuar.");
                                        comando = ler.nextLine();
                                    }
                                    break;
                                //Voltar ao menu principal.
                                case "7":
                                    voltarAoMenu = true;
                                    break;
                                default:
                                    System.out.println(mensagemErro);
                                    comando = ler.nextLine();
                                    break;
                            }
                        }while(!voltarAoMenu);
                        break;

                    //Gerenciar visitantes.
                    case "5":
                        do {
                            System.out.println("========== Visitantes ==========\n" +
                                    "1 - Adicionar visitante.\n" +
                                    "2 - Deletar visitante.\n" +
                                    "3 - Listar visitantes.\n" +
                                    "4 - Voltar ao menu principal.\n" +
                                    "\nDica: se não souber o dado de algum(a) visitante é só usar a função 'Listar visitantes'.\n\nDigite o número do comando e pressione [Enter]:");
                            comando = ler.nextLine();
                            switch (comando){
                                //Adicionar visitante.
                                case "1":
                                    lista = visitante.menuDeCadastro("VISITANTE");
                                    visitante.mensagemConfirmacaoCadastro(lista);
                                    System.out.println("Tem certeza que quer cadastrar esse(a) visitante?\n\n1 - Sim.\n2 - Não.\n\nDigite o número da resposta e pressione [Enter]:");
                                    comando = ler.nextLine();
                                    switch (comando){
                                        case "1":
                                            visitante.setNome(lista.get(0));
                                            visitante.setCpf(Long.parseLong(lista.get(1)));
                                            visitante.setIdade(Integer.parseInt(lista.get(2)));
                                            visitante.setOcupacao(lista.get(3));
                                            boolean cadastradoVisitante = visitante.cadastrarPessoa(visitante.getCpf(), visitante);
                                            if (!cadastradoVisitante) {
                                                System.out.println("Este CPF já foi cadastrado anteriormente na lista Visitantes!");
                                                comando = ler.nextLine();
                                            }
                                            else {
                                                System.out.println("O(A) visitante foi cadastrado(a) com sucesso!\n\nPressione [Enter] para continuar.");
                                                comando = ler.nextLine();
                                            }
                                        case "2":
                                            break;
                                        default:
                                            System.out.println(mensagemErro);
                                            comando = ler.nextLine();
                                            break;
                                    }
                                    break;
                                //Deletar visitante.
                                case "2":
                                    System.out.println("========== Visitantes ==========");
                                    visitante.listarPessoasPorOcupacao("VISITANTE");
                                    System.out.println("Digite o CPF do(a) vsistante a ser deletado(a): ");
                                    cpf = Long.parseLong(ler.nextLine());
                                    if(visitante.existe(cpf)){
                                        visitante = visitante.obterDadosVisitante(cpf);
                                        System.out.println("Tem certeza que quer deletar o(a) seguinte visitante?\n\nNome: " + visitante.getNome() + "\nCPF: " + visitante.getCpf()  + "\nIdade: " + visitante.getIdade() + "\n\n1 - Sim.\n2 - Não.\n\nDigite o número do comando e pressione [Enter]:");
                                        comando = ler.nextLine();
                                        switch (comando){
                                            case "1":
                                                professor.deletarPessoa(cpf);
                                                System.out.println("Visitante deletado(a) com sucesso!\n\nPressione [Enter] para continuar.");
                                                comando = ler.nextLine();
                                                break;
                                            case "2":
                                                break;
                                            default:
                                                System.out.println(mensagemErro);
                                                comando = ler.nextLine();
                                                break;
                                        }
                                    }
                                    else {
                                        System.out.println("Visitante não encontrado(a)!\n\nPressione [Enter] para continuar.");
                                        comando = ler.nextLine();
                                    }
                                    break;
                                //Listar visitantes.
                                case "3":
                                    System.out.println("========== Visitantes ==========");
                                    visitante.listarPessoasPorOcupacao("VISITANTE");
                                    System.out.println("\nPressione [Enter] para continuar.");
                                    comando = ler.nextLine();
                                    break;
                                //Sair.
                                case "4":
                                    voltarAoMenu = true;
                                    break;
                                default:
                                    System.out.println(mensagemErro);
                                    comando = ler.nextLine();
                                    break;
                            }
                        }while(!voltarAoMenu);
                        break;

                    //Fazer aniversário.
                    case "6":
                        System.out.println("========== Fazer Aniversário ==========\n");
                        pessoa.listarPessoas();
                        System.out.println("\nDigite o CPF do(a) aniversariante: ");
                        cpf = Long.parseLong(ler.nextLine());
                        if (pessoa.existe(cpf)) {
                            pessoa = pessoa.obterDadosPessoa(cpf);
                            if (pessoa.getOcupacao().equalsIgnoreCase("VISITANTE")){
                                visitante.obterDadosVisitante(cpf);
                                visitante.fazerAniversario(cpf);
                                System.out.println("Pressione [Enter] para continuar.");
                                comando = ler.nextLine();
                            }
                            else if (pessoa.getOcupacao().equalsIgnoreCase("PROFESSOR")){
                                professor = professor.obterDadosProfessor(cpf);
                                professor.fazerAniversario(cpf);
                                System.out.println("Pressione [Enter] para continuar.");
                                comando = ler.nextLine();
                            }
                            else if (pessoa.getOcupacao().equalsIgnoreCase("ALUNO")){
                                aluno = aluno.obterDadosAlunoPorCPF(cpf);
                                if (aluno.isBolsista()){
                                    bolsista.fazerAniversario(aluno.getCpf());
                                    System.out.println("Pressione [Enter] para continuar.");
                                    comando = ler.nextLine();
                                }
                                else{
                                    aluno.fazerAniversario(cpf);
                                    System.out.println("Pressione [Enter] para continuar.");
                                    comando = ler.nextLine();
                                }
                            }
                        }
                        else {
                            System.out.println("A pessoa com esse CPF não foi cadastrada!\n\nPressione [Enter] para continuar.");
                            comando = ler.nextLine();
                        }
                        break;

                    //Sair
                    case "7":
                        System.out.println("Tem certeza que quer sair?\nSe você sair todos os dados inseridos e\nalterados serão perdidos!\n\n1 - Sair\n2 - Não sair.\n\nDigite o número do comando e pressione [Enter]:");
                        comando = ler.nextLine();
                        switch (comando){
                            case "1":
                                sair = true;
                                break;
                            case "2":
                                break;
                            default:
                                System.out.println(mensagemErro);
                                comando = ler.nextLine();
                                break;
                        }
                        break;
                    default:
                        System.out.println(mensagemErro);
                        comando = ler.nextLine();
                        break;
                    }

            }catch (Exception A){
                System.out.println(mensagemErro);
                comando = ler.nextLine();
            }
        }while (sair == false);
        System.out.println("=============== Equipe 86 ===============\n\n" +
                        "Ilana das Neves Barbosa - Matrícula: 2326948\n" +
                        "Ionara dos Santos Ferreira - Matrícula: 2326251\n" +
                        "Joao Pedro Almeida Santos - Matrícula: 2327071\n" +
                        "Lucas Kauã Portela da Silva Nogueira - Matrícula: 2323857\n" +
                        "Maria Vitoria Sampaio da Silva - Matrícula: 2323856\n" +
                        "Vivian Leigh Teixeira Salvi - Matrícula: 2313542\n");
    }
}