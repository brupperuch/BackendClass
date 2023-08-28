package org.example.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Compra extends EntityId implements OpFinanceira{

    private LocalDate dataCompra;
    private Fornecedor fornecedor;
    private String observacao;
    private List<ItemCompra> itens = new ArrayList<>();

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public List<ItemCompra> getItens() {
        return itens;
    }

    public void setItens(List<ItemCompra> itens) {
        this.itens = itens;
    }

    public void addItemCompra(ItemCompra itemcomprado){
        itens.add(itemcomprado);
    }


    @Override
    public LocalDate getDataOperacao() {
        return getDataCompra();
    }

    @Override
    public Double getValorTotalOperacao() {
        return this.getItens().stream()
                .mapToDouble(ItemCompra::getValorUnitario)
                .sum();
    }

    @Override
    public TipoOperacao getTipoOperacao() {
        return TipoOperacao.DEBITO;
    }
}
