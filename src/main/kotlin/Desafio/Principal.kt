package Desafio

class Principal(){


}
fun main() {
    val adm = DigitalHouseManager()

    adm.registrarProfessorTitular("Roberto","Alberto",1,"Kotlin")
    adm.registrarProfessorTitular("Norberto","Alberto",2,"Kotlin")

    adm.registrarProfessorAdjunto("Eduardo","Gomes",3,0)
    adm.registrarProfessorAdjunto("Jhon","Snow",4,0)

    adm.registrarAluno("Everton","Antunes",1)
    adm.registrarAluno("Anderson","Conceição",2)
    adm.registrarAluno("Bruno","Oliveira",3)

    adm.registrarCurso("Full Stack",20001,3)
    adm.registrarCurso("Android",20002,2)

    adm.alocarProfessores(20001,1,3)
    adm.alocarProfessores(20002,2,4)

    adm.matricularAluno(1,20001)
    adm.matricularAluno(2,20001)
    adm.matricularAluno(3,20001)

    adm.matricularAluno(1,20002)
    adm.matricularAluno(2,20002)

    adm.consultarAlunoMatriculado(1)




}