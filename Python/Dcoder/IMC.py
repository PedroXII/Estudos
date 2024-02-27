def resultado():
    print("Peso: ", peso,"\nAltura: ", altura,"\nIMC: ", IMC,"kg/m2.")
    if IMC < 17:
        print("O IMC indica que a pessoa esta muito abaixo do peso.\nO que pode acontecer: Queda de cabelo, infertilidade, ausência menstrual.")
    elif IMC >= 17 and IMC < 18.5:
        print("O IMC indica que a pessoa esta abaixo do peso.\nO que pode acontecer: Fadiga, stress, ansiedade.")
    elif IMC >= 18.5 and IMC < 25:
        print("O IMC indica que a pessoa esta com o peso normal.\nO que pode acontecer: Menor risco de doenças cardíacas e vasculares.")
    elif IMC >= 25 and IMC < 30:
        print("O IMC indica que a pessoa esta acima do peso.\nO que pode acontecer: Fadiga, má circulação, varizes.")
    elif IMC >= 30 and IMC < 35:
        print("O IMC indica que a pessoa esta com obesidade grau 1.\nO que pode acontecer: Diabetes, angina, infarto, aterosclerose.")
    elif IMC >= 35 and IMC < 40:
        print("O IMC indica que a pessoa esta com obesidade grau 2.\nO que pode acontecer: Apneia do sono, falta de ar.")
    else:
        print("O IMC indica que a pessoa esta com obesidade grau 3.\nO que pode acontecer: Refluxo, dificuldade para se mover, escaras, diabetes, infarto, AVC.")

print("Digite as seguintes perguntas com 'sim' ou 'nao'.")
vpeso = input("Voce sabe o peso? ")
valtura = input ("Voce sabe a altura? ")
vimc = input ("Voce sabe o IMC? ")
if vpeso == "sim" and valtura == "sim" and vimc == "nao":
    peso = float(input("Digite o peso, em quilogramas: "))
    altura = float(input("Digite a altura, em metros: "))
    IMC = peso/altura/altura
    resultado()
elif vpeso == "sim" and valtura == "nao" and vimc == "sim":
    peso = float(input("Digite o peso, em quilogramas: "))
    IMC = float(input("Digite o IMC, em kg/m2: "))
    D=4*IMC*peso
    altura = (D**(1/2))/(2*IMC)
    resultado()
elif vpeso == "nao" and valtura == "sim" and vimc == "sim":
    altura = float(input("Digite a altura, em metros: "))
    IMC = float(input("Digite o IMC, em kg/m2: "))
    peso = IMC*altura*altura
    resultado()
elif vpeso == "sim" and valtura == "sim" and vimc == "sim":
    peso = float(input("Digite o peso, em quilogramas: "))
    altura = float(input("Digite a altura, em metros: "))
    IMC = float(input("Digite o IMC, em kg/m2: "))
    if peso != IMC*altura*altura or altura != peso/IMC/altura or IMC != peso/altura/altura:
        print("Voce digitou dados errados.")
    else:
        resultado()
else:
    print("Nao ha dados suficientes para executar o algoritmo.")

