package Desafio

open class Professor(var nome: String, var sobrenome: String, var tempoDeCasa: Int, var codigoDoProfessor: Int) {
    companion object {
        var codigoDoProfessorCriado = mutableListOf<Int>()
    }

    init {
        // validação da ID do professor
        if (codigoDoProfessorCriado.contains(codigoDoProfessor)) {
            println("$nome $sobrenome foi cadastrado com ID de professor:$codigoDoProfessor já utilizado ! ")
            println("__________________________________")
        } else {
            codigoDoProfessorCriado.add(codigoDoProfessor)
            println("Professor $nome $sobrenome cadastrado com sucesso!!")
        }
    }
}