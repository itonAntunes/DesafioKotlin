package `Parte A`

import javax.print.attribute.standard.MediaSize

// Criação da classe aluno
class Aluno(var nome: String, var sobrenome: String, var codigoDoAluno: Int) {
    companion object {
        val codigoAlunoCriado = mutableListOf<Int>()
    }
    init {
        if (codigoAlunoCriado.contains(codigoDoAluno)) {
            println("Aluno: $nome $sobrenome com ID ${codigoDoAluno} já cadastrado !!")
        } else {
            codigoAlunoCriado.add(codigoDoAluno)
            println("Novo aluno $nome $sobrenome !!")
        }
        println(" ")
    }
}
