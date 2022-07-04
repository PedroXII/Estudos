programa{
	
	funcao inicio(){

		//Em outras linguaagens é possível substituir o número de termos do vetor por uma variável.
		//OBSERVAÇÃO: o vetor sempre começa a contar do zero, ou seja o primeiro termo é o vetor[0].
		inteiro vetor[10]
		inteiro i

		para(i = 0; i < 10; i++){
			escreva("Digite o elemento ", i, ": ")
			leia(vetor[i])
			}

			limpa()
			
		para(i = 0; i < 10; i++){
			escreva("Elemento ", i, ": ", vetor[i], "\n")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 361; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */