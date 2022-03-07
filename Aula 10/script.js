var termos = []
var length = 0
function adicionar(){
    var getNumero = window.document.getElementById('termo')
    var setNumero = getNumero.value
    var numero = Number(setNumero)
    var pass = termos.find(x => x == numero)
    var mensagem = window.document.getElementById('list-num')
    if(numero >= 1 && numero <= 100 && pass != numero){
        length = termos.length
        termos.push(numero)
        var lista = document.createElement('option')
        lista.text = `Número ${numero} adicionado, na posição ${length}.`
        mensagem.appendChild(lista)
    }
    else{window.alert("Número inválido ou já adicionado.")}
    }
function calcular(){
    let size = termos.length
    let menor = termos[0]
    let setMaior = termos.sort
    let maior = termos[size - 1]
    let soma = 0
    for(let x = 0; x <= size - 1; x++){
        soma += termos[x]
    }
    let media = soma / size
    let resultado = window.document.getElementById('resultado')
    resultado.innerHTML = `Quantidade de números: ${size},<br/>Menor número: ${menor},<br/>Maior número: ${maior},<br/>Soma de todos os números: ${soma},<br/>Média dos números: ${media}.`
}