package org.example.model;

import java.time.LocalDate;

public interface OpFinanceira {

    public LocalDate getDataOperacao();
    public Double getValorTotalOperacao();
    public TipoOperacao getTipoOperacao();
}
