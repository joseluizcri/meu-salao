package br.com.atualizesistemas.meusalao.MeuSalao.models;

import java.math.BigDecimal;

public interface ItemDeVenda {
    String getDescricao();
    BigDecimal getValorCusto();
    BigDecimal getValorVenda();
    BigDecimal getPctMargem();
}
