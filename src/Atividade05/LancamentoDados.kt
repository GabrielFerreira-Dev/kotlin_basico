package Atividade05

import kotlin.random.Random

fun main() {
    print("Quantas vezes você deseja lançar os dados? ")
    val numLancamentos = readLine()?.toIntOrNull() ?: 0

    if (numLancamentos <= 0) {
        println("Número de lançamentos deve ser um numero positivo.")
        return
    }

    for (i in 1..numLancamentos) {
        val dado1 = Random.nextInt(1, 7)
        val dado2 = Random.nextInt(1, 7)
        val soma = dado1 + dado2
        println("Lançamento $i: Dado 1 = $dado1, Dado 2 = $dado2, Soma = $soma")
    }
}
