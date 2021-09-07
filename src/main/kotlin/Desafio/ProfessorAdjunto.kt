package Desafio

class ProfessorAdjunto(
    nome: String,
    sobrenome: String,
    tempoDeCasa: Int,
    codigoProfessor: Int,
    horasMonitoria: Int
) : Professor(nome, sobrenome, tempoDeCasa, codigoProfessor) {
    init {
        println("$nome professor Adjunto")
        println(" ")
    }
}