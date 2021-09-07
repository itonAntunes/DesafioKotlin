package Desafio

fun main() {
    // criação das variaveis utilizadas na classe Aluno
    var aluno1 = Aluno("Everton", "Antunes", 1)
    var aluno2 = Aluno("Everton", "Antunes", 2)
    var aluno3 = Aluno("Maria", "Oliveira", 3)
    var aluno4 = Aluno("João", "Cardoso", 4)

    // criação das variaveis utilizadas na classe Curso

    var curso1 = Curso("Mecânica", 1)
    var curso2 = Curso("Elétrica", 2)
    var curso3 = Curso("Hidráulica", 3)
    var curso4 = Curso("Costura", 4)

    // criação das variaveis utilizadas na Classe Professor

    var professor1 = ProfessorTitular("Roberto","Carlos",2,1,"Mecânica")
    var professor2 = ProfessorAdjunto("Ricardo","Muniz",1,2,20)
    var professor3 = ProfessorTitular("Marcia","Santos",2,3,"Costura")
    var professor4 = ProfessorTitular("Jorge","Pereira",10,4,"Elétrica")
}