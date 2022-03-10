var termos = []
var length = 0
function adicionar(){
    var getNumero = document.querySelector('input#termo')//É uma variação de se usar getElementById().
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
    getNumero.value = '' //Para apagar o número depois de clicar em 'adicionar'.
    getNumero.focus() //Equivale a clicar no elemento 'termo', no caso a área para digitar o número.
    }
function calcular(){
    let size = termos.length
    if(size != 0){
        let menor = termos[0]
        let maior = termos[0]
        for(let x = 0;x <= size; x++){
            if(termos[x] > maior){
                maior = termos[x]
            }
            if(termos[x] < menor){
                menor = termos[x]
            }
        }
        let soma = 0
        for(let x = 0; x <= size - 1; x++){
            soma += termos[x]
        }
        let media = soma / size
        /*Teste:
        Se você usar funções como: termos.sort() em um array com numeros acima de 9 o
        resultado pode ser: termos = [1, 12, 100, 2, 23, 25, 213, 3, 31, 5, 7].
        possível solução(o algoritmo provavelmente está errado, mas é só pra ter uma  ideia):
        
        String(termos[n]) é necessário estar em 'String' pois mesmo se digitar '001' o computador entende como: '1'
        obs: melhor usar o 'for' para converter todos de uma vez.
        size = Number(termos.length)
        for(let x = 0; x < size; x++){
            do{'0' + termos[x]}
            while(termos[x].length < 5)
        }
        após isso as variáveis deverão ficar asssim:
        00001
        00012
        00100
        00002
        Assim por diante...
        (Não uso algoritmos para a partir de agora por que entra em uma área que não conheço ou estou cansado para lembrar.)
        Deste modo para ordena-los corretamente só precisa identificar o número que deixa de mostrar zero antes.
        Exemplo:
        00100
          ^  na terceira casa.
        00012
           ^ na quarta casa.
        separa-los: tres-casas-decimais = [100, 213], quatro-casas-decimais = [23, 25]
        converte-los para 'Number'.
        usar sort em cada array, pois quando se tem a mesma quantidade de casas decimais eles são ordenados corretamente.
        então junta-los novamente no array original colocando cada array na posição certa(usar o nome dos array para isso é uma ideia).
        assim o array termos deverá ficar:
        termos = [1, 2, 3, 5, 7, 12, 23, 25, 31, 100, 213]

        É uma ideia pouco elaborada mas com certo potencial, já deve ter alguma biblioteca que faz isso mas tive a ideia e quis anotar.
        */
        let resultado = window.document.getElementById('resultado')
        resultado.innerHTML = `Quantidade de números: ${size},<br/>Menor número: ${menor},<br/>Maior número: ${maior},<br/>Soma de todos os números: ${soma},<br/>Média dos números: ${media}.`}
    if(size == 0){
        window.alert("Digite um número antes de usar o programa.")}
}