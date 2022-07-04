programa{

	inclua biblioteca Util

	cadeia jogodavelha[3][3] = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}}, comando
	inteiro jogadal, jogadac, jogadas = 0
	funcao inicio(){
		limpa()
		escreva("Jogador O:\n\n")
		escreva(" ", jogodavelha[0][0], " | ", jogodavelha[0][1], " | ", jogodavelha[0][2], "\n")
		escreva("-----------\n")
		escreva(" ", jogodavelha[1][0], " | ", jogodavelha[1][1], " | ", jogodavelha[1][2], "\n")
		escreva("-----------\n")
		escreva(" ", jogodavelha[2][0], " | ", jogodavelha[2][1], " | ", jogodavelha[2][2], "\n")
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
				escreva(" ", jogodavelha[0][0], " | ", jogodavelha[0][1], " | ", jogodavelha[0][2], "\n")
				escreva("-----------\n")
				escreva(" ", jogodavelha[1][0], " | ", jogodavelha[1][1], " | ", jogodavelha[1][2], "\n")
				escreva("-----------\n")
				escreva(" ", jogodavelha[2][0], " | ", jogodavelha[2][1], " | ", jogodavelha[2][2], "\n")
				escreva("\nJogador O venceu!\n\n")
				escreva("Digite 1: para jogar de novo.\n")
				escreva("Digite 2: para sair.\n\n")
				escreva("Comando: ")
				leia(comando)
					//Jogar de novo.
					se(comando == "1"){
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
					//Sair.
					se(comando == "2"){
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
					sair()
					}
					//Comando inválido.
					senao{
					limpa()
					escreva("Comando inválido!\nO programa será encerrado em 5 segundos...")
					Util.aguarde(1000)
					limpa()
					escreva("Comando inválido!\nO programa será encerrado em 4 segundos...")
					Util.aguarde(1000)
					limpa()
					escreva("Comando inválido!\nO programa será encerrado em 3 segundos...")
					Util.aguarde(1000)
					limpa()
					escreva("Comando inválido!\nO programa será encerrado em 2 segundos...")
					Util.aguarde(1000)
					limpa()
					escreva("Comando inválido!\nO programa será encerrado em 1 segundo...")
					Util.aguarde(1000)
					sair()
					}
			}
			//Empate
			se(jogadas == 9){
				limpa()
				escreva(" ", jogodavelha[0][0], " | ", jogodavelha[0][1], " | ", jogodavelha[0][2], "\n")
				escreva("-----------\n")
				escreva(" ", jogodavelha[1][0], " | ", jogodavelha[1][1], " | ", jogodavelha[1][2], "\n")
				escreva("-----------\n")
				escreva(" ", jogodavelha[2][0], " | ", jogodavelha[2][1], " | ", jogodavelha[2][2], "\n")
				escreva("\nEmpate!\n\n")
				escreva("Digite 1: para jogar de novo.\n")
				escreva("Digite 2: para sair.\n\n")
				escreva("Comando: ")
				leia(comando)
					//Jogar de novo.
					se(comando == "1"){
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
					//Sair.
					se(comando == "2"){
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
					sair()
					}
					//Comando inválido.
					senao{
					limpa()
					escreva("Comando inválido!\nO programa será encerrado em 5 segundos...")
					Util.aguarde(1000)
					limpa()
					escreva("Comando inválido!\nO programa será encerrado em 4 segundos...")
					Util.aguarde(1000)
					limpa()
					escreva("Comando inválido!\nO programa será encerrado em 3 segundos...")
					Util.aguarde(1000)
					limpa()
					escreva("Comando inválido!\nO programa será encerrado em 2 segundos...")
					Util.aguarde(1000)
					limpa()
					escreva("Comando inválido!\nO programa será encerrado em 1 segundo...")
					Util.aguarde(1000)
					sair()
					}
			} 
		}
		jogador2()
	}
	funcao jogador2(){
		limpa()
		escreva("Jogador X:\n\n")
		escreva(" ", jogodavelha[0][0], " | ", jogodavelha[0][1], " | ", jogodavelha[0][2], "\n")
		escreva("-----------\n")
		escreva(" ", jogodavelha[1][0], " | ", jogodavelha[1][1], " | ", jogodavelha[1][2], "\n")
		escreva("-----------\n")
		escreva(" ", jogodavelha[2][0], " | ", jogodavelha[2][1], " | ", jogodavelha[2][2], "\n")
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
		se(jogodavelha[jogadal][jogadac] == "X" ou jogodavelha[jogadal][jogadac] == "O"){
			limpa()
			escreva("Essa jogada já foi feita!")
			Util.aguarde(2000)
			jogador2()
		}
		senao{
			limpa()
			jogodavelha[jogadal][jogadac] = "X"
			jogadas++
			escreva("Jogada feita!")
			Util.aguarde(1000)
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
				escreva(" ", jogodavelha[0][0], " | ", jogodavelha[0][1], " | ", jogodavelha[0][2], "\n")
				escreva("-----------\n")
				escreva(" ", jogodavelha[1][0], " | ", jogodavelha[1][1], " | ", jogodavelha[1][2], "\n")
				escreva("-----------\n")
				escreva(" ", jogodavelha[2][0], " | ", jogodavelha[2][1], " | ", jogodavelha[2][2], "\n")
				escreva("\nJogador X venceu!\n\n")
				escreva("Digite 1: para jogar de novo.\n")
				escreva("Digite 2: para sair.\n\n")
				escreva("Comando: ")
				leia(comando)
					//Jogar de novo.
					se(comando == "1"){
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
					//Sair.
					se(comando == "2"){
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
					sair()
					}
					//Comando inválido.
					senao{
					limpa()
					escreva("Comando inválido!\nO programa será encerrado em 5 segundos...")
					Util.aguarde(1000)
					limpa()
					escreva("Comando inválido!\nO programa será encerrado em 4 segundos...")
					Util.aguarde(1000)
					limpa()
					escreva("Comando inválido!\nO programa será encerrado em 3 segundos...")
					Util.aguarde(1000)
					limpa()
					escreva("Comando inválido!\nO programa será encerrado em 2 segundos...")
					Util.aguarde(1000)
					limpa()
					escreva("Comando inválido!\nO programa será encerrado em 1 segundo...")
					Util.aguarde(1000)
					sair()
					}
			}
			//Empate
			se(jogadas == 9){
				limpa()
				escreva(" ", jogodavelha[0][0], " | ", jogodavelha[0][1], " | ", jogodavelha[0][2], "\n")
				escreva("-----------\n")
				escreva(" ", jogodavelha[1][0], " | ", jogodavelha[1][1], " | ", jogodavelha[1][2], "\n")
				escreva("-----------\n")
				escreva(" ", jogodavelha[2][0], " | ", jogodavelha[2][1], " | ", jogodavelha[2][2], "\n")
				escreva("\nEmpate!\n\n")
				escreva("Digite 1: para jogar de novo.\n")
				escreva("Digite 2: para sair.\n\n")
				escreva("Comando: ")
				leia(comando)
					//Jogar de novo.
					se(comando == "1"){
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
					//Sair.
					se(comando == "2"){
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
					sair()
					}
					//Comando inválido.
					senao{
					limpa()
					escreva("Comando inválido!\nO programa será encerrado em 5 segundos...")
					Util.aguarde(1000)
					limpa()
					escreva("Comando inválido!\nO programa será encerrado em 4 segundos...")
					Util.aguarde(1000)
					limpa()
					escreva("Comando inválido!\nO programa será encerrado em 3 segundos...")
					Util.aguarde(1000)
					limpa()
					escreva("Comando inválido!\nO programa será encerrado em 2 segundos...")
					Util.aguarde(1000)
					limpa()
					escreva("Comando inválido!\nO programa será encerrado em 1 segundo...")
					Util.aguarde(1000)
					sair()
					}
			}
		}
		inicio()
	}// < Jogador 2.
	funcao sair(){
		limpa()
		escreva("Obrigado pelo uso!")
		Util.aguarde(2000)
	}// < Sair
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 11662; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */