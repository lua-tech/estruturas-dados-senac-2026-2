package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa um no de uma arvore generica.
 *
 * Neste primeiro contato, um no guarda:
 * - um nome;
 * - uma lista de filhos.
 *
 * Essa ideia e suficiente para estudar raiz, no, folha, altura e profundidade.
 */

public class No {
    // Nome do no, usado para facilitar a leitura do exemplo.
    private String nome;


    // Lista com os filhos do no atual.
    private List<No> filhos;


    /**
     * Cria um no com o nome informado.
     *
     * @param nome texto que identifica o no
     */
    public No(String nome) {
        // Guarda o nome recebido.
        this.nome = nome;


        // Comeca com lista vazia, pois no inicio o no ainda nao tem filhos.
        this.filhos = new ArrayList<>();
    }


    /**
     * Adiciona um filho ao no atual.
     *
     * @param filho no que sera ligado como filho
     */
    public void adicionarFilho(No filho) {
        // Coloca o novo filho na lista de filhos deste no.
        filhos.add(filho);
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public List<No> getFilhos() {
        return filhos;
    }


    public void setFilhos(List<No> filhos) {
        this.filhos = filhos;
    }
}