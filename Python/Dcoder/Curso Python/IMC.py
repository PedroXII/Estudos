"""
Altura = float(input("Digite sua Altura: "))
Peso = float(input("Digite seu Peso: "))

IMC = Peso/(Altura*Altura)

print(f"Seu indice de massa corporal é {IMC}")
"""
def calculador_IMC(Peso, Altura):
    print(Peso/Altura **2)

calculador_IMC(75, 1.70)
calculador_IMC(80, 1.90)