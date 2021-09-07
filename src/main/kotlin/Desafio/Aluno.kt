package Desafio

// Criação da classe aluno
class Aluno(var  nome: String, var sobrenome: String, var codigoDoAluno: Int) {
    companion object {
        val codigoAlunoCriado = mutableListOf<Int>()
    }

    // validação se mais de um aluno possui o mesmo identificador
    init {
        if (codigoAlunoCriado.contains(codigoDoAluno)) {
            println("Aluno: $nome $sobrenome com ID:${codigoDoAluno} já utilizado !!")
            println("__________________________________")
        } else {
            codigoAlunoCriado.add(codigoDoAluno)
            println("Novo aluno $nome $sobrenome !!")
        }
        println("  ")
    }
}
