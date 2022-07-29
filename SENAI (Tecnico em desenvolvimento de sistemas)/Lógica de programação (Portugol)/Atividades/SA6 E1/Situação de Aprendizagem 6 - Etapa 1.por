programa{
	inclua biblioteca Util
	
	const inteiro tamanho_total = 1000

	cadeia prosseguir
	inteiro numeros[tamanho_total],tamanho, ponteiro = 0, novo_tamanho
	logico primeiro_uso = verdadeiro
	caracter comando
	
	funcao inicio(){
		se(primeiro_uso == verdadeiro){
			tamanho = 10
			primeiro_uso = falso
		}
		limpa()
		escreva("---------- Orenação de números ----------\n\n")
		escreva("Digite 1 para: adicionar um número.\n")
		escreva("Digite 2 para: remover um número.\n")
		escreva("Digite 3 para: limpar a lista de números.\n")
		escreva("Digite 4 para: mostrar a lista de números.\n")
		escreva("Digite 5 para: ordenar a lista de forma crescente.\n")
		escreva("Digite 6 para: ordenar a lista de forma decrescente.\n")
		escreva("Digite 7 para: preencher automaticamente.\n")
		escreva("Digite 8 para: alterar o tamanho máximo da fila.\n")
		escreva("Digite 9 para: sair\n\n")
		escreva("Tamanho atual: ", ponteiro, "\n")
		escreva("Tamanho máximo: ", tamanho, "\n\n")
		escreva("Comando: ")
		leia(comando)
		escolha(comando){
			caso '1':
				adicionar()
				pare
			caso '2':
				remover()
				pare
			caso '3':
				limpar()
				pare
			caso '4':
				listar()
				pare
			caso '5':
				ordenar_crescente()
				pare
			caso '6':
				ordenar_decrescente()
				pare
			caso '7':
				preencher_automaticamente()
				pare
			caso '8':
				novaquantidade()
				pare
			caso '9':
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
			escreva("Digite o número: ")
			leia(numeros[ponteiro])
			ponteiro++
			inicio()
		}
		senao{
			escreva("Tamanho máximo atingido!!")
			Util.aguarde(1000)
			inicio()
		}
	}
	funcao remover(){
		limpa()
		se(ponteiro <= 0){
			escreva("Não há números para remover!")
			Util.aguarde(1000)
			inicio()
		}
		senao{
			inteiro remove
			escreva("Digite o(s) número(s) para remover: ")
			leia(remove)
			limpa()
			para(inteiro x = 0; x < ponteiro; x++){ //Repetir
				para(inteiro i = 0; i < ponteiro; i++){ //Buscar
					se(remove == numeros[i]){ //Analisar
						para(inteiro y = i; y < ponteiro; y++){ //Excluir
							numeros[y] = numeros[y + 1]
						}
						ponteiro--
					}
				}
			}
			escreva("O número: ", remove, " foi removido!")
		}
	}
	funcao limpar(){
		limpa()
		escreva("Deseja remover todos os números?\n\nDigite:\n1 - Sim.\n2 - Não.\n\nComando: ")
		leia(comando)
		escolha(comando){
			caso '1':
				limpa()
				para(inteiro x = 0; x < ponteiro; ponteiro--){
					para(inteiro i = 0; i < ponteiro; i++){
							numeros[i] = numeros[i + 1]
					}
				}
				escreva("Números removidos!")
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
		escreva("---------- Números ----------\n\n")
		para(inteiro i = 0; i < ponteiro; i++){
			escreva(i + 1, "º número: ", numeros[i], "\n")
		}
		escreva("\nPressione [ENTER] para prosseguir.")
		leia(prosseguir)
		inicio()
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
	funcao ordenar_crescente(){
		limpa()
		inteiro temp
		para(inteiro i = 0; i < ponteiro - 1; i++){
			para(inteiro x = 0; x < ponteiro - 1; x++){
				se(numeros[x] > numeros[x + 1]){
					temp = numeros[x]
					numeros[x] = numeros[x + 1]
					numeros[x + 1] = temp
				}
			}
		}
		escreva("Ordenação crescente concluída!")
		Util.aguarde(1000)
		inicio()
	}
	funcao ordenar_decrescente(){
		limpa()
		inteiro temp
		para(inteiro i = 0; i < ponteiro; i++){
			para(inteiro x = 0; x < ponteiro; x++){
				se(numeros[x] < numeros[x + 1]){
					temp = numeros[x]
					numeros[x] = numeros[x + 1]
					numeros[x + 1] = temp
				}
			}
		}
		escreva("Ordenação decrescente concluída!")
		Util.aguarde(1000)
		inicio()
	}
	funcao preencher_automaticamente(){
		limpa()
		inteiro verificar = ponteiro
		para(inteiro i = 0; i < tamanho; i++){
			se(i >= verificar){
				numeros[i] = Util.sorteia(1, 100)
			}
		}
		ponteiro = tamanho
		escreva("Espaços vazios preenchidos!")
		Util.aguarde(1000)
		inicio()
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2796; 
 * @DOBRAMENTO-CODIGO = [67, 78, 92, 146, 156, 174, 190, 206];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */