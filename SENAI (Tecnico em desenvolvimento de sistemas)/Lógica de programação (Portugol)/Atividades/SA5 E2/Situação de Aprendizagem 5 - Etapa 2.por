programa{
	inclua biblioteca Util
	
	const inteiro tamanho_total = 1000

	cadeia clientes[tamanho_total], prosseguir
	inteiro tamanho, ponteiro = 0, novo_tamanho
	logico primeiro_uso = verdadeiro
	caracter comando
	
	funcao inicio(){
		se(primeiro_uso == verdadeiro){
			tamanho = 25
			primeiro_uso = falso
		}
		limpa()
		escreva("---------- Fila de Clientes ----------\n\n")
		escreva("Digite 1 para: adicionar um cliente.\n")
		escreva("Digite 2 para: atender um cliente.\n")
		escreva("Digite 3 para: limpar a fila de clientes.\n")
		escreva("Digite 4 para: listar os clientes da fila.\n")
		escreva("Digite 5 para: verificar se a fila está vazia.\n")
		escreva("Digite 6 para: alterar o tamanho máximo da fila.\n")
		escreva("Digite 7 para: sair\n\n")
		escreva("Tamanho atual: ", ponteiro, "\n")
		escreva("Tamanho máximo: ", tamanho, "\n\n")
		escreva("Comando: ")
		leia(comando)
		escolha(comando){
			caso '1':
				adicionar()
				pare
			caso '2':
				atender()
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
	funcao adicionar(){
		limpa()
		se(ponteiro < tamanho){
			escreva("Digite o nome do cliente: ")
			leia(clientes[ponteiro])
			ponteiro++
			inicio()
		}
		senao{
			escreva("A fila está cheia!")
			Util.aguarde(1000)
			inicio()
		}
	}
	funcao atender(){
		limpa()
		se(ponteiro <= 0){
			escreva("A pilha está vazia!")
			Util.aguarde(1000)
			inicio()
		}
		senao{
			escreva("Deseja atender este cliente?\n\n")
			escreva(clientes[0])
			escreva("\n\nEscreva:\n1 - Para sim.\n2 - Para não.\n\nComando: ")
			leia(comando)
			escolha(comando){
			caso '1':
				limpa()
				cadeia atendido = clientes[0]
				para(inteiro i = 0; i < ponteiro; i++){
					clientes[i] = clientes[i + 1]
				}
				ponteiro--
				escreva("O cliente: ", atendido, " foi atendido!")
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
		escreva("Deseja retirar todos os clientes da fila?\n\nDigite:\n1 - Sim.\n2 - Não.\n\nComando: ")
		leia(comando)
		escolha(comando){
			caso '1':
				limpa()
				para(inteiro x = 0; x < ponteiro; ponteiro--){//Seleciona o livro no topo da pilha.
					para(inteiro i = 0; i < ponteiro; i++){//Remove o livro selecionado.
							clientes[i] = clientes[i + 1]
					}
				}
				escreva("A fila foi limpa!")
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
		escreva("---------- Lista de Clientes ----------\n\n")
		para(inteiro i = 0; i < ponteiro; i++){
			escreva("Cliente: ", i, ", Nome: ", clientes[i], "\n")
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
			escreva("Há ", ponteiro, " cliente(s) na fila!\n\nPressione [ENTER] para prosseguir.")
			leia(prosseguir)
			inicio()
		}
		senao{
			vazia = verdadeiro
			escreva("Não há clientes na fila!\n\nPressione [ENTER] para prosseguir.")
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
			escreva("Novo tamanho é igual ou menor que a anterior ou inválido!\nObs: O tamanho total que a fila pode ter é: ", tamanho_total)
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
 * @POSICAO-CURSOR = 635; 
 * @DOBRAMENTO-CODIGO = [59, 70, 84, 122, 151, 177];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */