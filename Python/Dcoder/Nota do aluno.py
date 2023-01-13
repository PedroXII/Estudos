nome = input("Nome do aluno: ")  
n1 = float(input("Nota 1: "))
if n1 < 0:
    print("A nota deve ser um numero positivo.")
else:
    n2 = float(input("Nota 2: "))
    if n2 < 0:
        print("A nota deve ser um numero positivo.")
    else:
        n3 = float(input("Nota 3: "))
        if n3 < 0:
            print("A nota deve ser um numero positivo.")
        else:
            n4 = float(input("Nota 4: "))
            if n4 < 0:
                print("A nota deve ser um numero positivo.")
            else:
                media = (n1+n2+n3+n4)/4
                if media < 0:
                    print("Valor da media invalido.")
                elif media < 3:
                    print("Aluno: ", nome,"\nPrimeira nota:", n1,"\nSegunda nota:", n2,"\nTerceira nota:", n3,"\nQuarta nota:", n4,"\nMedia:", media,"\nAluno reprovado.")
                elif media < 7:
                    print("Aluno: ", nome,"\nPrimeira nota:", n1,"\nSegunda nota:", n2,"\nTerceira nota:", n3,"\nQuarta nota:", n4,"\nMedia:", media,"\nAluno de recuperacao.")
                elif media <= 10:
                    print("Aluno: ", nome,"\nPrimeira nota:", n1,"\nSegunda nota:", n2,"\nTerceira nota:", n3,"\nQuarta nota:", n4,"\nMedia:", media,"\nAluno aprovado.")
                else:
                    print("Valor da media invalido")