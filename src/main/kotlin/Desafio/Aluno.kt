package Desafio

// Criação da classe aluno
class Aluno(var nome: String, var sobrenome: String, var codigoDoAluno: Int) {

    override fun equals(other: Any?) : Boolean = (other is Aluno && this.codigoDoAluno == other.codigoDoAluno)

}
