package br.com.atualizesistemas.meusalao.MeuSalao.models.comanda;

import br.com.atualizesistemas.meusalao.MeuSalao.models.Servico;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@SequenceGenerator(name = "SEQ_SERV_COMAND", allocationSize = 1, sequenceName = "SEQ_SERV_COMAND")
public class ServicoComanda implements Serializable {

    @Id
    @GeneratedValue(generator = "SEQ_SERV_COMAND", strategy = GenerationType.SEQUENCE)
    private Long id;
    private Servico servico;
    private BigDecimal valorVenda;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }
}
