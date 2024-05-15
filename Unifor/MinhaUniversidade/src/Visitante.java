public class Visitante extends Pessoa{
    public Visitante obterDadosVisitante(long cpf){
        Visitante visitante = new Visitante();
        visitante.setCpf(super.obterDadosPessoa(cpf).getCpf());
        visitante.setNome(super.obterDadosPessoa(cpf).getNome());
        visitante.setIdade(super.obterDadosPessoa(cpf).getIdade());
        visitante.setOcupacao(super.obterDadosPessoa(cpf).getOcupacao());
        return visitante;
    }
}