programa{
	inclua biblioteca Util
	
	inteiro numero, mostrar = 1
	funcao inicio(){
		escreva("Digite um número para saber seu fatorial: ")
		leia(numero)
		inteiro num = numero
		//Como fazer a mesma coisa de modos diferentes.
		para(numero; numero >= 2; numero--){
			mostrar += mostrar * (numero - 1)
		}
		escreva("O resultado fatorial do número ", num," é: ", fatorial(num), " ou ", mostrar)
	}
	//Um exemplo de recursividade.
	funcao inteiro fatorial(inteiro resultado){
		se(resultado <= 2){
			retorne resultado
		}
		senao{
			retorne resultado * (fatorial(resultado - 1))
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 435; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */