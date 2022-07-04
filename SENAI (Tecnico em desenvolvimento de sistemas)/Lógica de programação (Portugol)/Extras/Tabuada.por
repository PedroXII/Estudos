programa
{
	real numero
	inteiro fimtab
	funcao inicio()
	{
		escreva("Tabuada do número: ")
		leia(numero)
		limpa()
		escreva("A tabuada termina no número: ")
		leia(fimtab)
		limpa()
		
		para(inteiro i = 1; i <= fimtab; i++){
			escreva(numero, " x ", i, " = ", numero * i, "\n")
			}
		escreva("FIM")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 315; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */