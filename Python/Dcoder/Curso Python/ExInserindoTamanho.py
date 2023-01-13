
coluna = []
linha = []
nc = int(input("Digite quantidade de colunas"))
nl = int(input("Digite quantidade de linhas "))
for c1 in range(0, nl):
    linha = []
    for c2 in range(0, nc):
        n = int(input('Numero L[{0}] C[{1}]: '.format(c1+1, c2+1)))
        linha.append(n)
    coluna.append(linha)
print(coluna)
