package Atividade03

class Aluno(val nome: String, val notas: Array<Double>) {

    fun calcularMedia(): Double {
        if (notas.isEmpty()) return 0.0
        return notas.sum() / notas.size
    }

    fun isAprovado(): Boolean {
        return calcularMedia() >= 7.0
    }
}

fun main() {
    val alunos = mutableListOf<Aluno>()
    while (alunos.size < 5) {
        println("Cadastro do ${alunos.size + 1}º aluno :")
        print("Nome: ")
        val nome = readLine() ?: break

        val notas = mutableListOf<Double>()

        while (true) {
            print("Digite a nota ou aperte enter para sair: ")
            val nota = readLine()?.toDoubleOrNull() ?: break
            if (nota in 0.0..10.0) {
                notas.add(nota)
            } else {
                println("Nota inválida, deve estar entre 0 e 10. Tente novamente.")
            }

        }
        alunos.add(Aluno(nome, notas.toTypedArray()))
    }

    println("\nResultados:")
    alunos.forEach { aluno ->
        val media = aluno.calcularMedia()
        val status = if (aluno.isAprovado()) "Aprovado" else "Reprovado"
        println("Nome: ${aluno.nome}, sua média foi ${media}. Está ${status}")

    }
}
