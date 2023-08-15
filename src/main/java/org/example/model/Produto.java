package org.example.model;

import java.time.LocalDate;

public class Produto extends ItemVendavel{

    private String nome;
    private String descricao;
    private Double precoVenda;
    private Double precoCompra;
    private LocalDate dataValidade;
    private LocalDate dataPrazo;
    private Status status;

    public  String getNome() {
        return nome;
    }

    public  void setNome(String nome) {
        nome = nome;
    }

    public  String getDescricao() {
        return descricao;
    }

    public  void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public  Double getPrecoVenda() {
        return precoVenda;
    }

    public Produto() {
    }

    public  void setPrecoVenda(Double precoVenda) {

        this.precoVenda = precoVenda;
        if(this.calcuclaMargemDeLucro() < 20.0){
            System.out.println("A margem de lucro está abaixo do minímo");
        }
    }

    public  Double getPrecoCompra() {
        return precoCompra;
    }

    public  void setPrecoCompra(Double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataPrazo() {
        return dataPrazo;
    }

    public void setDataPrazo(LocalDate dataPrazo) {
        this.dataPrazo = dataPrazo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Double calcuclaMargemDeLucro() {
        double lucro = precoVenda - precoCompra;
        double margemLucro = (lucro / precoVenda) * 100;
        return margemLucro;
    }


    public Produto(Integer id, String nome, String descricao, Double precoVenda, Double precoCompra, LocalDate dataValidade, LocalDate dataPrazo, Status status) {
        super.setDescri(descricao);
        this.nome = nome;
        this.descricao = descricao;
        this.precoVenda = precoVenda;
        this.precoCompra = precoCompra;
        this.dataValidade = dataValidade;
        this.dataPrazo = dataPrazo;
        this.status = status;
    }
}
