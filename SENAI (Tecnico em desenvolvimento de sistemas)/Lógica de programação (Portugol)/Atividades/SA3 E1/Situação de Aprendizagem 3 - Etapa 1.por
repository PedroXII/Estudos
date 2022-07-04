programa{
	inclua biblioteca Util

	caracter comando
	cadeia nomes[100], prosseguir
	inteiro id = 0, idades[100]
	funcao inicio(){
		limpa()
		escreva("------------ Cadastro de usuários ------------\n\n")
		escreva("Digite: 1 - Para cadastrar novo usuário.\n")
		escreva("Digite: 2 - Para mostrar todos os usuários cadastrados.\n")
		escreva("Digite: 3 - Para fechar o programa.\n\n")
		escreva("Limite de usuários: 100\nTotal atual: ", id, "\n\n")
		escreva("Digite o comando:")
		leia(comando)

		escolha(comando){
			caso '1':
				limpa()
				escreva("Digite o nome do usuário: ")
				leia(nomes[id])
				limpa()
				escreva("Digite a idade do usuário: ")
				leia(idades[id])
				id++
				limpa()
				inicio()
				pare
			caso '2':
				limpa()
				para(inteiro i = 0; i < id; i++){
					escreva("Usuario: ", i, ", Nome: ", nomes[i], ", Idade: ", idades[i], "\n")
				}
				escreva("\nPressione [ENTER] para prosseguir.")
				leia(prosseguir)
				limpa()
				inicio()
				pare
			caso '3':
				limpa()
				escreva("Saindo em 3 segundos...")
				Util.aguarde(1000)
				limpa()
				escreva("Saindo em 2 segundos...")
				Util.aguarde(1000)
				limpa()
				escreva("Saindo em 1 segundo...")
				Util.aguarde(1000)
				pare
			caso contrario:
				limpa()
				escreva("Comando inválido!")
				Util.aguarde(3000)
				limpa()
				inicio()
				pare
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1352; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */