package br.com.atualizesistemas.meusalao.MeuSalao.models;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@SequenceGenerator(name = "SEQ_PRODUTOS", allocationSize = 1, sequenceName = "SEQ_PRODUTOS")
public class Produto implements ItemDeVenda, Serializable {

    @Id
    @GeneratedValue(generator = "SEQ_PRODUTOS", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String descricao;
    private BigDecimal valorCusto;
    private BigDecimal valorVenda;
    private BigDecimal pctMargem;

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public BigDecimal getValorCusto() {
        return this.valorCusto;
    }

    @Override
    public BigDecimal getValorVenda() {
        return this.valorVenda;
    }

    @Override
    public BigDecimal getPctMargem() {
        return this.pctMargem;
    }
}
