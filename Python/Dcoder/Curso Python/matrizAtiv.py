# Matriz 3x3
matriz = [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]
for linha in range(0, 4):
    for coluna in range(0, 4):
        matriz[linha][coluna] = str(input(f'Digite um valor: [{linha},{coluna}]: '))
print('#'*100)
for linha in range(0, 4):
    for coluna in range(0, 4):
        print(f'{matriz[linha][coluna]:^15}', end='')
    print()

