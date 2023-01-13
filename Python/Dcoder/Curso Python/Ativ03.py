nota = 0

for n in range(4):
    n = int(input("Digite uma nota: "))
    nota = n + nota
media = nota/4
if media >= 7:
    print('Aluno aprovado por média: ',media)
else:
    print('Aluno Reprovado por média: ', media)
