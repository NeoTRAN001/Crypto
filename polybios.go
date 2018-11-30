package main

import (
	"fmt"
	"strings"
	"strconv"
	"bufio"
	"os"
	"os/exec"
	"github.com/fatih/color"
)
const X, Y int = 7, 10

var option, text, code string = "" , "", ""

var POLYBIOS = [X][Y] string {
	{"?", "é", "ó", "í", "a", "b", "c", "d", "e", "f"},
	{"g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o"},
	{"p", "q", "r", "s", "t", "u", "v", "w", "x", "y"},
	{"z", "0", "1", "2", "3", "4", "5", "6", "7", "8"},
	{"9", " ", "A", "B", "C", "D", "E", "F", "G", "H"},
	{"I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q"},
	{"R", "S","T",  "U", "V", "W", "X", "Y", "Z", ":"}}


func menu() {
	banner := 
	`	
	 _______  _______  ___      __   __  _______  ___   _______  _______ 
	|       ||       ||   |    |  | |  ||  _    ||   | |       ||       |
	|    _  ||   _   ||   |    |  |_|  || |_|   ||   | |   _   ||  _____|
	|   |_| ||  | |  ||   |    |       ||       ||   | |  | |  || |_____ 
	|    ___||  |_|  ||   |___ |_     _||  _   | |   | |  |_|  ||_____  |
	|   |    |       ||       |  |   |  | |_|   ||   | |       | _____| |
	|___|    |_______||_______|  |___|  |_______||___| |_______||_______|

               0    1    2    3    4    5    6    7    8    9
           0 {"?", "é", "ó", "í", "a", "b", "c", "d", "e", "f"},
           1 {"g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o"},
           2 {"p", "q", "r", "s", "t", "u", "v", "w", "x", "y"},
           3 {"z", "0", "1", "2", "3", "4", "5", "6", "7", "8"},
           4 {"9", " ", "A", "B", "C", "D", "E", "F", "G", "H"},
           5 {"I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q"},
           6 {"R", "S","T",  "U", "V", "W", "X", "Y", "Z", ":"}

	`

	cmd := exec.Command("cmd", "/c", "cls") 
    cmd.Stdout = os.Stdout 
	cmd.Run() 
	
	if code != "" {
		color.Yellow("\nÚltimo texto: %s", code)
		code = ""
	}

	color.Cyan(banner)
	fmt.Print("Cifrar [c]  -  Descifrar [d]  -  Salir [x]: "); fmt.Scanln(&option)
	fmt.Print("\nIngresar su palabra : ");
	
	r := bufio.NewReader(os.Stdin)
	i, _ := r.ReadString('\n')
	o := strings.TrimRight(i, "\r\n")
	text = o
}

func createCode() {
	t := strings.Split(text, "")

	for i := 0; i < len(t); i++ {
		for x := 0; x < X; x++ {
			for y := 0; y < Y; y++ {
				if(t[i] == POLYBIOS[x][y]) {
					code +=  (strconv.Itoa(x) + strconv.Itoa(y))
				}
			}
		}
	}
	color.Green("\nTexto original: %s", t)
	color.Yellow("\nTexto cifrado: %s", code)
}

func killCode() {
	t := strings.Split(text,"")
	i := 0
	for i < len(t) {
		x, err := strconv.Atoi(t[i])
		y, err := strconv.Atoi(t[i+1])

		if err != nil {
			break
		}
		
		code += POLYBIOS[x][y]
		i += 2
	}

	color.Green("\nTexto original: %s", t)
	color.Yellow("\nTexto cifrado: %s", code)
}

func main() {
	for true {
		menu()
		if(option == "x" || option == "X") {
			break
		} else if (option == "c") {
			createCode()
		} else if (option == "d") {
			killCode()
		} else {
			fmt.Println("Opción no válida")
		}

		fmt.Scanln()
	}
}