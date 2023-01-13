nome = input(" Digite o nome do aluno para inserir as notas: ")
soma = cont = 0
while True:
    notas = float(input("(Obs: digite 555 para parar), Digite uma nota: "))
    if notas == 555:
        break
    cont +=1
    soma += notas
    media = soma / cont
print(f"A média do Aluno {nome} foi {media} !")
if media <= 6:
    print("Aluno reprovado")
else:
    print("Aluno aprovado")