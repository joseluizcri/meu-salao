package br.com.atualizesistemas.meusalao.MeuSalao.models.comanda;

import br.com.atualizesistemas.meusalao.MeuSalao.models.Produto;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@SequenceGenerator(name = "SEQ_PROD_COMAND", allocationSize = 1, sequenceName = "SEQ_PROD_COMAND")
public class ProdutoComanda implements Serializable {

    @Id
    @GeneratedValue(generator = "SEQ_PROD_COMAND", strategy = GenerationType.SEQUENCE)
    private Long id;
    private Produto produto;
    private BigDecimal valorVenda;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }
}
