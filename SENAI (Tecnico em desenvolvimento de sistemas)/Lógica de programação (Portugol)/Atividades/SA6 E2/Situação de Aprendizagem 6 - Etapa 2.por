programa{
	inclua biblioteca Util
	
	const inteiro total = 10
	inteiro ponteiro = 0, numeros[total]
	caracter comando
	cadeia prosseguir
	
	funcao inicio(){
		limpa()
		escreva("---------- Ordenação MergeSort ----------\n\n")
		escreva("Digite 1: para adicionar um número manualmente.\n")
		escreva("Digite 2: para visualizar o vetor.\n")
		escreva("Digite 3: para preencher o vetor automaticamente.\n")
		escreva("Digite 4: para ordenar o vetor.\n")
		escreva("Digite 5: para sair.\n\n")
		escreva("Total do vetor: ", ponteiro, " / ", total, "\n")
		escreva("Comando: ")
		leia(comando)
		escolha(comando){
			caso '1':
				se(ponteiro < total){
					adicionar()
				}
				senao{
					escreva("O vetor está cheio!")
					Util.aguarde(1000)
					inicio()
				}
				pare
			caso '2':
				limpa()
				escreva("----- Vetor original -----\n\n")
				imprimir(numeros)
				escreva("\nPressione [ENTER] para prosseguir.")
				leia(prosseguir)
				inicio()
				pare
			caso '3':
				preencher()
				inicio()
				pare
			caso '4':
				limpa()
				MergeSort(numeros, 0, ponteiro-1)
				escreva("----- Vetor ordenado -----\n\n")
				imprimir(numeros)
				escreva("\nPressione [ENTER] para prosseguir.")
				leia(prosseguir)
				inicio()
				pare
			caso '5':
				sair()
				pare
		}
	}

	funcao MergeSort(inteiro vetor[], inteiro start, inteiro end)
	{
		inteiro middle, start2, middlePlusOne, start3, auxiliar[total]

		se(start < end)
		{
			middle = (start + end) / 2
			MergeSort(vetor, start, middle)
			MergeSort(vetor, middle+1, end)
			
			start2 = start
			middlePlusOne = middle + 1
			start3 = start

			enquanto(start2 <= middle e middlePlusOne <= end)
			{
				se(vetor[start2] < vetor[middlePlusOne])
				{
					auxiliar[start3] = vetor[start2]
					start2++
					start3++
				}
				senao
				{
					auxiliar[start3] = vetor[middlePlusOne]
					middlePlusOne++
					start3++
				}
			}

			enquanto(start2 <= middle)
			{
				auxiliar[start3] = vetor[start2]
				start2++
				start3++
			}

			enquanto(middlePlusOne <= end)
			{
				auxiliar[start3] = vetor[middlePlusOne]
				middlePlusOne++
				start3++
			}
 
			para(start2 = start; start2 <= end; start2++)
			{
				vetor[start2] = auxiliar[start2]
			}
		}
	}
	funcao imprimir(inteiro vetor[]){
		para(inteiro i = 0; i < total; i++)
		{
			escreva(i+1, "º Número: ", vetor[i], "\n")
		}
	}
	funcao preencher(){
		limpa()
		inteiro verificar = ponteiro
		para(inteiro i = 0; i < total; i++){
			se(i >= verificar){
				numeros[i] = Util.sorteia(1, 100)
			}
		}
		ponteiro = total
		escreva("Espaços vazios preenchidos!")
		Util.aguarde(1000)
		inicio()
	}
	funcao adicionar(){
		limpa()
		se(ponteiro < total){
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
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 435; 
 * @DOBRAMENTO-CODIGO = [57, 107, 113, 126, 140];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */