package org.example;

public class ClassificacaoAdapter extends ClassificacaoNota {

    private IClassificacao classificacaoConceito;

    public ClassificacaoAdapter(IClassificacao classificacaoConceito) {
        this.classificacaoConceito = classificacaoConceito;
    }

    public String recuperarClassificacao() {
        if (this.getNota() == 5)
            classificacaoConceito.setClassificacao("Excelente");
         else
             if (this.getNota() == 4)
                classificacaoConceito.setClassificacao("Muito Bom");
             else
                if (this.getNota() == 3)
                    classificacaoConceito.setClassificacao("Bom");
                else
                    if (this.getNota() == 2)
                         classificacaoConceito.setClassificacao("Regular");
                    else
                        classificacaoConceito.setClassificacao("Ruim");
        return classificacaoConceito.getClassificacao();
    }

    public void salvarClassificacao() {
        if (classificacaoConceito.getClassificacao().equals("Excelente"))
            this.setNota(5);
        else
            if (classificacaoConceito.getClassificacao().equals("Muito Bom"))
                this.setNota(4);
            else
                if (classificacaoConceito.getClassificacao().equals("Bom"))
                    this.setNota(3);
                else
                    if (classificacaoConceito.getClassificacao().equals("Regular"))
                        this.setNota(2);
                    else
                        this.setNota(1);
    }
}
