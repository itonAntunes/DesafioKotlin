package Desafio

import java.util.*

fun main() {

    var dataMatricula = Date()
    // alunos sendo cadastrados
    var aluno1 = Aluno("Everton", "Antunes", 1)
    var aluno2 = Aluno("Everton", "Antunes", 2)
    var aluno3 = Aluno("Maria", "Oliveira", 3)
    var aluno4 = Aluno("João", "Cardoso", 4)
    var aluno5 = Aluno("Jhon", "Snow", 5)

    // lista dos alunos matriculados nos cursos
    var listaAlunoMecanica = mutableListOf<Aluno>()
    listaAlunoMecanica.add(aluno1)
    listaAlunoMecanica.add(aluno2)
    listaAlunoMecanica.add(aluno3)
    listaAlunoMecanica.add(aluno4)


    // lista dos alunos matriculados nos cursos
    var listaAlunosEletrica = mutableListOf<Aluno>()
    listaAlunosEletrica.add(aluno1)
    listaAlunosEletrica.add(aluno2)
    listaAlunosEletrica.add(aluno3)
    listaAlunosEletrica.add(aluno4)


    // lista dos alunos matriculados nos cursos
    var listaAlunosHidraulica = mutableListOf<Aluno>()
    listaAlunosHidraulica.add(aluno1)
    listaAlunosHidraulica.add(aluno2)
    listaAlunosHidraulica.add(aluno3)
    listaAlunosHidraulica.add(aluno4)
    //listaAlunosHidraulica.add(aluno5)


    // professores sendo cadastrados
    var professorTitular1 = ProfessorTitular("Roberto", "Carlos", 2, 1, "Mecânica")
    var professorTitular2 = ProfessorTitular("Jorge", "Pereira", 10, 2, "Elétrica")
    var professorTitular3 = ProfessorTitular("Marcia", "Santos", 2, 3, "Hidráulica")


    // professores sendo cadastrados
    var professorAdjunto1 = ProfessorAdjunto("Ricardo", "Muniz", 1, 4, 30)
    var professorAdjunto2 = ProfessorAdjunto("Richard", "Munhoz", 1, 5, 20)
    var professorAdjunto3 = ProfessorAdjunto("Roberto", "Oliveira", 1, 6, 10)


    // criação dos cursos com professores adicionados e alunos matriculados
    var cursoMecanica1 = Curso("Mecânica", 1, professorTitular1, professorAdjunto1, 4, listaAlunoMecanica)
    var cursoEletrica1 = Curso("Elétrica", 2, professorTitular2, professorAdjunto2, 4, listaAlunosEletrica)
    var cursoHidraulica1 = Curso("Hidráulica", 3, professorTitular3, professorAdjunto3, 4, listaAlunosHidraulica)

    var matriculaMecanica1 = Matricula(aluno1,cursoMecanica1,dataMatricula)
    var matriculaEletrica1 = Matricula(aluno2,cursoEletrica1,dataMatricula)
    var matriculaHidraulica1 = Matricula(aluno3,cursoHidraulica1,dataMatricula)


}