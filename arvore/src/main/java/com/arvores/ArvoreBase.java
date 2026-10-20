
package com.arvores;

public abstract class ArvoreBase<T> {

    private NoArvore<T> raiz;

    protected void criarRaiz(T valor) {
        if (raiz != null) {
            throw new IllegalStateException("A raiz já foi criada.");
        }
        raiz = new NoArvore<>(valor);
    }

    protected void denifirRaiz(NoArvore<T> novaRaiz) {
        raiz = novaRaiz;
    }

    protected NoArvore<T> getRaiz() {
        return raiz;
    }

    protected NoArvore<T> addFilho(NoArvore<T> pai, T valor) {
        if (pai == null) {
            throw new IllegalStateException("O nó pai não pode ser nulo.");
        }
        NoArvore<T> novoFilho = new NoArvore<>(valor);
        pai.adicionarFilho(novoFilho);
        return novoFilho;
    }

    protected boolean eFolha(NoArvore<T> no) {
        if (no == null) {
            return false;
        }
        return no.efolha();
    }

    protected int contarNos() {
        return contarNos(raiz);
    }

    protected int contarNos(NoArvore<T> no) {
        if (no == null) {
            return 0;
        }
        int total = 1;
        for (NoArvore<T> filho : no.getFilhos()) {
            total += contarNos(filho);
        }
        return total;
    }

    protected int contarFolhas() {
        return contarFolhas(raiz);
    }

    protected int contarFolhas(NoArvore<T> no) {
        if (no == null) {
            return 0;
        }
        if (no.efolha()) {
            return 1;
        }
        int totalFolhas = 0;
        for (NoArvore<T> filho : no.getFilhos()) {
            totalFolhas += contarFolhas(filho);
        }
        return totalFolhas;
    }

    protected int calcularAltura() {
        return calcularAltura(raiz);
    }

    protected int calcularAltura(NoArvore<T> no) {
        if (no == null) {
            return -1;
        }
        if (no.efolha()) {
            return 0;
        }
        int maiorAlturaEntreFilhos = -1;
        for (NoArvore<T> filho : no.getFilhos()) {
            int alturaFilho = calcularAltura(filho);
            if (alturaFilho > maiorAlturaEntreFilhos) {
                maiorAlturaEntreFilhos = alturaFilho;
            }
        }
        return 1 + maiorAlturaEntreFilhos;
    }

    public void exibirResumo() {
        System.out.println("Raiz: " + (raiz == null ? "sem raiz" : raiz.getValor()));
        System.out.println("Quantidade total de nós: " + contarNos());
        System.out.println("Quantidade total de folhas: " + contarFolhas());
        System.out.println("Altura da árvore: " + calcularAltura());
    }

    public abstract void demonstrar();

    public void executarDemonstracao() {
        demonstrar();
    }

}