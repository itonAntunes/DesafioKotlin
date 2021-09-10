package Desafio

import java.util.*

class Curso(
    var nome: String,
    var codigoCurso: Int,
    var qtdMaximaAlunos: Int,

    var professorTitular: ProfessorTitular? = null,
    var professorAdjunto: ProfessorAdjunto? = null,

){



    var listaAlunosMatriculados: MutableList<Aluno> = mutableListOf()

 override fun equals(other: Any?): Boolean = (other is Curso && this.codigoCurso == other.codigoCurso)

    init {
        if (qtdMaximaAlunos <= 0) {
            qtdMaximaAlunos = 4
        }

    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if (listaAlunosMatriculados.size < qtdMaximaAlunos) {
            listaAlunosMatriculados.add(umAluno)
            println("Aluno adicionado com Sucesso a $nome ! ")
            println("Total de Alunos matriculados no curso ${listaAlunosMatriculados.size}")
            return true
        } else {
            println("Quantidade Maxima Atingida ! ")
            return false
        }
    }

    fun excluirAluno(umAluno: Aluno) {
        if (listaAlunosMatriculados.contains(umAluno)) {
            listaAlunosMatriculados.remove(umAluno)
            println("Aluno removido com Sucesso ! ")
        } else {
            println("Nao foi possivel remover o ${umAluno.nome}")
        }
    }
}