#Esse algoritmo determina o valor do PH de um ambiente e determina se ele é: acido, basico ou neutro.
PH = float(input("PH do meio: "))
if PH < 0:
    print("PH invalido.")
elif PH < 7:
    print("O meio e acido.")
elif PH == 7:
    print("O meio e neutro.")
elif PH <= 14:
    print("O meio e basico.")
else:
    print("PH invalido.")