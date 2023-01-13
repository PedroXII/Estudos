# Matriz 3x3
"""
nota = 0
"""
matriz = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
for linha in range(0, 3):
    for coluna in range(0, 3):
        matriz[linha][coluna]=int(input(f'Digite um valor: [{linha},{coluna}]: '))
print('#'*100)
for linha in range(0, 3):
    for coluna in range(0, 3):
        print(f'{matriz[linha][coluna]:^5}', end='')
    print()

