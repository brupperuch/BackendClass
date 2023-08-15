package org.example.model;

public class ItemVendavel extends EntityId{
    private String descri;
    private Double vUnitario;

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

    public ItemVendavel(String descri, Double vUnitario) {
        this.descri = descri;
        this.vUnitario = vUnitario;
    }
}
