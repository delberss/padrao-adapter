package org.example;

public class Filme {

    IClassificacao classificacao;
    ClassificacaoAdapter persistencia;

    public Filme() {
        classificacao = new ClassificacaoConceito();
        persistencia = new ClassificacaoAdapter(classificacao);
    }

    public void setClassificacao(String conceito) {
        classificacao.setClassificacao(conceito);
        persistencia.salvarClassificacao();
    }

    public String getClassificacao() {
        return persistencia.recuperarClassificacao();
    }

    public int getNota() {
        return persistencia.getNota();
    }
}