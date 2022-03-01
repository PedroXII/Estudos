//Variáveis simples: armazenam um valor. a = 1
//Variáveis compostas: armazenam vários valores. a = [0, 1, 2, 3]
//Em: a = [5, 7, 3, 4], a = array ou vetor, conteúdo: 5, 7, 3, 4, chave: 0, 1, 2, 3 , ..., elementos = 0 - 5, 1 - 7, 2 - 3, 3 - 4.
//Elementos são compostos por seu conteúdo e sua chave de identificação. 
//Adicionar valores: a[4] = 8 ou a.push(8)
//Saber o tamanho: a.length
//Para ordenar: a.sort()
//Lembrete: para usar um terminal = console.log(a)
/*Variação do for no JavaScript:
for(let pos in a){
    console.log(num[pos])
}*/
/*Buscando valores
Em a = [5, 8, 6, 9]
a.indexOf(5) == 0
a.indexOf(8) == 1
a.indexOf(10) == -1
*/
var a = [0, 1, 2, 3]
for(let pos in a){
    console.log(a[pos])
}