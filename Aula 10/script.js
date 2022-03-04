var termos = []
function adicionar(){
    var getNumero = window.document.getElementById('termo')
    var setNumero = getNumero.value
    var numero = Number(setNumero)
    var pass = termos.find(x => x == numero)
    var mensagem = window.document.getElementById('list-num')
    if(numero >= 1 && numero <= 100 && pass != numero){
        termos.push(numero)
        var lista = document.createElement('option')
        lista.text = `Número ${numero} adicionado.`
        mensagem.appendChild(lista)
    }
    else{window.alert("Número inválido ou já adicionado.")}
    }