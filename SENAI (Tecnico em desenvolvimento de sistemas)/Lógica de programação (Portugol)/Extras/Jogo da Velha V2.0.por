programa{
	inclua biblioteca Util
	
	cadeia jogodavelha[3][3] = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}}, comando
	inteiro jogadal, jogadac, jogadas = 0
	logico concluido = falso

	funcao inicio(){
		se(concluido == falso){
			limpa()
			escreva("Jogador O:\n\n")
			tabuleiro()
			escreva("\nLinha da jogada: ")
			leia(jogadal)
			jogadal--
			se(jogadal > 2 ou jogadal < 0){
				limpa()
				escreva("Comando inválido!")
				Util.aguarde(2000)
				inicio()	
			}
			escreva("\nColuna da jogada: ")
			leia(jogadac)
			jogadac--
			se(jogadac > 2 ou jogadac < 0){
				limpa()
				escreva("Comando inválido!")
				Util.aguarde(2000)
				inicio()
			}
			se(jogodavelha[jogadal][jogadac] == "O" ou jogodavelha[jogadal][jogadac] == "X"){
				limpa()
				escreva("Essa jogada já foi feita!")
				Util.aguarde(2000)
				inicio()
			}
			senao{
				jogodavelha[jogadal][jogadac] = "O"
				jogadas++
				limpa()
				escreva("Jogada feita!")
				Util.aguarde(1000)
				vitoriaO()
				empate()
			}
			jogador2()	
		}
	}
	funcao jogador2(){
		se(concluido == falso){
			limpa()
			escreva("Jogador X:\n\n")
			tabuleiro()
			escreva("\nLinha da jogada: ")
			leia(jogadal)
			jogadal--
			se(jogadal > 2 ou jogadal < 0){
				limpa()
				escreva("Comando inválido!")
				Util.aguarde(2000)
				jogador2()	
			}
			escreva("\nColuna da jogada: ")
			leia(jogadac)
			jogadac--
			se(jogadac > 2 ou jogadac < 0){
				limpa()
				escreva("Comando inválido!")
				Util.aguarde(2000)
				jogador2()
			}
			se(jogodavelha[jogadal][jogadac] == "O" ou jogodavelha[jogadal][jogadac] == "X"){
				limpa()
				escreva("Essa jogada já foi feita!")
				Util.aguarde(2000)
				jogador2()
			}
			senao{
				jogodavelha[jogadal][jogadac] = "X"
				jogadas++
				limpa()
				escreva("Jogada feita!")
				Util.aguarde(1000)
				vitoriaX()
				empate()
			}
			inicio()
		}
	}
	funcao vitoriaO(){
		//Vitória O.
		se((jogodavelha[0][0] == "O" e jogodavelha[0][1] == "O" e jogodavelha[0][2] == "O") ou
		   (jogodavelha[1][0] == "O" e jogodavelha[1][1] == "O" e jogodavelha[1][2] == "O") ou
		   (jogodavelha[2][0] == "O" e jogodavelha[2][1] == "O" e jogodavelha[2][2] == "O") ou
		   (jogodavelha[0][0] == "O" e jogodavelha[1][0] == "O" e jogodavelha[2][0] == "O") ou
		   (jogodavelha[0][1] == "O" e jogodavelha[1][1] == "O" e jogodavelha[2][1] == "O") ou
		   (jogodavelha[0][2] == "O" e jogodavelha[1][2] == "O" e jogodavelha[2][2] == "O") ou
		   (jogodavelha[0][0] == "O" e jogodavelha[1][1] == "O" e jogodavelha[2][2] == "O") ou
		   (jogodavelha[0][2] == "O" e jogodavelha[1][1] == "O" e jogodavelha[2][0] == "O")){
			limpa()
			tabuleiro()
			escreva("\nJogador O venceu!\n\n")
			escreva("Digite 1: para jogar de novo.\n")
			escreva("Digite 2: para sair.\n\n")
			escreva("Comando: ")
			leia(comando)
			se(comando == "1"){
				jogardenovo()
			}
			se(comando == "2"){
				sair("Obrigado pelo uso!")
			}
			senao{
				comandoinvalido()
			}
		}
	}
	funcao vitoriaX(){
		//Vitória X.
		se((jogodavelha[0][0] == "X" e jogodavelha[0][1] == "X" e jogodavelha[0][2] == "X") ou
		   (jogodavelha[1][0] == "X" e jogodavelha[1][1] == "X" e jogodavelha[1][2] == "X") ou
		   (jogodavelha[2][0] == "X" e jogodavelha[2][1] == "X" e jogodavelha[2][2] == "X") ou
		   (jogodavelha[0][0] == "X" e jogodavelha[1][0] == "X" e jogodavelha[2][0] == "X") ou
		   (jogodavelha[0][1] == "X" e jogodavelha[1][1] == "X" e jogodavelha[2][1] == "X") ou
		   (jogodavelha[0][2] == "X" e jogodavelha[1][2] == "X" e jogodavelha[2][2] == "X") ou
		   (jogodavelha[0][0] == "X" e jogodavelha[1][1] == "X" e jogodavelha[2][2] == "X") ou
		   (jogodavelha[0][2] == "X" e jogodavelha[1][1] == "X" e jogodavelha[2][0] == "X")){
			limpa()
			tabuleiro()
			escreva("\nJogador X venceu!\n\n")
			escreva("Digite 1: para jogar de novo.\n")
			escreva("Digite 2: para sair.\n\n")
			escreva("Comando: ")
			leia(comando)
			se(comando == "1"){
				jogardenovo()
			}
			se(comando == "2"){
				sair("Obrigado pelo uso!")
			}
			senao{
				comandoinvalido()
			}
		}
	}
	funcao empate(){
		//Empate
		se(jogadas == 9){
			limpa()
			tabuleiro()
			escreva("\nEmpate!\n\n")
			escreva("Digite 1: para jogar de novo.\n")
			escreva("Digite 2: para sair.\n\n")
			escreva("Comando: ")
			leia(comando)
			se(comando == "1"){
				jogardenovo()
			}
			se(comando == "2"){
				sair("Obrigado pelo uso!")
			}
			senao{
				comandoinvalido()
			}
		}
	}
	funcao jogardenovo(){
		//Jogar de novo.
		jogodavelha[0][0] = " "
		jogodavelha[0][1] = " "
		jogodavelha[0][2] = " "
		jogodavelha[1][0] = " "
		jogodavelha[1][1] = " "
		jogodavelha[1][2] = " "
		jogodavelha[2][0] = " "
		jogodavelha[2][1] = " "
		jogodavelha[2][2] = " "
		jogadas = 0
		inicio()	
	}
	funcao cadeia sair(cadeia saida){
		//Sair.
		limpa()
		escreva("Saindo em 5 segundos...")
		Util.aguarde(1000)
		limpa()
		escreva("Saindo em 4 segundos...")
		Util.aguarde(1000)
		limpa()
		escreva("Saindo em 3 segundos...")
		Util.aguarde(1000)
		limpa()
		escreva("Saindo em 2 segundos...")
		Util.aguarde(1000)
		limpa()
		escreva("Saindo em 1 segundo...")
		Util.aguarde(1000)
		limpa()
		concluido = verdadeiro
		retorne saida
	}
	funcao comandoinvalido(){
		//Comando inválido.
		limpa()
		escreva("Comando inválido!\nO programa será encerrado...")
		Util.aguarde(1000)
		concluido = verdadeiro
		sair("Obrigado pelo uso!")
	}
	funcao tabuleiro(){
		escreva(" ", jogodavelha[0][0], " | ", jogodavelha[0][1], " | ", jogodavelha[0][2], "\n")
		escreva("-----------\n")
		escreva(" ", jogodavelha[1][0], " | ", jogodavelha[1][1], " | ", jogodavelha[1][2], "\n")
		escreva("-----------\n")
		escreva(" ", jogodavelha[2][0], " | ", jogodavelha[2][1], " | ", jogodavelha[2][2], "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 5108; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */