const readline = require('readline');
const chalk = require('chalk');


function readText() {

    var rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    rl.question(' Ingresar la palabra que desea cifrar o descifrar: ', (respuesta) => {
        createCryptoText(respuesta.toString().toUpperCase())
        rl.close();
    });
}

function createCryptoText(text) {
    let separator = "", n
    let textCrypto = []
    let arrayText = text.split(separator)

    console.log(chalk.blue('\n Arreglo del original: \n'))
    console.log(arrayText)

    arrayText.forEach(element => {
        if(element.charCodeAt() < 78 && element.charCodeAt() >= 65) {
            n = parseInt(element.charCodeAt())
            textCrypto.push(String.fromCharCode(n + 13))
        } else if(element.charCodeAt() >= 65) {
            n = parseInt(element.charCodeAt())
            textCrypto.push(String.fromCharCode(n - 13))
        } else if(element.charCodeAt() == 32) {
            textCrypto.push("#")
        } else if(element == "#") {
            textCrypto.push(" ")
        }
    })

    console.log(chalk.red('\n Arreglo de crypto: \n'))
    console.log(" " + textCrypto)
    arrayText = " "
    textCrypto.forEach(element => {
        arrayText += element
    })

    console.log(chalk.yellow("\n Texto terminado: " + arrayText))
}

function menu() {
        let banner = 
    `
    

    ██████╗██████╗ ██╗   ██╗██████╗ ████████╗ ██████╗ 
   ██╔════╝██╔══██╗╚██╗ ██╔╝██╔══██╗╚══██╔══╝██╔═══██╗
   ██║     ██████╔╝ ╚████╔╝ ██████╔╝   ██║   ██║   ██║
   ██║     ██╔══██╗  ╚██╔╝  ██╔═══╝    ██║   ██║   ██║
   ╚██████╗██║  ██║   ██║   ██║        ██║   ╚██████╔╝
    ╚═════╝╚═╝  ╚═╝   ╚═╝   ╚═╝        ╚═╝    ╚═════╝ 
       -------- Cifrado por sustitución --------

       A B C D E F G H I J K L M
       ↨ ↨ ↨ ↨ ↨ ↨ ↨ ↨ ↨ ↨ ↨ ↨ ↨
       N O P Q R S T U V W X Y Z                                   
 
    `
        console.log(chalk.green(banner))
        readText()
}

menu()