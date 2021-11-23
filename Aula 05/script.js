var imagem = window.document.getElementById("imagem")
var mensagem = window.document.getElementById("mensagem")
var data = new Date()
var hora = data.getHours()
if(hora >= 5 && hora <= 13){
    mensagem.innerHTML = `Bom dia!<br/>São ${hora} horas.`
    imagem.src = 'dia.jpg'
    document.body.style.background = 'rgb(36, 255, 200)'
}
if(hora > 13 && hora < 18){
    mensagem.innerHTML = `Boa tarde!<br/>São ${hora} horas.`
    imagem.src = 'tarde.png'
    document.body.style.background = 'rgb(255, 178, 36)'

}
if(hora >= 18 && hora <= 24){
    mensagem.innerHTML = `Boa noite!<br/>São ${hora} horas.`
    imagem.src = 'noite.jpg'
    document.body.style.background = 'rgb(0, 0, 50)'
    document.body.style.color = 'white'
    mensagem.style.color = 'black'
}
if(hora >= 0 && hora < 5){
    mensagem.innerHTML = `É madrugada...<br/>São ${hora} horas.`
    imagem.src = 'madrugada.jpg'
    document.body.style.background = 'rgb(0, 0, 20)'
    document.body.style.color = 'white'
    mensagem.style.color = 'black'
    if(hora == 0){
        mensagem.innerHTML = `É madrugada...<br/>É ${hora}, meia-noite.`
    }
    if(hora == 1){
        mensagem.innerHTML = `É madrugada...<br/>É ${hora} hora.`
    }
    else{
        mensagem.innerHTML = `É madrugada...<br/>São ${hora} horas.`
    }
}