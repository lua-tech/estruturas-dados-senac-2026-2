
package com.arvores;

import java.util.ArrayList;
import java.util.List;

public class NoArvore<T> {

    private T valor;

    private NoArvore<T> pai;

    private List<NoArvore<T>> filhos;

    public NoArvore(T valor) {
        this.valor = valor;

        this.filhos = new ArrayList<>();
    }

    public T getValor() {
        return valor;
    }

    public NoArvore<T> getPai() {
        return pai;
    }

    public List<NoArvore<T>> getFilhos() {
        return filhos;
    }

    public void adicionarFilho(NoArvore<T> filho) {
        filho.pai = this;
        filhos.add(filho);
    }

    public boolean efolha() {
        return filhos.isEmpty();
    }

}