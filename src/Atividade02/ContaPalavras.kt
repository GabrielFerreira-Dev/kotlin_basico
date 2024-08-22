package Atividade02

class Verificador(val texto: String) {

    fun getQtdLetras(): Int {
        if (texto.isBlank()) return 0
        return texto.split("\\s+".toRegex()).size
    }
}


fun main() {
    print("Escreva: ")
    val palavras = readLine() ?: return println("Entrada inválida")
    val cont = Verificador(palavras)

    println("Número de letras no parágrafo: ${cont.getQtdLetras()}")
}