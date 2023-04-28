package Desafio_Lab.domain

import Desafio_Lab.exception.MyException

data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    @Throws(MyException::class)
    fun matricular(usuario: Usuario) {
        if (!inscritos.contains(usuario)) {
            inscritos.add(usuario)
            println("${usuario.nome} matriculado com sucesso!")
        } else {
            throw MyException("${usuario.nome} já esta matriculado!")
        }
    }

    fun exibirListaConteudo() {
        println("Lista de conteudo educacional da formação $nome")
        conteudos.forEach() { i ->
            println("${i.nome} - ${i.duracao}")
        }
    }

    fun exibirUsuarioCadastrado() {
        println("Lista de usuarios matriculados")
        inscritos.forEach() { i -> println("${i.nome} ") }
    }

    override fun toString(): String {
        return "Formacao(nome='$nome', nivel=$nivel, \n" +
                "conteudos=${conteudos}, \n" +
                "inscritos=$inscritos)"
    }

}
