programa{
	inclua biblioteca Util
	
	const inteiro tamanho_total = 1000

	cadeia livros[tamanho_total], prosseguir
	inteiro tamanho, ponteiro = 0, novo_tamanho
	logico primeiro_uso = verdadeiro
	caracter comando
	
	funcao inicio(){
		se(primeiro_uso == verdadeiro){
			escreva("Digite o tamanho máximo da pilha: ")
			leia(tamanho)
			primeiro_uso = falso
		}
		limpa()
		escreva("---------- Pilha de Livros ----------\n\n")
		escreva("Digite 1 para: empilhar.\n")
		escreva("Digite 2 para: desempilhar.\n")
		escreva("Digite 3 para: limpar.\n")
		escreva("Digite 4 para: listar.\n")
		escreva("Digite 5 para: verificar se a  pilha está vazia.\n")
		escreva("Digite 6 para: alterar o tamanho máximo da pilha.\n")
		escreva("Digite 7 para: sair\n\n")
		escreva("Tamanho atual: ", ponteiro, "\n")
		escreva("Tamanho máximo: ", tamanho, "\n\n")
		escreva("Comando: ")
		leia(comando)
		escolha(comando){
			caso '1':
				empilhar()
				pare
			caso '2':
				desempilhar()
				pare
			caso '3':
				limpar()
				pare
			caso '4':
				listar()
				pare
			caso '5':
				verificar()
				pare
			caso '6':
				novaquantidade()
				pare
			caso '7':
				sair()
				pare
			caso contrario:
				limpa()
				escreva("Comando inválido!")
				Util.aguarde(2000)
				limpa()
				inicio()
				pare
		}
	}
	funcao sair(){
		limpa()
		escreva("Saindo em 3 segundos...")
		Util.aguarde(1000)
		limpa()
		escreva("Saindo em 2 segundos...")
		Util.aguarde(1000)
		limpa()
		escreva("Saindo em 1 segundo...")
		Util.aguarde(1000)
	}
	funcao empilhar(){
		limpa()
		se(ponteiro < tamanho){
			escreva("Digite o nome do livro para ser empilhado: ")
			leia(livros[ponteiro])
			ponteiro++
			inicio()
		}
		senao{
			escreva("A pilha está cheia!")
			Util.aguarde(1000)
			inicio()
		}
	}
	funcao desempilhar(){
		limpa()
		se(ponteiro <= 0){
			escreva("A pilha está vazia!")
			Util.aguarde(1000)
			inicio()
		}
		senao{
			escreva("Deseja desempillhar o seguinte livro?\n\n")
			escreva(livros[ponteiro - 1])
			escreva("\n\nEscreva:\n1 - Para sim.\n2 - Para não.\n\nComando: ")
			leia(comando)
			escolha(comando){
			caso '1':
				limpa()
				cadeia desempilhado = livros[ponteiro - 1]
				para(inteiro i = 0; i < ponteiro; i++){
					livros[ponteiro - 1] = livros[i + 1]
				}
				ponteiro--
				escreva("O livro: ", desempilhado, " foi removido do pilha!")
				Util.aguarde(2000)
				inicio()
				pare
			caso '2':
				limpa()
				inicio()
				pare
			caso contrario:
				limpa()
				escreva("Comando inválido!")
				Util.aguarde(1000)
				limpa()
				inicio()
				pare
			}
		}
	}
	funcao limpar(){
		limpa()
		escreva("Deseja limpar todos os itens da pilha?\n\nDigite:\n1 - Sim.\n2 - Não.\n\nComando: ")
		leia(comando)
		escolha(comando){
			caso '1':
				limpa()
				para(ponteiro; ponteiro > 0; ponteiro--){//Seleciona o livro no topo da pilha.
					para(inteiro i = 0; i < ponteiro; i++){//Remove o livro selecionado.
							livros[ponteiro - 1] = livros[i + 1]
					}
				}
				escreva("A pilha foi limpa!")
				Util.aguarde(1000)
				inicio()
				pare
			caso '2':
				limpa()
				inicio()
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
	funcao listar(){
		limpa()
		inteiro id = 0
		escreva("---------- Pilha de Livros ----------\n\n")
		para(inteiro i = ponteiro - 1; i >= 0; i--){
			escreva("Livro: ", id, ", Nome: ", livros[i], "\n")
			id++
		}
		escreva("\nPressione [ENTER] para prosseguir.")
		leia(prosseguir)
		inicio()
	}
	funcao verificar(){
		limpa()
		logico vazia
		se(ponteiro > 0){
			vazia = falso
			escreva("Há ", ponteiro, " livro(s) na pilha!\n\nPressione [ENTER] para prosseguir.")
			leia(prosseguir)
			inicio()
		}
		senao{
			vazia = verdadeiro
			escreva("Não há livros na pilha!\n\nPressione [ENTER] para prosseguir.")
			leia(prosseguir)
			inicio()
		}
	}
	funcao novaquantidade(){
		limpa()
		escreva("Digite a nova quantidade: ")
		leia(novo_tamanho)
		se(novo_tamanho > tamanho_total ou novo_tamanho <= tamanho){
			limpa()
			escreva("Novo tamanho é igual ou menor que a anterior ou inválido!\nObs: O tamanho total que a pilha pode ter é: ", tamanho_total)
			Util.aguarde(2000)
			inicio()
		}
		senao{
			limpa()
			tamanho = novo_tamanho
			escreva("Quantidade atualizada!")
			Util.aguarde(1000)
			inicio()
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4341; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {livros, 6, 8, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */