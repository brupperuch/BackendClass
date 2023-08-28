package org.example.model;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Balanco extends EntityId {

    private LocalDate dataBalanco;
    private String responsavel;

    private List<OpFinanceira> operacoes = new ArrayList<>();

    public void addOperacoes (OpFinanceira operacao){
        this.operacoes.add(operacao);
    }

    public void delOperacoes (OpFinanceira operacao){
        this.operacoes.remove(operacao);
    }

    public void imprimirBalanco(){
        System.out.println("_________________________________________________");
        System.out.println("Balanco numero: " + this.getId());
        System.out.println("Data: "+ this.getDataBalanco());
        System.out.println("Responsavel: "+ this.getResponsavel());
        System.out.println("_______________________________");
        System.out.println("Itens: ");
        for(OpFinanceira op: this.getOperacoes()){
            System.out.printf("__________");
            System.out.printf("Data Operacação: "+ op.getDataOperacao()+
                    "  Tipo Operação: "+ op.getTipoOperacao()+
                    "  Valor Operação: "+ op.getValorTotalOperacao());

            System.out.println("_______________");
        }
        System.out.println("");
        System.out.println("_________________________________________________");
    }

    public LocalDate getDataBalanco() {
        return dataBalanco;
    }

    public void setDataBalanco(LocalDate dataBalanco) {
        this.dataBalanco = dataBalanco;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public List<OpFinanceira> getOperacoes() {
        return operacoes;
    }

    public void setOperacoes(List<OpFinanceira> operacoes) {
        this.operacoes = operacoes;
    }

    public Double getValorTotal(TipoOperacao tipo){
        return this.getOperacoes().stream().filter(op -> op.getTipoOperacao().equals(tipo))
                .mapToDouble(OpFinanceira::getValorTotalOperacao).sum();
    }

}
