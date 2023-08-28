package org.example.model;

public class ItemLocacao extends EntityId{
    private Produto produto;
    private Double vUnitario;
    private Double quantidade;
    private Double desconto;

    public ItemLocacao(Produto produto, Double vUnitario, Double quantidade, Double desconto) {
        this.produto = produto;
        this.vUnitario = vUnitario;
        this.quantidade = quantidade;
        this.desconto = desconto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getvUnitario() {
        return vUnitario;
    }

    public void setvUnitario(Double vUnitario) {
        this.vUnitario = vUnitario;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
}
