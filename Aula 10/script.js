var termos = []
var length = 0
function adicionar(){
    var getNumero = window.document.getElementById('termo')//Também pode ser usado assim: document.querySelector('number#termo')
    var setNumero = getNumero.value
    var numero = Number(setNumero)
    var pass = termos.find(x => x == numero)
    /*Outra forma de determinar se um elemento está no array:
    a = [5, 3, 8, 4]
    if(a.indexOf(3) != -1){
        está
    }else{
        não está
    }*/
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
    if(size != 0){
        let sorted = termos.sort()
        let menor = sorted[0]
        let maior = sorted[size - 1]
        let soma = 0
        for(let x = 0; x <= size - 1; x++){
            soma += termos[x]
        }
        let media = soma / size
        let resultado = window.document.getElementById('resultado')
        resultado.innerHTML = `Quantidade de números: ${size},<br/>Menor número: ${menor},<br/>Maior número: ${maior},<br/>Soma de todos os números: ${soma},<br/>Média dos números: ${media}.`}
    if(size == 0){
        window.alert("Digite um número antes de usar o programa.")}
}