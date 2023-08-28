package org.example.model;

public class ItemVendavel extends EntityId{
    private String descri;
    private Double vUnitario;

    private Boolean estocavel;
    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public Double getvUnitario() {
        return vUnitario;
    }

    public void setvUnitario(Double vUnitario) {
        this.vUnitario = vUnitario;
    }

    public Boolean getEstocavel() {
        return estocavel;
    }

    public void setEstocavel(Boolean estocavel) {
        this.estocavel = estocavel;
    }

    @Override
    public String toString(){
        return "Descrição: "+ descri + "Valor Unitário: " + vUnitario;
    }

}
