programa{
	inclua biblioteca Util

	caracter comando
	cadeia prosseguir, nomes[1000], nome
	inteiro id = 0, idades[1000], quantidade, nova_quantidade
	logico primeiro_uso = verdadeiro
	
	funcao inicio(){
		se(primeiro_uso == verdadeiro){
			escreva("Número de pessoas à cadastrar: ")
			leia(quantidade)
			primeiro_uso = falso
		}
		
		limpa()
		escreva("------------ Cadastro de usuários ------------\n\n")
		escreva("Digite: 1 - Para cadastrar novo usuário.\n")
		escreva("Digite: 2 - Para mostrar todos os usuários cadastrados.\n")
		escreva("Digite: 3 - Para aumentar o limite de usuários.\n")
		escreva("Digite: 4 - Para pesquisar um usuário por nome.\n")
		escreva("Digite: 5 - Para excluir um usuário.\n")
		escreva("Digite: 6 - Para fechar o programa.\n\n")
		escreva("Limite de usuários: ", quantidade,"\nTotal atual: ", id, "\n\n")
		escreva("Digite o comando: ")
		leia(comando)
		escolha(comando){
			caso '1':
				cadastrar()
				pare
			caso '2':
				listar()
				pare
			caso '3':
				novaquantidade()
				pare
			caso '4':
				busca()
				pare
			caso '5':
				excluir()
				pare
			caso '6':
				sair()
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
	funcao busca(){
		limpa()
		escreva("Digite o nome a ser pesquisado: ")
		leia(nome)
		limpa()
		escreva("----- Resultado da pesquisa -----\n\n")
		para(inteiro i = 0; i < id; i++){
			se(nome == nomes[i]){
			escreva("ID: ", i, ", Nome: ", nomes[i], ", Idade: ", idades[i], "\n")
			}
		}
		escreva("\n\nPressione Enter para continuar.")
		leia(prosseguir)
		inicio()
	}
	funcao cadastrar(){
		se(quantidade > id){
			limpa()
			escreva("Digite o nome do usuário: ")
			leia(nomes[id])
			limpa()
			escreva("Digite a idade do usuário: ")
			leia(idades[id])
			id++
			limpa()
			inicio()
		}
		senao{
			limpa()
			escreva("Cadastro cheio!")
			Util.aguarde(1000)
			inicio()
		}
	}
	funcao listar(){
		limpa()
		para(inteiro i = 0; i < id; i++){
			escreva("Usuario: ", i, ", Nome: ", nomes[i], ", Idade: ", idades[i], "\n")
		}
		escreva("\nPressione [ENTER] para prosseguir.")
		leia(prosseguir)
		limpa()
		inicio()
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
	funcao novaquantidade(){
		limpa()
		escreva("Digite a nova quantidade: ")
		leia(nova_quantidade)
		se(nova_quantidade > 1000 ou nova_quantidade <= quantidade){
			limpa()
			escreva("Nova quantidade é igual ou menor que a anterior ou inválida!")
			Util.aguarde(1000)
			inicio()
		}
		senao{
			limpa()
			quantidade = nova_quantidade
			escreva("Quantidade atualizada!")
			Util.aguarde(1000)
			inicio()
		}
	}
	funcao excluir(){
		limpa()
		escreva("Excluir:\n\n1 - Por nome (Observação: todos com o mesmo nome serão excluídos).\n2 - Por ID.\n3 - Voltar para o menu.\n\nComando: ")
		leia(comando)
		limpa()
		escolha(comando){
			caso '1':
				escreva("Nome do usuário à ser excluido: ")
				leia(nome)
				para(inteiro x = 0; x < id; x++){ //Repetir
					para(inteiro i = 0; i < id; i++){ //Buscar
						se(nome == nomes[i]){ //Analisar
							para(i; i < id; i++){ //Excluir
								nomes[i] = nomes[i + 1]
								idades[i] = idades[i + 1]
							}
							id--
							limpa()
							escreva("Usuário excluído!")
							Util.aguarde(1000)
						}
					}
				}
				inicio()
				pare
			caso '2':
				inteiro id_excluir = 0
				escreva("ID do usuário à ser excluido: ")
				leia(id_excluir)
				para(inteiro i = 0; i < id; i++){ //Buscar
						se(id_excluir == i){ //Analisar
							para(i; i < id; i++){ //Excluir
								nomes[i] = nomes[i + 1]
								idades[i] = idades[i + 1]
							}
							id--
							limpa()
							escreva("Usuário excluído!")
							Util.aguarde(1000)
						}
				}
				inicio()
				pare
			caso '3':
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
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3920; 
 * @DOBRAMENTO-CODIGO = [54, 69, 88, 98, 109];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */