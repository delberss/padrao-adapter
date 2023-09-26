package org.example;

public class ClassificacaoConceito implements IClassificacao {

    private String conceito;

    @Override
    public String getClassificacao() {
        return this.conceito;
    }

    @Override
    public void setClassificacao(String conceito) {
        this.conceito = conceito;
    }
}