package br.com.alura.technews.repository.Resource

import br.com.alura.technews.model.Noticia

class Resource<T>(
    val dado : T,
    val erro: String? = null
    )

fun <T> criaResourceDeFalha(
    resourceAtual: Resource<T>?,
    it: String?
): Resource<T?> {
    if (resourceAtual != null) {
        return  Resource(dado = resourceAtual.dado, erro = it)
    }
    return  Resource(dado = null, erro = it)

}