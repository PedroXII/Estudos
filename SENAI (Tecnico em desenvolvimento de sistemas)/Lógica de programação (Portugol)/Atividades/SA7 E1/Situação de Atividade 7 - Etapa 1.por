programa{

	inclua biblioteca Texto

	const inteiro total_linhas = 30, total_colunas = 10

	cadeia passageiros[total_linhas][total_colunas], prosseguir, comando, reserva
	cadeia lugares[total_linhas][total_colunas] = {{"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10"}, {"B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10"}, {"C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10"}, {"D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10"}, {"E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8", "E9", "E10"}, {"F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10"}, {"G1", "G2", "G3", "G4", "G5", "G6", "G7", "G8", "G9", "G10"}, {"H1", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10"}, {"I1", "I2", "I3", "I4", "I5", "I6", "I7", "I8", "I9", "I10"}, {"J1", "J2", "J3", "J4", "J5", "J6", "J7", "J8", "J9", "J10"}, {"K1", "K2", "K3", "K4", "K5", "K6", "K7", "K8", "K9", "K10"}, {"L1", "L2", "L3", "L4", "L5", "L6", "L7", "L8", "L9", "L10"}, {"M1", "M2", "M3", "M4", "M5", "M6", "M7", "M8", "M9", "M10"}, {"N1", "N2", "N3", "N4", "N5", "N6", "N7", "N8", "N9", "N10"}, {"O1", "O2", "O3", "O4", "O5", "O6", "O7", "O8", "O9", "O10"}, {"P1", "P2", "P3", "P4", "P5", "P6", "P7", "P8", "P9", "P10"}, {"Q1", "Q2", "Q3", "Q4", "Q5", "Q6", "Q7", "Q8", "Q9", "Q10"}, {"R1", "R2", "R3", "R4", "R5", "R6", "R7", "R8", "R9", "R10"}, {"S1", "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S10"}, {"T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "T9", "T10"}, {"U1", "U2", "U3", "U4", "U5", "U6", "U7", "U8", "U9", "U10"}, {"V1", "V2", "V3", "V4", "V5", "V6", "V7", "V8", "V9", "V10"}, {"W1", "W2", "W3", "W4", "W5", "W6", "W7", "W8", "W9", "W10"}, {"X1", "X2", "X3", "X4", "X5", "X6", "X7", "X8", "X9", "X10"}, {"Y1", "Y2", "Y3", "Y4", "Y5", "Y6", "Y7", "Y8", "Y9", "Y10"}, {"Z1", "Z2", "Z3", "Z4", "Z5", "Z6", "Z7", "Z8", "Z9", "Z10"}, {"AB1", "AB2", "AB3", "AB4", "AB5", "AB6", "AB7", "AB8", "AB9", "AB10"}, {"AC1", "AC2", "AC3", "AC4", "AC5", "AC6", "AC7", "AC8", "AC9", "AC10"}, {"AD1", "AD2", "AD3", "AD4", "AD5", "AD6", "AD7", "AD8", "AD9", "AD10"}, {"AE1", "AE2", "AE4", "AE5", "AE6", "AE7", "AE8", "AE8", "AE9", "AE10"}}
	cadeia nomes_lugares[total_linhas][total_colunas] = {{"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10"}, {"B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10"}, {"C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10"}, {"D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10"}, {"E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8", "E9", "E10"}, {"F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10"}, {"G1", "G2", "G3", "G4", "G5", "G6", "G7", "G8", "G9", "G10"}, {"H1", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10"}, {"I1", "I2", "I3", "I4", "I5", "I6", "I7", "I8", "I9", "I10"}, {"J1", "J2", "J3", "J4", "J5", "J6", "J7", "J8", "J9", "J10"}, {"K1", "K2", "K3", "K4", "K5", "K6", "K7", "K8", "K9", "K10"}, {"L1", "L2", "L3", "L4", "L5", "L6", "L7", "L8", "L9", "L10"}, {"M1", "M2", "M3", "M4", "M5", "M6", "M7", "M8", "M9", "M10"}, {"N1", "N2", "N3", "N4", "N5", "N6", "N7", "N8", "N9", "N10"}, {"O1", "O2", "O3", "O4", "O5", "O6", "O7", "O8", "O9", "O10"}, {"P1", "P2", "P3", "P4", "P5", "P6", "P7", "P8", "P9", "P10"}, {"Q1", "Q2", "Q3", "Q4", "Q5", "Q6", "Q7", "Q8", "Q9", "Q10"}, {"R1", "R2", "R3", "R4", "R5", "R6", "R7", "R8", "R9", "R10"}, {"S1", "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S10"}, {"T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "T9", "T10"}, {"U1", "U2", "U3", "U4", "U5", "U6", "U7", "U8", "U9", "U10"}, {"V1", "V2", "V3", "V4", "V5", "V6", "V7", "V8", "V9", "V10"}, {"W1", "W2", "W3", "W4", "W5", "W6", "W7", "W8", "W9", "W10"}, {"X1", "X2", "X3", "X4", "X5", "X6", "X7", "X8", "X9", "X10"}, {"Y1", "Y2", "Y3", "Y4", "Y5", "Y6", "Y7", "Y8", "Y9", "Y10"}, {"Z1", "Z2", "Z3", "Z4", "Z5", "Z6", "Z7", "Z8", "Z9", "Z10"}, {"AB1", "AB2", "AB3", "AB4", "AB5", "AB6", "AB7", "AB8", "AB9", "AB10"}, {"AC1", "AC2", "AC3", "AC4", "AC5", "AC6", "AC7", "AC8", "AC9", "AC10"}, {"AD1", "AD2", "AD3", "AD4", "AD5", "AD6", "AD7", "AD8", "AD9", "AD10"}, {"AE1", "AE2", "AE4", "AE5", "AE6", "AE7", "AE8", "AE8", "AE9", "AE10"}}
	inteiro reservadas = 0, disponiveis, linhas, colunas, total_lugares
	logico primeiro_uso = verdadeiro, encontrado
	logico encerrado = falso
	
	funcao inicio(){
		se(encerrado == falso){
			se(primeiro_uso == verdadeiro){//Definir quantidade de lugares.
				limpa()
				escreva("Digite a quantidade de linhas de assentos: ")
				leia(linhas)
				limpa()
				se(linhas > 30 ou linhas < 1){
					escreva("O número máximo de linhas de assentos permitido é ", total_linhas, " e o minímo é 1.\n\nPressione [ENTER] para prosseguir.")
					leia(prosseguir)
					inicio()
				}
				limpa()
				escreva("Digite a quantidade de colunas de assentos: ")
				leia(colunas)
				limpa()
				se(colunas > 10 ou colunas < 1){
					escreva("O número máximo de colunas de assentos permitido é ", total_colunas, " e o minímo é 1.\n\nPressione [ENTER] para prosseguir.")
					leia(prosseguir)
					inicio()
				}
				limpa()
				disponiveis = linhas * colunas
				total_lugares = linhas * colunas
				primeiro_uso = falso	
			}
			limpa()
			escreva("------------ Sweet Flight ------------\n\n")
			escreva("Digite 1 para: realizar a reserva de uma poltrona.\n")
			escreva("Digite 2 para: cancelar a reserva de uma poltrona.\n")
			escreva("Digite 3 para: visualizar poltronas disponíveis.\n")
			escreva("Digite 4 para: visualizar poltronas reservadas.\n")
			escreva("Digite 5 para: consultar passageiro pelo nome.\n")
			escreva("Digite 6 para: visualizar o total de poltronas reservadas e total de poltronas disponíveis.\n")
			escreva("Digite 7 para: ver o mapa de assentos do avião.\n")
			escreva("Digite 8 para: reiniciar o sistema.\n")
			escreva("Digite 9 para: sair do sistema.\n\n")
			escreva("Assentos reservados: ", reservadas, " / ", total_lugares, "\n\n")
			escreva("Comando: ")
			leia(comando)
			se(comando == "1"){
				reservar()
				inicio()
			}
			se(comando == "2"){
				cancelar_reserva()
				inicio()
			}
			se(comando == "3"){
				visualizar_disponiveis()
				inicio()
			}
			se(comando == "4"){
				visualizar_reservadas()
				inicio()
			}
			se(comando == "5"){
				consultar_nome()
				inicio()
			}
			se(comando == "6"){
				estatisticas()
				inicio()
			}
			se(comando == "7"){
				mapa_lugares()
				escreva("Pressione [ENTER] para prosseguir.")
				leia(prosseguir)
				inicio()
			}
			se(comando == "8"){
				reiniciar()
				inicio()
			}
			se(comando == "9"){
				sair()
			}
			se(nao(comando == "1" ou comando == "2" ou comando == "3" ou comando == "4" ou comando == "5" ou comando == "6" ou comando == "7" ou comando == "8" ou comando == "9")){
				limpa()
				escreva("Comando inválido!\n")
				escreva("\nPressione [ENTER] para voltar ao menu...")
				leia(prosseguir)
				inicio()
			}
		}
	}
	funcao reservar(){
		limpa()
		encontrado = falso
		se(disponiveis > 0){
			mapa_lugares()
			escreva("Digite o nome do assento a ser reservado: ")
			leia(reserva)
			reserva = Texto.caixa_alta(reserva)
			para(inteiro i = 0 ; i < linhas; i++){
				para(inteiro x = 0; x < colunas; x++){
					se(reserva == lugares[i][x] e lugares[i][x] != "RES"){
						limpa()
						encontrado = verdadeiro
						escreva("Nome do passageiro: ")
						leia(passageiros[i][x])
						passageiros[i][x] = Texto.caixa_alta(passageiros[i][x])
						Texto.caixa_alta(passageiros[i][x])
						lugares[i][x] = "RES"
						reservadas++
						disponiveis--
						limpa()
						escreva("Lugar: ", nomes_lugares[i][x], " reservado!\n\n")
						escreva("Pressione [ENTER] para prosseguir.")
						leia(prosseguir)
						limpa()
					}
					se(reserva == lugares[i][x] e lugares[i][x] == "RES"){
						encontrado = verdadeiro
						limpa()
						escreva("O lugar ", nomes_lugares[i][x], " já foi reservado!\n\n")
						escreva("Pressione [ENTER] para prosseguir.")
						leia(prosseguir)
						limpa()
					}
				}
			}
			se(encontrado == falso){
				limpa()
				escreva("O lugar digitado não existe!\n\n")
				escreva("Pressione [ENTER] para prosseguir.")
				leia(prosseguir)
				limpa()
			}
			limpa()
			escreva("Deseja voltar ao menu ou reservar outro lugar?\n\n")
			escreva("Digite 1 para: reservar outro lugar.\n")
			escreva("Digite 2 para: voltar ao menu.\n\n")
			escreva("Comando: ")
			leia(comando)
			limpa()
			se(comando == "1"){
				reservar()
			}
			se(comando == "2"){
				inicio()
			}
			se(nao(comando == "1" ou comando == "2")){
				limpa()
				escreva("Comando inválido!\n")
				escreva("\nPressione [ENTER] para voltar ao menu...")
				leia(prosseguir)
				inicio()
			}
		}
		senao{
			limpa()
			escreva("Não há mais lugares disponíveis!\n\n")
			escreva("Pressione [ENTER] para prosseguir.")
			leia(prosseguir)
			limpa()
			inicio()
		}
	}
	funcao mapa_lugares(){
		limpa()
		escreva("---------- Asssentos do avião ----------\n\n")
		para(inteiro i = 0; i < linhas; i++){
			para(inteiro x = 0; x < colunas; x++){
				escreva(lugares[i][x], "  ")
			}
			escreva("\n\n")
		}
	}
	funcao visualizar_disponiveis(){
		se(disponiveis > 0){
			limpa()
			escreva("---------- Poltronas disponíveis ----------\n\n")
			para(inteiro i = 0; i < linhas; i++){
				para(inteiro x = 0; x < colunas; x++){
					se(lugares[i][x] != "RES"){
						escreva("Poltrona: ", lugares[i][x], "\n")
					}
				}
			}
			escreva("\nPressione [ENTER] para prosseguir.")
			leia(prosseguir)
			inicio()
		}
		senao{
			limpa()
			escreva("Não há mais assentos disponíveis!\n")
			escreva("\nPressione [ENTER] para prosseguir.")
			leia(prosseguir)
			inicio()
		}
	}
	funcao visualizar_reservadas(){
		se(reservadas > 0){
			limpa()
			escreva("---------- Poltronas reservadas ----------\n\n")
			para(inteiro i = 0; i < linhas; i++){
				para(inteiro x = 0; x < colunas; x++){
					se(lugares[i][x] == "RES"){
						escreva("Poltrona: ", nomes_lugares[i][x],", Nome do passageiro: ", passageiros[i][x], "\n")
					}
				}
			}
			escreva("\nPressione [ENTER] para prosseguir.")
			leia(prosseguir)
			inicio()
		}
		senao{
			limpa()
			escreva("Não há assentos reservados!\n")
			escreva("\nPressione [ENTER] para prosseguir.")
			leia(prosseguir)
			inicio()
		}
	}
	funcao consultar_nome(){
		se(reservadas > 0){
			cadeia nome
			encontrado = falso
			limpa()
			escreva("---------- Pesquisa de passageiros ----------\n")
			escreva("\nDigite o nome a ser pesquisado: ")
			leia(nome)
			nome = Texto.caixa_alta(nome)
			limpa()
			escreva("---------- Pesquisa de passageiros ----------\n\n")
			para(inteiro i = 0; i < linhas; i++){
				para(inteiro x = 0; x < colunas; x++){
					se(nome == passageiros[i][x]){
						encontrado = verdadeiro
						escreva("Passageiro: ", passageiros[i][x], ", está na poltrona: ", nomes_lugares[i][x], "\n")
					}
				}
			}
			se(encontrado == verdadeiro){
				escreva("\nPressione [ENTER] para prosseguir.")
				leia(prosseguir)
			}
			se(encontrado == falso){
				limpa()
				escreva("O passageiro pesquisado não foi encontrado!\n")
				escreva("\nPressione [ENTER] para prosseguir.")
				leia(prosseguir)
			}
			limpa()
			escreva("Deseja voltar ao menu ou consultar outro nome?\n\n")
			escreva("Digite 1 para: consultar outro nome.\n")
			escreva("Digite 2 para: voltar ao menu.\n\n")
			escreva("Comando: ")
			leia(comando)
			limpa()
			se(comando == "1"){
				consultar_nome()
			}
			se(comando == "2"){
				inicio()
			}
			se(nao(comando == "1" ou comando == "2")){
				limpa()
				escreva("Comando inválido!\n")
				escreva("\nPressione [ENTER] para voltar ao menu...")
				leia(prosseguir)
				inicio()
			}
		}
		senao{
			limpa()
			escreva("Não há assentos reservados para serem consultados\n")
			escreva("\nPressione [ENTER] para prosseguir.")
			leia(prosseguir)
			inicio()
		}
	}
	funcao estatisticas(){
		limpa()
		real total = total_lugares
		real porcentagem = 100 / total
		real res = porcentagem * reservadas
		real dis = porcentagem * disponiveis
		escreva("---------- Estatísticas ----------\n")
		escreva("\nPoltronas reservadas: ", reservadas, "\n")
		escreva("Poltronas disponíneis: ", disponiveis,"\n")
		escreva("Porcentagem: ", res, "% reservadas, ", dis, "% disponíveis.\n")
		escreva("\nPressione [ENTER] para prosseguir.")
		leia(prosseguir)
	}
	funcao cancelar_reserva(){
		se(reservadas > 0){
			limpa()
			cadeia resultado[300]
			cadeia nome
			inteiro resultado_quantidade
			encontrado = falso
			escreva("---------- Cancelar Reserva ----------\n")
			escreva("\nDigite 1 para: cancelar um assento.\n")
			escreva("Digite 2 para: voltar ao menu.\n")
			escreva("\nComando: ")
			leia(comando)
			limpa()
			se(comando == "1"){
				escreva("Digite o assento a ser cancelado: ")
				leia(reserva)
				reserva = Texto.caixa_alta(reserva)
				limpa()
				para(inteiro i = 0; i < linhas; i++){
					para(inteiro x = 0; x < colunas; x++){
						se(nomes_lugares[i][x] == reserva e lugares[i][x] == "RES"){
							encontrado = verdadeiro
							escreva("Deseja cancelar essa reserva?\n")
							escreva("\nAssento: ", nomes_lugares[i][x], ", Nome do passageiro: ", passageiros[i][x], "\n")
							escreva("\nDigite 1 para: cancelar reserva.\n")
							escreva("Digite 2 para: sair.\n")
							escreva("\nComando: ")
							leia(comando)
							limpa()
							se(comando == "1"){
								passageiros[i][x] = ""
								lugares[i][x] = nomes_lugares[i][x]
								disponiveis++
								reservadas--
								escreva("Reserva do assento ", nomes_lugares[i][x], " cancelada!\n")
								escreva("\nPressione [ENTER] para prosseguir.")
								leia(prosseguir)
								limpa()
							}
							se(comando == "2"){
								cancelar_reserva()
							}
							se(nao(comando == "1" ou comando == "2")){
								limpa()
								escreva("Comando inválido!\n")
								escreva("\nPressione [ENTER] para voltar ao menu...")
								leia(prosseguir)
								inicio()
							}
						}
					}
				}
				se(encontrado == falso){
					escreva("O assento ", reserva, " não foi encontrado!\n")
					escreva("\nPressione [ENTER] para prosseguir.")
					leia(prosseguir)
					limpa()
				}
				limpa()
				escreva("Deseja voltar ao menu?\n\n")
				escreva("Digite 1 para: cancelar uma reserva.\n")
				escreva("Digite 2 para: voltar ao menu.\n\n")
				escreva("Comando: ")
				leia(comando)
				limpa()
				se(comando == "1"){
					cancelar_reserva()
				}
				se(comando == "2"){
					inicio()
				}
				se(nao(comando == "1" ou comando == "2")){
					limpa()
					escreva("Comando inválido!\n")
					escreva("\nPressione [ENTER] para voltar ao menu...")
					leia(prosseguir)
					inicio()
				}
			}
			se(comando == "2"){
				inicio()
			}
			se(nao(comando == "1" ou comando == "2")){
				limpa()
				escreva("Comando inválido!\n")
				escreva("\nPressione [ENTER] para voltar ao menu...")
				leia(prosseguir)
				inicio()
			}
		}
		senao{
			limpa()
			escreva("Não há assentos reservados!\n")
			escreva("\nPressione [ENTER] para prosseguir.")
			leia(prosseguir)
			inicio()
		}
	}
	funcao reiniciar(){
		limpa()
		escreva("Realmente deseja reiniciar o sistema?\nTodos os dados serão apagados.\n")
		escreva("\nDigite 1 para: reiniciar o sistema.\n")
		escreva("Digite 2 para: voltar ao menu.\n")
		escreva("\nComando: ")
		leia(comando)
		se(comando == "1"){
			para(inteiro i = 0; i < 30; i++){
				para(inteiro x = 0; x < 10; x++){
					passageiros[i][x] = ""
					lugares[i][x] = nomes_lugares[i][x]
				}
			}
			limpa()
			primeiro_uso = verdadeiro
			reservadas = 0
			escreva("Sistema reiniciado!\n")
			escreva("\nPressione [ENTER] para prosseguir.")
			leia(prosseguir)
			inicio()
		}
		se(comando == "2"){
			inicio()
		}
		se(nao(comando == "1" ou comando == "2")){
			limpa()
			escreva("Comando inválido!\n")
			escreva("\nPressione [ENTER] para voltar ao menu...")
			leia(prosseguir)
			inicio()
		}
	}
	funcao sair(){
		limpa()
		escreva("Deseja fechar o sistema?\n")
		escreva("Todos os dados salvos serão perdidos.\n")
		escreva("\nDigite 1 para: fechar o sistema.\n")
		escreva("Digite 2 para: voltar ao menu.\n")
		escreva("\nComando: ")
		leia(comando)
		se(comando == "1"){
			limpa()
			encerrado = verdadeiro
		}
		se(comando == "2"){
			inicio()
		}
		se(nao(comando == "1" ou comando == "2")){
			limpa()
			escreva("Comando inválido!\n")
			escreva("\nPressione [ENTER] para voltar ao menu...")
			inicio()
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 15802; 
 * @DOBRAMENTO-CODIGO = [15, 172, 182, 205, 286, 430];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */