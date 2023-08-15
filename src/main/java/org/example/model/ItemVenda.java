package org.example.model;

public class ItemVenda {

    private Produto produto;
    private Double valorUnitario;
    private Double quantidade;
    private Double desconto;

    @Override
    public String toString() {
        return "ItemVenda{" +
                "produto=" + produto +
                ", valorUnitario=" + valorUnitario +
                ", quantidade=" + quantidade +
                ", desconto=" + desconto +
                '}';
    }
    public ItemVenda(Produto produto, Double valorUnitario, Double quantidade, Double desconto) {
        this.produto = produto;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
        this.desconto = desconto;
    }
}
