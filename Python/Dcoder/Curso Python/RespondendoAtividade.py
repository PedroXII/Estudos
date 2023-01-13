
N1 = int(input('Digite uma nota: '))
N2 = int(input('Digite uma nota: '))
N3 = int(input('Digite uma nota: '))
N4 = int(input('Digite uma nota: '))

media = (N1+N2+N3+N4)/4
if media >= 7:
    print('Aprovado')
elif media > 4 and media <7:
    print('Recuperação')
else:
    print('Reprovado')

