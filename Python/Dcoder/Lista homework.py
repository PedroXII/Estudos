#Atividade 1
A =[6, 8, 67, 98, 54, 67, 43, 56, 89, 23]
A.sort()
print(A)
print(A.index(67))

#Atividade 2
B = ["Pizza", "Empanado", "Chocolate"]
aa = input("Digite o que sera adicionado na final da lista: ")
ab = input("Digite o que sera adicionado na final da lista: ")
B.extend([aa, ab])
print(B)

#Atividade 3
C = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
C.insert(3, "Valor 1")
C.insert(6, "Valor 2")
C.insert(9, "Valor 3")
print(C)