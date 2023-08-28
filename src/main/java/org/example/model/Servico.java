package org.example.model;

public class Servico extends ItemVendavel{

    private String descri;
    private Double qtdHoras;
    private Double Valor;

    public Double getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(Double qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public Double getValor() {
        return Valor;
    }

    public void setValor(Double valor) {
        Valor = valor;
    }

    @Override
    public Boolean getEstocavel() {
        return false;
    }

    public Servico(String descri, Double qtdHoras, Double valor) {
        super.setDescri(descri);
        this.qtdHoras = qtdHoras;
        super.setvUnitario(valor);
    }
}
