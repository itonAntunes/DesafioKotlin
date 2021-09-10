package Desafio

import java.util.*


class DigitalHouseManager {
    val listaDeAlunos: MutableList<Aluno> = mutableListOf()
    val listaDeProfessores: MutableList<Professor> = mutableListOf()
    val listaDeCursos: MutableList<Curso> = mutableListOf()
    val listaDeMatriculas: MutableList<Matricula> = mutableListOf()

    fun registrarCurso(nome: String, codigoCurso: Int, qtdMaximaAlunos: Int) {
        val novoCurso = Curso(nome, codigoCurso, qtdMaximaAlunos)
        if (listaDeCursos.contains(novoCurso)) {
            println("curso $nome já está cadastrado")
        } else {
            listaDeCursos.add(novoCurso)
            println("Curso $nome cadastrado com Sucesso !")
            println("Cursos registrados: ${listaDeCursos.size}")
        }
    }


    fun excluirCurso(codigoCurso: Int) {
        if (listaDeCursos.isNotEmpty()) {
            for (indiceCurso in listaDeCursos) {
                if (codigoCurso == indiceCurso.codigoCurso) {
                    listaDeCursos.remove(indiceCurso)
                    println("Curso ID: $codigoCurso removido com sucesso ! ")
                    break
                } else {
                    println("Curso com ID: $codigoCurso não foi encontrado !")
                    break
                }

            }
        } else {
            println("lista vazia")
        }
    }


    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) {
        val novoProfessorAdjunto = ProfessorAdjunto(nome, sobrenome, codigoProfessor, quantidadeDeHoras)
        if (listaDeProfessores.contains(novoProfessorAdjunto)) {
            println("Professor Adjunto: $nome não pode ser Adicionado com o ID: $codigoProfessor")
        } else {
            listaDeProfessores.add(novoProfessorAdjunto)
            println("Novo professor adicionado: $nome, ID:$codigoProfessor")
        }
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {
        val novoProfessorTitular = ProfessorTitular(nome, sobrenome, codigoProfessor, especialidade)
        if (listaDeProfessores.contains(novoProfessorTitular)) {
            println("Professor Adjunto: $nome não pode ser Adicionado com o ID: $codigoProfessor")
        } else {
            listaDeProfessores.add(novoProfessorTitular)
            println("Novo professor adicionado: $nome, ID:$codigoProfessor")
        }

    }

    fun excluirProfessor(codigoProfessor: Int) {
        if (listaDeProfessores.isNotEmpty()) {
            for (indiceProfessor in listaDeProfessores) {
                if (codigoProfessor == indiceProfessor.codigoDoProfessor) {
                    listaDeProfessores.remove(indiceProfessor)
                    println("Professor ID: $codigoProfessor  Removido com Sucesso ! ")
                    break
                } else {
                    println("Professor com ID: $codigoProfessor não foi encontrado !")
                    break
                }
            }
        } else {
            println("Lista de Professores vazia ! ")
        }
    }


    fun registrarAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        val novoAluno = Aluno(nome, sobrenome, codigoAluno)
        if (listaDeAlunos.contains(novoAluno)) {
            println("Codigo ID: $codigoAluno já possui um Cadastrado !")
        } else {
            listaDeAlunos.add(novoAluno)
            println("# Novo Aluno Cadastrado: $nome ID:$codigoAluno !")
            println("* Quantidade de Alunos Registrados: ${listaDeAlunos.size}")
            println(" ")
        }
    }
    // NOTA : não tem a função de excluir aluno da lista rs

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        //var novoAlunoMatriculando = Aluno("","",0)

        // var novoCursoMatriculando = Curso("",0,0)

        for (aluno in listaDeAlunos) {
            if (aluno.codigoDoAluno == codigoAluno) {
                println("aluno ID: $codigoAluno se matriculando ! ")
                var novoAlunoMatriculando = Aluno(aluno.nome, aluno.sobrenome, aluno.codigoDoAluno)
                for (Curso in listaDeCursos) {
                    if (Curso.codigoCurso == codigoCurso) {
                        println("Curso ID: $codigoCurso sendo matriculado !")
                        var novoCursoMatriculando = Curso(Curso.nome, Curso.codigoCurso, Curso.qtdMaximaAlunos)
                        if (Curso.qtdMaximaAlunos > Curso.listaAlunosMatriculados.size) {
                            listaDeMatriculas.add(Matricula(novoAlunoMatriculando, novoCursoMatriculando, Date()))
                            println("Matricula realizada com sucesso: ${novoAlunoMatriculando.nome} ID:${novoCursoMatriculando.codigoCurso} ${Date()}")
                            println(" ")
                        } else {
                            println("Não há vagas")
                            println(" ")
                        } // fim IF validação de vaga
                        break
                    }
                }
                break
            }
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        var curso = Curso(
            "", 0, 0,
            professorTitular = ProfessorTitular("", "", 0, ""),
            professorAdjunto = ProfessorAdjunto("", "", 0, 0)
        )

        for (indiceProfessoresTit in listaDeProfessores) {
            if (indiceProfessoresTit.codigoDoProfessor == codigoProfessorTitular) {
                //println("professor ${indiceProfessoresTit.nome} sendo alocado")
                for (indiceProfessoresAdj in listaDeProfessores) {
                    if (indiceProfessoresAdj.codigoDoProfessor == codigoProfessorAdjunto) {
                        //println("professor adjunto ${indiceProfessoresAdj.nome} sendo alocado ")
                        for (indiceCurso in listaDeCursos) {
                            if (indiceCurso.codigoCurso == codigoCurso) {
                                println("Professor ${indiceProfessoresAdj.nome} e ${indiceProfessoresTit.nome} sendo Alocado ao Curso: ${indiceCurso.nome}")
                            }
                        }
                    }
                }
            }

        }
    }

    fun consultarAlunoMatriculado(codigoAluno: Int) {
        for (matricula in listaDeMatriculas) {
            if (matricula.aluno.codigoDoAluno == codigoAluno) {
                println(matricula.curso.nome)
            }


        }
    }
}

