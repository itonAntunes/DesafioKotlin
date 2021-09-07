package Desafio

class Curso(nome: String, codigoCurso: Int) {
    companion object {
        val codigoCursoCriado = mutableListOf<Int>()
    }

    init {
        if (codigoCursoCriado.contains(codigoCurso)) {
            println("Curso de $nome cadastrado com ID:$codigoCurso já utilizado!")
            println("__________________________________")
        } else {
            codigoCursoCriado.add(codigoCurso)
            println("Novo curso de: $nome Cadastrado")
        }
        println("  ")
    }
}