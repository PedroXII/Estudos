import  PySimpleGUI as sg
sg.theme("LightGreen")
# Aqui é onde está tudo o que vai ter na nossa janela
layout = [[sg.Text("Sistema Python3")], [sg.Button("Ok")]]

# Criando Janela
window = sg.Window("Tela", layout, margins=(100,100) )

#Criando loop dos eventos
while True:
    event, values = window.read()
    if event == "Ok" or event == sg.win_CLOSED:
        break

window.close()
