package Atividade01

import kotlin.math.sqrt

class Primo (val num: Int) {

    fun isPrimo(): Boolean {
            if (num <= 1) return false
            if (num == 2) return true
            if (num % 2 == 0) return false

            for (i in 3.. sqrt(num.toDouble()).toInt() step 2) {
                if (num % i == 0) return false
            }
            return true
        }
    }

fun main() {
    print("Informe um número: ")
    val num = readLine()?.toIntOrNull() ?: return println("Entrada inválida")
    val numero = Primo(num)

    if (numero.isPrimo()) {
        println("É primo")
    } else {
        println("Não é primo")
    }
}