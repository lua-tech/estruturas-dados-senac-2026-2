package com.example;

public class Main {
    public static void main(String[] args) {
        
        AnaliseComplexidade analise = new AnaliseComplexidade(); 

        int vetor[] = new int[] {80, 70, 30};
        analise.tempoConstante(vetor);

        analise.tempoLogaritmico(analise.getN());

        analise.tempoLinear(analise.getN());

        analise.tempoQuadratico(analise.getN());
    }
}