package Desafio_Lab.api

import Desafio_Lab.domain.ConteudoEducacional
import Desafio_Lab.domain.Formacao
import Desafio_Lab.domain.Nivel
import Desafio_Lab.domain.Usuario

fun main() {

    val usuario1 = Usuario(1, "Wilson")
    val usuario2 = Usuario(2, "Maria")

    val contEdu1 = ConteudoEducacional("Programação Oriantado a Objetos")
    val contEdu2 = ConteudoEducacional("Estrutura de repetição")
    val contEdu3 = ConteudoEducacional("Exception")

    val cursoJava = Formacao("Java", Nivel.INTERMEDIARIO, mutableListOf(contEdu1, contEdu2, contEdu3))
    cursoJava.matricular(usuario1)
    cursoJava.matricular(usuario2)

    println("------------------------------------------")
    cursoJava.exibirListaConteudo()

    println("------------------------------------------")
    cursoJava.exibirUsuarioCadastrado()

    println("------------------------------------------")
    println(cursoJava)

    println("------------------------------------------")
    //forçando exceção usuario já cadastrado
    cursoJava.matricular(usuario1)



}

