try {
    function calcular(){
    var imagem = window.document.getElementById('imagem')
    var mensagem = window.document.getElementById('resultado')
    var agora = new Date()
    var getNasc = window.document.getElementById('nasc')
    var nasc = getNasc.value
    var nascdate = new Date(nasc)
    var dia = agora.getDate()
    var mes = agora.getMonth() + 1
    var ano = agora.getFullYear()
    var dian = nascdate.getDate() + 1
    var mesn = nascdate.getMonth() + 1
    var anon = nascdate.getFullYear()
    var idade = Number.parseInt(((31 - dian) + (365 - (mesn + 1) * 30) + (ano - anon - 1) * 365 + dia + (mes * 30)) / 365)
    var button = window.document.getElementsByName('sex')
    var sexo = ''
    if(button[0].checked){
        sexo = 'Masculino'
    }
    if(button[1].checked){
        sexo = 'Feminino'
    }
    var peso = Number(window.document.getElementById('peso'))
    var altura = Number(window.document.getElementById('altura'))
    var imc = Number(peso / (altura * altura))
    if(altura <= 0 || peso <= 0 || sexo == '' || idade < 0){
        mensagem.innerHTML = `Preencha todos os dados e tente novamente`
    }
    else{
        if(imc < 18.5){
            imagem.src = 'abaixo_do_peso.png'
        }
    }
}
    
} catch (error) {
    mensagem.innerHTML = `Preencha todos os dados e tente novamente`
}