package situacao_aprendizagem_3_etapa_2;

public class situacaaprendizagem3etapa2{
	public static void main(String[] args){
		//Eu pensei em declarar o cpf, rg e telefone como int, mas a quantidade de casas decimais foi insuficiente.	
		String nome, sexo, endereco, cpf, rg, telefone;
		int idade;
		nome = "Carol Andrade";
		sexo = "Feminino";
		idade = 22;
		cpf = "014.587.412-54";
		rg = "54486878-14";
		telefone = "(85) 98922-5410";
		endereco = "Rua Capricho N 541";
		
		System.out.println("-----Dados-----\nNome: " + nome +"\nIdade: " + idade + " anos.\nSexo: " + sexo + "\nCPF: " + cpf + "\nRG: " + rg + "\nTelefone: " + telefone + "Endereco: " + endereco);
	}
}