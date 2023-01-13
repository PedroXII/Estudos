import PySimpleGUI as sg

sg.theme('DarkBlue9')

layout = [[sg.Text("Dados Pessoais")],
          [sg.Text("Nome"), sg.InputText()],
          [sg.Text("Endereço"), sg.InputText()],
          [sg.Text("Nome da Mãe"), sg.InputText()],
          [sg.Text("Nome do Pai"),sg.InputText()],
          [sg.Button("Ok"), sg.Button("Cancelar")]]

window = sg.Window("Python3", layout, margins=(100, 100))

while True:
    event, values = window.read()
    if event == sg.WIN_CLOSED or event == "Cancelar":

       break
    print("*"*30,"Seus dados cadastrados","*"*30)
    print(f"", values[0], "\n", values[1], "\n", values[2], "\n", values[3])

window.close()