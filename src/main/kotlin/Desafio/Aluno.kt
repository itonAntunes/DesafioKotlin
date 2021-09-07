package Desafio

// Criação da classe aluno
class Aluno(nome: String, sobrenome: String, codigoDoAluno: Int) {
    companion object {
        val codigoAlunoCriado = mutableListOf<Int>()
    }
    init {
        if (codigoAlunoCriado.contains(codigoDoAluno)) {
            println("Aluno: $nome $sobrenome com ID:${codigoDoAluno} já cadastrado !!")
            println("__________________________________")
        } else {
            codigoAlunoCriado.add(codigoDoAluno)
            println("Novo aluno $nome $sobrenome !!")
        }
        println("  ")
    }
}
