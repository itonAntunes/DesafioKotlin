package `Parte A`
// Criação da classe aluno
class Aluno (var nome:String, var sobrenome:String, var codigoDoAluno:Int) {
    override fun equals(other: Any?): Boolean {
        if (other === this){
            return true

        }
        if (other !is Aluno){
            return false

        }
        val comparador = other as Aluno?
        return  codigoDoAluno == comparador?.codigoDoAluno
    }



    init {
        println("Novo Aluno Cadastrado")
        println(" ${nome} ${sobrenome} ${codigoDoAluno}" )
        println(" ")


    }

}

fun main() {
    var aluno1 = Aluno("Everton", "Antunes", 1)
    var aluno2 = Aluno("Everton","Antunes",1)
    var aluno3 = Aluno("Maria","Oliveira",3)
    var aluno4 = Aluno("João","Cardoso",4)

    if (aluno1 == aluno2){
        println("Temos alunos cadastrados com o mesmo Codigo Identificador")
    } else {
        println("não temos alunos Duplicados, pode prosseguir")
    }

}