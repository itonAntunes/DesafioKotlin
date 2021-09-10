package Desafio

open class Professor(var nome: String, var sobrenome: String, var codigoDoProfessor: Int) {
    var tempoDeCasa: Int = 0

    override fun equals(other: Any?) : Boolean = (other is Professor && this.codigoDoProfessor == other.codigoDoProfessor)

}