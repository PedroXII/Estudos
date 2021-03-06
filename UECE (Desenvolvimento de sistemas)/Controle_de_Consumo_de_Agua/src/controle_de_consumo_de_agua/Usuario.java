package controle_de_consumo_de_agua;

import java.util.GregorianCalendar;

public class Usuario {
    
    private int id;
    private String nome;
    private double peso;
    private String sexo;
    private boolean gestante;
    private int dian;
    private int mesn;
    private int anon;
    private int vezes;
    private int quantidade;
    private boolean amamentando;
    private double metame;
    private String metacl;
    private String senha;
    private int diaatual;
    private int mesatual;
    private int anoatual;
    private int idade;
    private int id_table;
    private String nome_antigo;
    private int rows;

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
    
    public String getMetacl() {
        return metacl;
    }

    public void setMetacl(String metacl) {
        this.metacl = metacl;
    }
    
    public String getNome_antigo() {
        return nome_antigo;
    }

    public void setNome_antigo(String nome_antigo) {
        this.nome_antigo = nome_antigo;
    }
    
    public int getId_table() {
        return id_table;
    }

    public void setId_table(int id_table) {
        this.id_table = id_table;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getDiaatual() {
        GregorianCalendar Dia = new GregorianCalendar();
        diaatual = Dia.get(GregorianCalendar.DAY_OF_MONTH);
        return diaatual;
    }

    public int getMesatual() {
        GregorianCalendar Mes = new GregorianCalendar();
        mesatual = Mes.get(GregorianCalendar.MONTH)+1;
        return mesatual;
    }

    public int getAnoatual() {
        GregorianCalendar Ano = new GregorianCalendar();
        anoatual = Ano.get(GregorianCalendar.YEAR);
        return anoatual;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public double getMetame() {
        return metame;
    }

    public void setMetame(double metame) {
        this.metame = metame;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isGestante() {
        return gestante;
    }

    public void setGestante(boolean gestante) {
        this.gestante = gestante;
    }

    public int getDian() {
        return dian;
    }

    public void setDian(int dian) {
        this.dian = dian;
    }

    public int getMesn() {
        return mesn;
    }

    public void setMesn(int mesn) {
        this.mesn = mesn;
    }

    public int getAnon() {
        return anon;
    }

    public void setAnon(int anon) {
        this.anon = anon;
    }
    
    public int getVezes() {
        return vezes;
    }

    public void setVezes(int vezes) {
        this.vezes = vezes;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isAmamentando() {
        return amamentando;
    }

    public void setAmamentando(boolean amamentando) {
        this.amamentando = amamentando;
    }
    
    public int Idade(){
    
    GregorianCalendar Hoje = new GregorianCalendar();
        int diaa = Hoje.get(GregorianCalendar.DAY_OF_MONTH);
        int mesa = Hoje.get(GregorianCalendar.MONTH)+1;
        int anoa = Hoje.get(GregorianCalendar.YEAR);
    
    return (31 - this.dian) + (365 - (this.mesn + 1) * 30) + (anoa - this.anon - 1) * 365 + diaa + (mesa * 30);
    }
    
    public int Bebe(){
        return (this.Idade() % 365) / 30;}
    
    public int IdadeC(){
        return this.Idade() / 365;}
    
    public String PadraoBebeCatracaLivre(){
        return
            "Nome: " + this.nome + "\n" +
            "Idade: " + this.Bebe() + " meses.\n" +
            "Sexo: " + this.sexo + "\n" +
            "Quantidade de ??gua ingerida: " + this.quantidade + " ml.\n";}
    
    public String PadraoAdultoCatracaLivre(){
        return
            "Nome: " + this.nome + "\n" +
            "Idade: " + IdadeC() + " anos.\n" +
            "Sexo: " + this.sexo + "\n" +
            "Quantidade de ??gua ingerida: " + this.quantidade + " ml.\n" +
            "\nObs: O peso tamb??m afeta na quantidade de ??gua que deve\n" +
            "ser ingerida.";}
    
    public String PadraoBebeMundoEducacao(){
        return
            "Nome: " + this.nome + "\n" +
            "Idade: " + this.Bebe() + " meses.\n" +
            "Sexo: " + this.sexo + "\n" +
            "Peso: " + this.peso + "kg\n" +
            "Quantidade de ??gua ingerida: " + this.quantidade + " ml.\n";}
    
    public String PadraoAdultoMundoEducacao(){
        return
            "Nome: " + this.nome + "\n" +
            "Idade: " + IdadeC() + " anos.\n" +
            "Sexo: " + this.sexo + "\n" +
            "Peso: " + this.peso + "kg\n" +
            "Quantidade de ??gua ingerida: " + this.quantidade + " ml.\n" +
            "Obs: a idade tamb??m afeta na quantidade de ??gua a ser ingerida.\n";}
    
    public String AvisoMetaDiariaAtingida(){
        return
            "\nMeta di??ria atingida!\n";}
    
    public String AvisoMuitaAgua(){
        return
            "\n" + this.nome + " bebeu ??gua demais!\n";}
    
    public String AvisoPoucaAgua(){
        return
            "\n" + this.nome + " bebeu pouca ??gua!\n";}
    
    public String PoucaAgua(){
        return
            "\nExistem algumas consequ??ncias bem perigosas em beber pouca ??gua,\n" +
            "o organismo pode responder negativamente a isso de diferentes maneiras.\n" +
            "Uma das consequ??ncias negativas de mais f??cil percep????o ?? o envelhecimento da pele.\n" +
            "A desidrata????o limita as atividades do c??rebro e pode causar dificuldades cognitivas \n" +
            "como perda de concentra????o e problemas de memoriza????o.\n" +
            "Outra consequ??ncia bem percept??vel ??? inclusive para as outras pessoas ??? em \n" +
            "beber pouca ??gua ?? o mau h??lito. \n" +
            "Quando a nossa boca fica desidratada, as bact??rias que vivem dentro dela conseguem intensificar \n" +
            "a sua atividade, o que causa o odor desagrad??vel.\n" +
            "Em certos momentos, nos sentimos sem for??a para qualquer atividade. Esse tipo de sintoma costuma \n" +
            "ter rela????o direta com a falta de ??gua no organismo, j?? que ela ?? indispens??vel \n" +
            "para a boa circula????o sangu??nea.\n" +
            "Pris??o de ventre ou outros casos mais leves de lentid??o do intestino podem \n" +
            "ter rela????o direta com a falta de ??gua no sangue. As enzimas digestivas, o \n" +
            "muco e o suco g??strico, necess??rios para o bom tr??nsito intestinal, \n" +
            "dependem da ??gua para a sua produ????o plena.\n";}
    
    public String MuitaAgua(){
        return
            "\nEmbora essencial ao organismo e bem-estar, ??gua em excesso pode ser prejudicial ?? sa??de. \n" +
            "Estranho, mas real. Quando um indiv??duo ingere quantidade al??m da conta, ele pode sofrer de \n" +
            "um problema chamado hiponatremia, que ?? um transtorno metab??lico que desequilibra a \n" +
            "concentra????o de eletr??litos no sangue, principalmente o s??dio.  \n" +
            "Isso pode prejudicar o funcionamento correto de nervos e m??sculos, \n" +
            "al??m de causar n??useas, v??mitos e confus??o mental.\n";}
    
    public String GestanteEAmamentando(){
        return
            "\nEssa quantidade vai variar nas mulheres apenas durante a gesta????o e amamenta????o.\n" +
            "Gestantes devem tomar 3 litros de ??gua e as m??es que amamentam, 3,8.\n";}
    
    public String FontesMuitaAguaCatracaLivre(){
        return
            "\nFontes\nhttps://catracalivre.com.br/equilibre-se/a-quantidade-ideal-de-agua-para-cada-fase-da-vida/";}
    
    public String FontesMetaDiariaAtingidaCatracaLivre(){
        return
            "\nFontes\nhttps://catracalivre.com.br/equilibre-se/a-quantidade-ideal-de-agua-para-cada-fase-da-vida/";}
    
    public String FontesPoucaAguaCatracaLivre(){
        return
            "\nFontes\n" +
            "https://catracalivre.com.br/equilibre-se/a-quantidade-ideal-de-agua-para-cada-fase-da-vida/\n" +
            "http://laboratoriocella.com.br/beber-pouca-agua/";}
    
    public String FontesMuitaAguaMundoEducacao(){
        return
            "\nFontes\n" +
            "https://mundoeducacao.uol.com.br/biologia/qual-quantidade-agua-que-deve-ser-ingerida-diariamente.htm\n" +
            "https://catracalivre.com.br/equilibre-se/a-quantidade-ideal-de-agua-para-cada-fase-da-vida/";}
    
    public String FontesMetaDiariaAtingidaMundoEducacao(){
        return
            "\nFontes\n" + 
            "https://mundoeducacao.uol.com.br/biologia/qual-quantidade-agua-que-deve-ser-ingerida-diariamente.htm";}
    
    public String FontesPoucaAguaMundoEducacao(){
        return
            "\nFontes\n" + 
            "https://mundoeducacao.uol.com.br/biologia/qual-quantidade-agua-que-deve-ser-ingerida-diariamente.htm\n" +
            "http://laboratoriocella.com.br/beber-pouca-agua/";}
    
    public String DeRecemNascidoA6Meses(){
        return
            "\nDe acordo com a  Organiza????o Mundial da Sa??de (OMS), at?? os seis meses de vida, o beb?? deve ser \n" +
            "alimentado exclusivamente com leite materno.  A orienta????o ?? de n??o oferecer ??gua, ch??s e quaisquer \n" +
            "outros alimentos at?? essa idade. Isso porque o leite materno possui a quantidade ideal de ??gua e de \n" +
            "outros nutrientes e vitaminas essenciais para o desenvolvimento adequado do beb?? nessa faixa et??ria.\n";}
    
    public String De7MesesA1Ano(){
        return
            "\nA partir dos 7 meses, como os beb??s j?? come??am a comer papinhas, ?? \n" +
            "necess??rio tamb??m o consumo de ??gua. A necessidade di??ria nessa faixa et??ria ?? de 800 ml \n" +
            "a 1 litro, sendo que 600 ml devem ser na forma de l??quidos como a pr??pria ??gua, suco e leite.\n";}
    
    public String De1A3Anos(){
        return
            "\nAp??s completar o primeiro ano de vida, a demanda por ??gua aumenta e o volume \n" +
            "m??nimo a ser ingerido passa a ser 1,3 litros.\n";}
    
    public String De4A8Anos(){
        return
            "\nCom a intensifica????o das atividades nessa fase da vida, as crian??as tendem a perder mais \n" +
            "l??quido pela transpira????o, portanto, o volume de ??gua ingerido por dia deve aumentar \n" +
            "para, no m??nimo, 1,7 litros.\n";}
    
    public String De9A13Anos(){
        return
            "\nNesta fase da vida, as coisas come??am a mudar um pouco. De acordo com a tabela da IOM, \n" +
            "a necessidade di??ria de ??gua difere entre o sexo feminino e o sexo masculino. \n" +
            "Enquanto as meninas precisam ingerir, no m??nimo, 2,1 litros, os meninos precisam \n" +
            "de um pouco mais: 2,4 litros.\n";}
    
    public String De14A18Anos(){
        return
            "\nDos 14 aos 18 anos de idade, h?? um aumento na quantidade de ??gua que deve ser ingerida \n" +
            "por dia ??? principalmente para os indiv??duos do sexo masculino. Os meninos devem \n" +
            "beber 3,3 litros de ??gua e as meninas, 2,3 litros.\n";}
    
    public String De19EmDiante(){
        return
            "\nDos 19 anos em diante,  o volume de ??gua necess??rio por dia segue o mesmo at?? o fim da vida.\n" +
            "Os homens precisar??o de 3,7 litros ao longo do dia, enquanto as mulheres devem tomar, no m??nimo, 2,7.\n";}
    
    public String DicasCatracaLivre(){
        return
            "\nManeiras de beber mais ??gua ao longo do dia\n" +
            "1. Se voc?? estiver se exercitando, beba ??gua antes e depois da atividade. Essa reidrata????o ?? muito importante j??\n" +
            "que atrav??s do suor o corpo perde uma quantidade consider??vel ??gua\n" +
            "\n" +
            "2. Mantenha sempre uma garrafa de ??gua com voc??, no seu carro ou no trabalho\n" +
            "\n" +
            "3. Aposte em ??gua aromatizada com frutas, flores ou ervas, que tem um sabor agrad??vel e especial\n" +
            "\n" +
            "4. Instale algum aplicativo no celular que dispare lembretes para beber ??gua\n";}
    
    public String DicasMundoEducacao(){
        return
            "Todos n??s sabemos que a ingest??o di??ria de ??gua ?? fundamental para a nossa sobreviv??ncia.\n" +
            "Entretanto, existe muita d??vida a respeito da quantidade adequada para cada pessoa e se \n" +
            "o n??mero de litros indicado varia de acordo com o sexo e com a idade.\n" +
            "\n" +
            "Primeiramente devemos nos lembrar de que a ??gua ingerida n??o pode ser inferior \n" +
            "??quela eliminada pela urina, fezes, transpira????o e respira????o. Sendo assim, podemos \n" +
            "perceber rapidamente que a quantidade de ??gua que deve ser ingerida varia de pessoa\n " +
            "para pessoa, dependendo de suas atividades di??rias e de seu estado de sa??de.\n" +
            "\n" +
            "Uma pessoa que faz exerc??cios f??sicos e, consequentemente, perde muita ??gua pela transpira????o \n" +
            "necessita de maior hidrata????o quando comparada a uma pessoa que passa grande parte do dia em repouso. \n" +
            "Uma maior hidrata????o tamb??m ?? recomendada para pessoas com queimaduras, com diarreia \n" +
            "prolongada, que consomem ??lcool, que fazem uso de diur??ticos, diab??ticos,\n" +
            " gestantes, lactantes, entre outros.\n" +
            "\n" +
            "Al??m dos h??bitos de vida e da sa??de de cada um, a idade e o sexo tamb??m influenciam na quantidade de\n" +
            "??gua necess??ria. Beb??s de at?? seis meses de idade, por exemplo, n??o necessitam ingerir ??gua, \n" +
            "uma vez que retiram essa subst??ncia do leite materno. Segundo alguns autores, adolescentes do \n" +
            "sexo masculino devem beber 2,6 litros de ??gua, enquanto as meninas necessitam de 1,8 litro. \n" +
            "J?? as pessoas adultas, independentemente do sexo, devem beber em m??dia 2,2 litros di??rios, segundo \n" +
            "alguns autores, e 2,5 litros, segundo outros. O Minist??rio da Sa??de recomenda pelo menos \n" +
            "dois litros de ??gua diariamente.\n";}
    
    public Double CalculoMundoEduacacao(){
        double me = 35 * this.peso;
        return me;}
}