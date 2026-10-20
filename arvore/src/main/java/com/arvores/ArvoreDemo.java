package com.arvores;

public class ArvoreDemo extends ArvoreBase {

    public void demonstrar() {
        NoArvore<String> empresa = new NoArvore("Empresa");
        denifirRaiz(empresa);

        NoArvore<String> financeiro = new NoArvore<String>("Financeiro");

        empresa.adicionarFilho(financeiro);
        
        NoArvore<String> contas = new NoArvore<String>("Contas");
        financeiro.adicionarFilho(contas);
    
        exibirResumo();

    }

    public static void main(String[] args) {
        new ArvoreDemo().exibirResumo();
    }
    
}