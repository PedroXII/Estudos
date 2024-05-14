import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String comando;
        int codigo;
        boolean sair = false, voltarAoMenu = false;
        Scanner ler = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        Aluno aluno = new Aluno();
        Bolsista bolsista = new Bolsista();
        Disciplina disciplina = new Disciplina();
        Professor professor = new Professor();
        Visitante visitante = new Visitante();
        String mensagemErro = "ERRO!\nVerifique se você inseriu os dados corretamente e tente de novo.\nPressione [Enter] para continuar.";

        Aluno a1 = new Aluno();
        a1.setNome("Ana Julia");
        a1.setCpf(Long.parseLong("08541721401"));
        a1.setIdade(30);
        a1.setOcupacao("ALUNO");
        a1.setBolsista(false);
        a1.gerarMatricula();
        a1.cadastrarAluno(a1.getCpf(), a1);

        Aluno a2 = new Aluno();
        a2.setNome("Virginia Santos");
        a2.setCpf(Long.parseLong("06382915734"));
        a2.setIdade(27);
        a2.setOcupacao("ALUNO");
        a2.setBolsista(false);
        a2.gerarMatricula();
        a2.cadastrarAluno(a2.getCpf(), a2);

        Bolsista b1 = new Bolsista();
        b1.setNome("Paulo Andrade");
        b1.setCpf(Long.parseLong("42528464231"));
        b1.setIdade(32);
        b1.setOcupacao("ALUNO");
        b1.setBolsista(true);
        b1.setBolsa(50);
        b1.gerarMatricula();
        b1.cadastrarBolsista(b1.getCpf(), b1);

        Bolsista b2 = new Bolsista();
        b2.setNome("Carlos Luiz");
        b2.setCpf(Long.parseLong("37418924560"));
        b2.setIdade(29);
        b2.setOcupacao("ALUNO");
        b2.setBolsista(true);
        b2.setBolsa(75);
        b2.gerarMatricula();
        b2.cadastrarBolsista(b2.getCpf(), b2);

        Disciplina d1 = new Disciplina();
        d1.setNome("Matemática");
        d1.setSemestre(1);
        d1.definirCodigoDisciplina();
        d1.cadastrarDisciplina(d1);

        Disciplina d2 = new Disciplina();
        d2.setNome("Biologia");
        d2.setSemestre(2);
        d2.definirCodigoDisciplina();
        d2.cadastrarDisciplina(d2);

        /*
        Professor p1 = new Professor();
        Professor p2 = new Professor();
        Visitante v1 = new Visitante();
        Visitante v2 = new Visitante();
        */
        do {
            //try{
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
                                "5 - Voltar para o menu principal.\n\n" +
                                "Digite o número do comando desejado e pressione [Enter]:");
                            comando = ler.nextLine();
                            switch (comando){
                                //Cadastrar aluno.
                                case "1":
                                    System.out.println("O aluno é bolsista?\n\n1 - Sim.\n2 - Não.\n3 - Cancelar cadastro.\n\nDigite o número da resposta e pressione [Enter]:");
                                    comando = ler.nextLine();
                                    switch (comando){
                                        case "1":
                                            lista = bolsista.menuDeCadastroAlunoBolsista();
                                            bolsista.mensagemConfirmacaoAlunoBolsista(lista);
                                            System.out.println("Tem certeza que quer cadastrar esse aluno?\n\n1 - Sim.\n2 - Não.\n\nDigite o número da resposta e pressione [Enter]:");
                                            comando = ler.nextLine();
                                            switch (comando){
                                                case "1":
                                                    bolsista.setNome(lista.get(0));
                                                    bolsista.setCpf(Long.parseLong(lista.get(1)));
                                                    bolsista.setIdade(Integer.parseInt(lista.get(2)));
                                                    bolsista.setOcupacao(lista.get(3));
                                                    bolsista.setBolsista(Boolean.parseBoolean(lista.get(4)));
                                                    bolsista.gerarMatricula();
                                                    bolsista.setBolsa(Integer.parseInt((lista.get(5))));
                                                    boolean existeBolsista = bolsista.cadastrarBolsista(bolsista.getCpf(), bolsista);
                                                    if (existeBolsista) {
                                                        System.out.println("Este CPF já foi cadastrado anteriormente na lista Bolsistas!");
                                                        comando = ler.nextLine();
                                                    }
                                                    if (!existeBolsista){
                                                        bolsista.ordenarPessoas();
                                                        bolsista.ordenarAlunos();
                                                        bolsista.ordenarBolsistas();
                                                        System.out.println("O aluno foi cadastrado com sucesso!\n\nPressione [Enter] para continuar.");
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
                                            System.out.println("Tem certeza que quer cadastrar esse aluno?\n\n1 - Sim.\n2 - Não.\n\nDigite o número da resposta e pressione [Enter]:");
                                            comando = ler.nextLine();
                                            switch (comando){
                                                case "1":
                                                    aluno.setNome(lista.get(0));
                                                    aluno.setCpf(Long.parseLong(lista.get(1)));
                                                    aluno.setIdade(Integer.parseInt(lista.get(2)));
                                                    aluno.setOcupacao(lista.get(3));
                                                    aluno.setBolsista(Boolean.parseBoolean(lista.get(4)));
                                                    aluno.gerarMatricula();
                                                    boolean existeAluno = aluno.cadastrarAluno(aluno.getCpf(), aluno);
                                                    if (existeAluno) {
                                                        System.out.println("Este CPF já foi cadastrado anteriormente na lista Alunos!");
                                                        comando = ler.nextLine();
                                                    }
                                                    if (!existeAluno){
                                                        aluno.ordenarPessoas();
                                                        aluno.ordenarAlunos();
                                                        System.out.println("O aluno foi cadastrado com sucesso!\n\nPressione [Enter] para continuar.");
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
                                    System.out.println("========== LISTA DE ALUNOS ==========");
                                    aluno.listarAlunos();
                                    System.out.println("\nPressione [Enter] para continuar.");
                                    comando = ler.nextLine();
                                    break;
                                //Remover aluno.
                                case "3":
                                    System.out.println("Digite a matricula do aluno a ser deletado:");
                                    int matricula = Integer.parseInt(ler.nextLine());
                                    if(aluno.existeMatricula(matricula)){
                                        aluno = aluno.obterDadosAluno(matricula);
                                        System.out.println("Tem certeza que quer deletar o seguinte aluno?\n");
                                        aluno.exibirDadosPessoa(aluno.getCpf());
                                        System.out.println("\n1 - Sim.\n2 - Não.\n\nDigite o comando desejado e pressione [Enter]:");
                                        comando = ler.nextLine();
                                        if(aluno.isBolsista()){
                                            bolsista = bolsista.obterDadosAlunoBolsista(matricula);
                                            switch (comando){
                                                case "1":
                                                    bolsista.deletarAlunoBolsista(bolsista.getMatricula());
                                                    System.out.println("Aluno deletado com sucesso!\n\nPressione [Enter] para continuar.");
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
                                            aluno = aluno.obterDadosAluno(matricula);
                                            switch (comando){
                                                case "1":
                                                    aluno.deletarAluno(matricula);
                                                    System.out.println("Aluno deletado com sucesso!\n\nPressione [Enter] para continuar.");
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
                                    System.out.println("Digite a matricula do aluno que vai pagar mensalidade:");
                                    matricula = Integer.parseInt(ler.nextLine());
                                    if(aluno.existeMatricula(matricula)) {
                                        if (aluno.isBolsista()) {
                                            bolsista = bolsista.obterDadosAlunoBolsista(matricula);
                                            System.out.println("========== Aluno ==========\n");
                                            bolsista.exibirDadosPessoa(matricula);
                                            System.out.println("Este aluno tem uma bolsa de " + bolsista.getBolsa() + "%.\n\n" + "Mensalidade: " + bolsista.pagarMensalidadeBolsista(bolsista.getCpf()) + "\nPagar mensalidade?\n\n1 - Sim.\n2 - Não.\n\nDigite o comando desejado e pressione [Enter]:");
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
                                            aluno = aluno.obterDadosAluno(matricula);
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
                                    "4 - Voltar ao menu principal.");
                            comando = ler.nextLine();
                            //Adicionar disciplina.
                            switch (comando){
                                case "1":
                                    System.out.println("Digite o nome da disciplina: ");
                                    disciplina.setNome(ler.nextLine());
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
                                        System.out.println("Tem certeza que quer cadastrar a seguinte Disciplina?\n\nNome: " + disciplina.getNome() + "\nSemestre: " + disciplina.getSemestre() + "\n\n1 - Sim.\n2 - Não.\n\nDigite o número do comando e pressione [Enter]:");
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
                                    break;
                                //Listar disciplina.
                                case "3":
                                    System.out.println("========== Disciplinas ==========");
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

                    //Gerenciar professores.
                    case "3":

                        break;

                    //Gerenciar turmas.
                    case "4":

                        break;

                    //Gerenciar visitantes.
                    case "5":

                        break;

                    //Fazer aniversário.
                    case "6":

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

            /*}catch (Exception A){
                System.out.println(mensagemErro);
                comando = ler.nextLine();
            }*/
        }while (sair == false);
    }
}