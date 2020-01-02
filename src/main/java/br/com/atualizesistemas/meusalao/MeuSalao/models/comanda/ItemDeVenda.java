package br.com.atualizesistemas.meusalao.MeuSalao.models.comanda;

import java.math.BigDecimal;

public interface ItemDeVenda {
    String getDescricao();
    BigDecimal getValorCusto();
    BigDecimal getValorVenda();
    BigDecimal getPctMargem();
}
