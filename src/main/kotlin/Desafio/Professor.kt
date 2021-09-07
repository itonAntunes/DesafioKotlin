package Desafio

class Professor(nome: String, sobrenome: String, TempoDeCasa: Int, codigoDoProfessor: Int) {
    companion object{
        var codigoDoProfessorCriado = mutableListOf<Int>()
    }

    init {
        if(codigoDoProfessorCriado.contains(codigoDoProfessor)){
            println("O professor $nome $sobrenome foi cadastrado com ID:$codigoDoProfessor já utilizado")
            println("__________________________________")
        } else {
            codigoDoProfessorCriado.add(codigoDoProfessor)
            println("Professor $nome $sobrenome cadastrado com sucesso!!")
        }
    }
}