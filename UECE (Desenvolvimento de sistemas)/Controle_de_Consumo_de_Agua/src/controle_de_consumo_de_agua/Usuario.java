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
            "Quantidade de água ingerida: " + this.quantidade + " ml.\n";}
    
    public String PadraoAdultoCatracaLivre(){
        return
            "Nome: " + this.nome + "\n" +
            "Idade: " + IdadeC() + " anos.\n" +
            "Sexo: " + this.sexo + "\n" +
            "Quantidade de água ingerida: " + this.quantidade + " ml.\n" +
            "\nObs: O peso também afeta na quantidade de água que deve\n" +
            "ser ingerida.";}
    
    public String PadraoBebeMundoEducacao(){
        return
            "Nome: " + this.nome + "\n" +
            "Idade: " + this.Bebe() + " meses.\n" +
            "Sexo: " + this.sexo + "\n" +
            "Peso: " + this.peso + "kg\n" +
            "Quantidade de água ingerida: " + this.quantidade + " ml.\n";}
    
    public String PadraoAdultoMundoEducacao(){
        return
            "Nome: " + this.nome + "\n" +
            "Idade: " + IdadeC() + " anos.\n" +
            "Sexo: " + this.sexo + "\n" +
            "Peso: " + this.peso + "kg\n" +
            "Quantidade de água ingerida: " + this.quantidade + " ml.\n" +
            "Obs: a idade também afeta na quantidade de água a ser ingerida.\n";}
    
    public String AvisoMetaDiariaAtingida(){
        return
            "\nMeta diária atingida!\n";}
    
    public String AvisoMuitaAgua(){
        return
            "\n" + this.nome + " bebeu água demais!\n";}
    
    public String AvisoPoucaAgua(){
        return
            "\n" + this.nome + " bebeu pouca água!\n";}
    
    public String PoucaAgua(){
        return
            "\nExistem algumas consequências bem perigosas em beber pouca água,\n" +
            "o organismo pode responder negativamente a isso de diferentes maneiras.\n" +
            "Uma das consequências negativas de mais fácil percepção é o envelhecimento da pele.\n" +
            "A desidratação limita as atividades do cérebro e pode causar dificuldades cognitivas \n" +
            "como perda de concentração e problemas de memorização.\n" +
            "Outra consequência bem perceptível – inclusive para as outras pessoas – em \n" +
            "beber pouca água é o mau hálito. \n" +
            "Quando a nossa boca fica desidratada, as bactérias que vivem dentro dela conseguem intensificar \n" +
            "a sua atividade, o que causa o odor desagradável.\n" +
            "Em certos momentos, nos sentimos sem força para qualquer atividade. Esse tipo de sintoma costuma \n" +
            "ter relação direta com a falta de água no organismo, já que ela é indispensável \n" +
            "para a boa circulação sanguínea.\n" +
            "Prisão de ventre ou outros casos mais leves de lentidão do intestino podem \n" +
            "ter relação direta com a falta de água no sangue. As enzimas digestivas, o \n" +
            "muco e o suco gástrico, necessários para o bom trânsito intestinal, \n" +
            "dependem da água para a sua produção plena.\n";}
    
    public String MuitaAgua(){
        return
            "\nEmbora essencial ao organismo e bem-estar, água em excesso pode ser prejudicial à saúde. \n" +
            "Estranho, mas real. Quando um indivíduo ingere quantidade além da conta, ele pode sofrer de \n" +
            "um problema chamado hiponatremia, que é um transtorno metabólico que desequilibra a \n" +
            "concentração de eletrólitos no sangue, principalmente o sódio.  \n" +
            "Isso pode prejudicar o funcionamento correto de nervos e músculos, \n" +
            "além de causar náuseas, vômitos e confusão mental.\n";}
    
    public String GestanteEAmamentando(){
        return
            "\nEssa quantidade vai variar nas mulheres apenas durante a gestação e amamentação.\n" +
            "Gestantes devem tomar 3 litros de água e as mães que amamentam, 3,8.\n";}
    
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
            "\nDe acordo com a  Organização Mundial da Saúde (OMS), até os seis meses de vida, o bebê deve ser \n" +
            "alimentado exclusivamente com leite materno.  A orientação é de não oferecer água, chás e quaisquer \n" +
            "outros alimentos até essa idade. Isso porque o leite materno possui a quantidade ideal de água e de \n" +
            "outros nutrientes e vitaminas essenciais para o desenvolvimento adequado do bebê nessa faixa etária.\n";}
    
    public String De7MesesA1Ano(){
        return
            "\nA partir dos 7 meses, como os bebês já começam a comer papinhas, é \n" +
            "necessário também o consumo de água. A necessidade diária nessa faixa etária é de 800 ml \n" +
            "a 1 litro, sendo que 600 ml devem ser na forma de líquidos como a própria água, suco e leite.\n";}
    
    public String De1A3Anos(){
        return
            "\nApós completar o primeiro ano de vida, a demanda por água aumenta e o volume \n" +
            "mínimo a ser ingerido passa a ser 1,3 litros.\n";}
    
    public String De4A8Anos(){
        return
            "\nCom a intensificação das atividades nessa fase da vida, as crianças tendem a perder mais \n" +
            "líquido pela transpiração, portanto, o volume de água ingerido por dia deve aumentar \n" +
            "para, no mínimo, 1,7 litros.\n";}
    
    public String De9A13Anos(){
        return
            "\nNesta fase da vida, as coisas começam a mudar um pouco. De acordo com a tabela da IOM, \n" +
            "a necessidade diária de água difere entre o sexo feminino e o sexo masculino. \n" +
            "Enquanto as meninas precisam ingerir, no mínimo, 2,1 litros, os meninos precisam \n" +
            "de um pouco mais: 2,4 litros.\n";}
    
    public String De14A18Anos(){
        return
            "\nDos 14 aos 18 anos de idade, há um aumento na quantidade de água que deve ser ingerida \n" +
            "por dia – principalmente para os indivíduos do sexo masculino. Os meninos devem \n" +
            "beber 3,3 litros de água e as meninas, 2,3 litros.\n";}
    
    public String De19EmDiante(){
        return
            "\nDos 19 anos em diante,  o volume de água necessário por dia segue o mesmo até o fim da vida.\n" +
            "Os homens precisarão de 3,7 litros ao longo do dia, enquanto as mulheres devem tomar, no mínimo, 2,7.\n";}
    
    public String DicasCatracaLivre(){
        return
            "\nManeiras de beber mais água ao longo do dia\n" +
            "1. Se você estiver se exercitando, beba água antes e depois da atividade. Essa reidratação é muito importante já\n" +
            "que através do suor o corpo perde uma quantidade considerável água\n" +
            "\n" +
            "2. Mantenha sempre uma garrafa de água com você, no seu carro ou no trabalho\n" +
            "\n" +
            "3. Aposte em água aromatizada com frutas, flores ou ervas, que tem um sabor agradável e especial\n" +
            "\n" +
            "4. Instale algum aplicativo no celular que dispare lembretes para beber água\n";}
    
    public String DicasMundoEducacao(){
        return
            "Todos nós sabemos que a ingestão diária de água é fundamental para a nossa sobrevivência.\n" +
            "Entretanto, existe muita dúvida a respeito da quantidade adequada para cada pessoa e se \n" +
            "o número de litros indicado varia de acordo com o sexo e com a idade.\n" +
            "\n" +
            "Primeiramente devemos nos lembrar de que a água ingerida não pode ser inferior \n" +
            "àquela eliminada pela urina, fezes, transpiração e respiração. Sendo assim, podemos \n" +
            "perceber rapidamente que a quantidade de água que deve ser ingerida varia de pessoa\n " +
            "para pessoa, dependendo de suas atividades diárias e de seu estado de saúde.\n" +
            "\n" +
            "Uma pessoa que faz exercícios físicos e, consequentemente, perde muita água pela transpiração \n" +
            "necessita de maior hidratação quando comparada a uma pessoa que passa grande parte do dia em repouso. \n" +
            "Uma maior hidratação também é recomendada para pessoas com queimaduras, com diarreia \n" +
            "prolongada, que consomem álcool, que fazem uso de diuréticos, diabéticos,\n" +
            " gestantes, lactantes, entre outros.\n" +
            "\n" +
            "Além dos hábitos de vida e da saúde de cada um, a idade e o sexo também influenciam na quantidade de\n" +
            "água necessária. Bebês de até seis meses de idade, por exemplo, não necessitam ingerir água, \n" +
            "uma vez que retiram essa substância do leite materno. Segundo alguns autores, adolescentes do \n" +
            "sexo masculino devem beber 2,6 litros de água, enquanto as meninas necessitam de 1,8 litro. \n" +
            "Já as pessoas adultas, independentemente do sexo, devem beber em média 2,2 litros diários, segundo \n" +
            "alguns autores, e 2,5 litros, segundo outros. O Ministério da Saúde recomenda pelo menos \n" +
            "dois litros de água diariamente.\n";}
    
    public Double CalculoMundoEduacacao(){
        double me = 35 * this.peso;
        return me;}
}