package Desafio

import java.util.*

class Curso(
    var nome: String,
    var codigoCurso: Int,
    professorTitular: ProfessorTitular,
    professorAdjunto: ProfessorAdjunto,
    var qtdMaximaAlunos: Int,
    var listaAlunosMatriculados: MutableList<Aluno>
) {
    companion object {
        val codigoCursoCriado = mutableListOf<Int>()
    }

    init {
        // validação da ID do curso
        if (codigoCursoCriado.contains(codigoCurso)) {
            println("Curso de $nome cadastrado com ID:$codigoCurso já utilizado!")
            println("__________________________________")
        } else {
            codigoCursoCriado.add(codigoCurso)
            println("Novo curso de: $nome Cadastrado")
        }
        if (qtdMaximaAlunos >= listaAlunosMatriculados.size) {
            println("${listaAlunosMatriculados.size} Alunos Matriculados")
            println(" ")
        } else {
            println("Curso de $nome cheio, nao pode ser adicionado mais alunos.")
        }
    }
}