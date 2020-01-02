package br.com.atualizesistemas.meusalao.MeuSalao.models;

import br.com.atualizesistemas.meusalao.MeuSalao.models.comanda.ItemDeVenda;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class Servico implements ItemDeVenda, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String descricao;
    private BigDecimal valorCusto;
    private BigDecimal valorVenda;
    private BigDecimal pctMargem;
    private Integer tempoExecucao;

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
