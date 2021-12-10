try {
    function calcular(){
        var mensagem = window.document.getElementById('resultado')
        var getInicio = window.document.getElementById('inicio')
        var setInicio = getInicio.value
        var inicio = Number(setInicio)
        var getFim = window.document.getElementById('fim')
        var setFim = getFim.value
        var fim = Number(setFim)
        var getSequencia = window.document.getElementById('sequencia')
        var setSequencia = getSequencia.value
        var sequencia = Number(setSequencia)
        for(inicio; inicio <= fim; inicio = inicio + sequencia){
            mensagem.innerHTML = ``
        }
    }
} catch (error) {
    window.alert('Erro!')
}