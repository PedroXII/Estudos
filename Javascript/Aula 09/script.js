//Funções com parâmetros e retorno.
function parimpar(n){ //n é o parâmetro.
    if (n%2 == 0){
        return 'Par!'
    }else{
        return 'Impar!'
    }
}
var res = parimpar(4)
//O parâmetro deve ser armazenado em em variável para ser usado.
//4 será n e o resultado será o valor do return.
console.log(res)
//Também pode ser usado assim: console.log(parimpar(4))
//Em: "parimpar(n = 0)". 0 é um valor opcional se outro não for definido.
/*É possível passar o valor de uma função para uma variável.
Exemplo: 
x = dobrar(n){
    return n*2}
dobrar(15)
Então: x = 30*/

//Recursividade: é quando uma função chama a si própria.
//Exemplo:
function fatorial(x){
    if(x == 1){
        return 1
    }else{
        return x * fatorial(x - 1)
    }
}
console.log(fatorial(5))