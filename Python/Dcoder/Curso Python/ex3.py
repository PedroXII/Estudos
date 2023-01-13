nome = input("Digite o nome do aluno(a) para inserir as notas: ")
soma = cont = 0
pos: int = 1
for cont in range (4):
    print('Digite a', pos,'º nota:')
    notas = float(input())
    pos += 1
    cont +=1
    soma += notas
    media = soma / cont
if media <= 4:
    print(f"Aluno(a): {nome}, está reprovado com a média {media}!")
elif media > 4 and media < 7:
    print(f"Aluno(a): {nome}, está em recuperação com a  média {media}!")
else:
    print(f"Aluno(a): {nome} foi Aprovado com a média{media}!")