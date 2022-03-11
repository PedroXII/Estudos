//Programação Orientada ao Objeto
var personagem = {nome: 'Luke', sexo: 'Masculino', classe: 'Jedi', level: 50, levelup(up = 0){
    if(up > this.level){
        return 'Subiu de level.'
    }else{
        return 'Não subiu de level.'
    }
}}
console.log(personagem)
console.log(personagem.levelup(54))