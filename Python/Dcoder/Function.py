#Atividade 1
va = float(input("Digite o valor A: "))
vb = float(input("Digite o valor B: "))
def operacoes(a, b):
    c = a + b
    d = a - b
    e = a * b
    f = a / b
    print(f"A + B = {c}\nA - B = {d}\nA * B = {e}\nA / B = {f}")
operacoes(va, vb)

#Atividade 2
n = input("Digite o nome: ")
m = input("Digite a mensagem: ")
def mensagem(fn, fm):
    print("Nome: ", n,"\nMensagem: ", m)
mensagem(n, m)

#Atividade 3
sp = float(input("Digite o espaco, em metros: "))
tm = float(input("Digite o tempo, em segundos: "))
def v(s, t):
    v = s/t
    print(f"A velocidade e {v} m/s.")
v(sp, tm)