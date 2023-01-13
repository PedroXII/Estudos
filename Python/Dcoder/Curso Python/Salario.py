def Calcular_Pagamento( qtdd_hora, valor_hora):
    hora = float(qtdd_hora)
    taxa = float(valor_hora)
    if hora <= 40:
        salario = hora * taxa
    else:
        h_excd = hora - 40
        salario = 40*taxa+(h_excd*(1.5*taxa))

    return salario

str_hora = input('Digite as Horas: ')
str_taxa = input('Digite o valor da taxa: ')
Total_Salario = Calcular_Pagamento(str_hora, str_taxa)
print("O valor de seu rendimento é R$: ", Total_Salario)



