const readline = require('readline');
const chalk = require('chalk');

function readText() {
    var rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    rl.question(chalk.red(' Ingresar la palabra que desea cifrar o descifrar: '), (answer) => {
        createAtbashText(answer.toString().toUpperCase())
        rl.close();
    });
}

function createAtbashText (text) {
    let n, x
    let separator = ""
    let textAtbash = []
    let arrayText = text.split(separator)

    arrayText.forEach(element => {
        n = parseInt(element.charCodeAt())
        x = ((65 - n) + 26) + 64

        textAtbash.push(String.fromCharCode(x))
    })
    arrayText = ""
    textAtbash.forEach(element => {
        arrayText += element
    })

    console.log(chalk.red('\n Arreglo de Atbash: \n'))
    console.log(" " + textAtbash)
    console.log(chalk.yellow("\n Texto terminado: " + arrayText))
}

function menu() {
    let banner = 
    `
    

          ::: ::::::::::: :::::::::      :::      ::::::::  :::    ::: 
       :+: :+:   :+:     :+:    :+:   :+: :+:   :+:    :+: :+:    :+:  
     +:+   +:+  +:+     +:+    +:+  +:+   +:+  +:+        +:+    +:+   
   +#++:++#++: +#+     +#++:++#+  +#++:++#++: +#++:++#++ +#++:++#++    
  +#+     +#+ +#+     +#+    +#+ +#+     +#+        +#+ +#+    +#+     
 #+#     #+# #+#     #+#    #+# #+#     #+# #+#    #+# #+#    #+#      
###     ### ###     #########  ###     ###  ########  ###    ###       
------------------- Cifrado por sustitución --------------------

A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
↨ ↨ ↨ ↨ ↨ ↨ ↨ ↨ ↨ ↨ ↨ ↨ ↨ ↨ ↨ ↨ ↨ ↨ ↨ ↨ ↨ ↨ ↨ ↨ ↨ ↨
Z Y X W V U T S R Q P O N M L K J I H G F E D C B A

    `

    console.log(banner)
    readText()
}

menu()