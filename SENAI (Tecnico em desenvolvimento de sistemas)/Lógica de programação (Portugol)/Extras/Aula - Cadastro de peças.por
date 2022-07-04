programa
{
	inclua biblioteca Util --> u
	
	inteiro opcao
	cadeia nome, enter
	real valor
	
	funcao inicio(){
		limpa()
		escreva("----------------------------------------\n")
		escreva("|  MENU PRINCIPAL - Sistema de Peças   |\n")
		escreva("----------------------------------------\n")
		escreva(" 1 - Cadastrar nova peça\n")
		escreva(" 2 - Listar peças cadastradas\n")
		escreva(" 3 - Sair do sistema\n")
		escreva("----------------------------------------")
		escreva("Escolha uma opção: ")
		leia(opcao)
		
		escolha(opcao){

			//Cadastrar a peça.
			caso 1:
				limpa()
				escreva("Informe o nomme da peça:\n")
				leia(nome)

				limpa()
				escreva("Informe o valor da peça: \n")
				leia(valor)

				inicio()
				pare

			//Listar a peça.
			caso 2:
				se(nome == "" ou valor == 0.0){
					limpa()
					escreva("Nenhum produto cadastrado no sistema!\n\n")
					}
				senao{
					limpa()
					escreva("Nome da peça ", nome, " - Valor: R$ ", valor, "\n\n")
					}
				escreva("Pressione a tecla [ENTER] para continuar.")
				leia(enter)
				inicio()
				pare
			
			//Sair do sistema.	
			caso 3:
				limpa()
				escreva("Encerrando o sistema em 3 segundos...")
				u.aguarde(1000)

				limpa()
				escreva("Encerrando o sistema em 2 segundos...")
				u.aguarde(1000)

				limpa()
				escreva("Encerrando o sistema em 1 segundo...")
				u.aguarde(1000)
				pare
				
			caso contrario:
				limpa()
				escreva("Opção inválida!")
				u.aguarde(3000)
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
 * @POSICAO-CURSOR = 786; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */