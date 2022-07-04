programa{
	inclua biblioteca Util

	caracter comando
	cadeia prosseguir, nomes[1000], nome
	inteiro id = 0, idades[1000], quantidade, nova_quantidade, resultado_busca[1000], posicao = 0
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
		escreva("Digite: 3 - Para fechar o programa.\n")
		escreva("Digite: 4 - Para pesquisar um usuário por nome.\n")
		escreva("Digite: 5 - Para aumentar o limite de usuários.\n\n")
		escreva("Limite de usuários: ", quantidade,"\nTotal atual: ", id, "\n\n")
		escreva("Digite o comando: ")
		leia(comando)
		escolha(comando){
			caso '1':
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
			pare
			caso '2':
				limpa()
				para(inteiro i = 0; i < id; i++){
					escreva("Usuario: ", i, ", Nome: ", nomes[i], ", Idade: ", idades[i], "\n")
				}
				escreva("\nPressione [ENTER] para prosseguir.")
				leia(prosseguir)
				limpa()
				inicio()
				pare
			caso '3':
				limpa()
				escreva("Saindo em 3 segundos...")
				Util.aguarde(1000)
				limpa()
				escreva("Saindo em 2 segundos...")
				Util.aguarde(1000)
				limpa()
				escreva("Saindo em 1 segundo...")
				Util.aguarde(1000)
				pare
			caso '4':
				limpa()
				posicao = 0
				escreva("Digite o nome a ser pesquisado: ")
				leia(nome)
				limpa()
				escreva("----- Resultado da pesquisa -----\n\n")
				se(busca(nome) != -1){
					escreva("id: ", busca(nome), " - nome: ", nomes[busca(nome)], " - idade: ", idades[busca(nome)])
				escreva("\n\nPressione Enter para continuar.")
				leia(prosseguir)
				inicio()
				pare
			caso '5':
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
	funcao inteiro busca(cadeia pesquisa){
		para(inteiro i = 0; i < id; i++){
			se(pesquisa == nomes[i]){
				retorne i
			}
		}
		retorne -1
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2790; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */