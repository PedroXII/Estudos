//Não há motivo tecnico para ter as palavras 'get' e 'set' nas variáveis.

try {
    function calcularcontador(){
        var mensagem = window.document.getElementById('resultado-contador')
        var getInicio = window.document.getElementById('inicio')
        var setInicio = getInicio.value
        var inicio = Number(setInicio)
        var getFim = window.document.getElementById('fim')
        var setFim = getFim.value
        var fim = Number(setFim)
        var getSequencia = window.document.getElementById('sequencia')
        var setSequencia = getSequencia.value
        var sequencia = Number(setSequencia)
        var resultado = ''
        var contador = 0
        if(setFim.length == 0 || setInicio.length == 0 || setSequencia.length == 0 || sequencia == 0){
            window.alert('Erro!');
        }else{
            if(inicio < fim){
                for(inicio; inicio <= fim; inicio = inicio + sequencia){
                    if(contador == 0){
                        resultado = `inicio \u{1F449} ${inicio}` //\u{1F449} só funciona entre crases ``.
                    }
                    if(contador != 0){
                        resultado = resultado + ' \u{1F449} ' + inicio
                    }
                    contador++
                    mensagem.innerHTML = `${resultado}`
                }
                if(inicio >= fim){
                    mensagem.innerHTML = `${resultado} \u{1F449} fim`
                }
            }
            if(inicio > fim){
                for(inicio; inicio >= fim; inicio = inicio - sequencia){
                    if(contador == 0){
                        resultado = `inicio \u{1F449} ${inicio}` //\u{1F449} só funciona entre crases ``.
                    }
                    if(contador != 0){
                        resultado = resultado + ' \u{1F449} ' + inicio
                    }
                    contador++
                    mensagem.innerHTML = `${resultado}`
                }
                if(inicio <= fim){
                    mensagem.innerHTML = `${resultado} \u{1F449} fim`
                }
            }
        }
    }
} catch (error) {
    window.alert('Erro!')
}
// var e let é a mesma coisa.
try {
    function calculartabuada(){
        let mensagem = window.document.getElementById('resultado-tabuada')
        let inicio = 1
        let getNumero = window.document.getElementById('numero')
        let setNumero = getNumero.value
        let numero = Number(setNumero)
        let getFinalTabuada = window.document.getElementById('final-tabuada')
        let setFinalTabuada = getFinalTabuada.value
        let finaltabuada = Number(setFinalTabuada)
        let tabuada = ''
        let resultado
        if(setNumero.length == 0 || setFinalTabuada.length == 0){
            window.alert('Erro!')
        }
        else{
            do{
                resultado = numero * inicio
                tabuada = `${tabuada}${numero} * ${inicio} = ${resultado}<br/>`
                mensagem.innerHTML = tabuada
                inicio++
            }
            while(inicio <= finaltabuada);
        }
    }
} catch (error) {
    window.alert('Erro!')
}