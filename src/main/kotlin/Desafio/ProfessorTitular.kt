package Desafio

class ProfessorTitular(
    nome: String,
    sobrenome: String,
    tempoDeCasa: Int,
    codigoProfessor: Int,
    var especialidade: String
) : Professor(nome, sobrenome, tempoDeCasa, codigoProfessor) {
    init {
        println("$nome professor Titular de: $especialidade ")
        println(" ")
    }
}