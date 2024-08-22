fun main() {
    val alunos = Array(10) { "" }

    for (i in alunos.indices) {
        println("Cadastro do ${i + 1}º aluno:")
        print("Nome: ")
        val nome = readLine() ?: ""
        alunos[i] = nome
    }

    alunos.sort()

    println("\nAlunos cadastrados:")
    for (aluno in alunos) {
        println(aluno)
    }
}
