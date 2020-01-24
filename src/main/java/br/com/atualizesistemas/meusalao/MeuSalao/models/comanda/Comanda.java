package br.com.atualizesistemas.meusalao.MeuSalao.models.comanda;

import br.com.atualizesistemas.meusalao.MeuSalao.models.agenda.Agendamento;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@SequenceGenerator(name = "SEQ_COMANDAS", allocationSize = 1, sequenceName = "SEQ_COMANDAS")
public class Comanda implements Serializable {

    @Id
    @GeneratedValue(generator = "SEQ_COMANDAS", strategy = GenerationType.SEQUENCE)
    private Long id;
    private Agendamento data;
    @OneToMany
    @JoinColumn(name = "I_COMANDAS")
    private List<ServicoComanda> servicos;
    @OneToMany
    @JoinColumn(name = "I_COMANDAS")
    private List<ProdutoComanda> produtos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Agendamento getData() {
        return data;
    }

    public void setData(Agendamento data) {
        this.data = data;
    }

    public List<ServicoComanda> getServicos() {
        return servicos;
    }

    public void setServicos(List<ServicoComanda> servicos) {
        this.servicos = servicos;
    }

    public List<ProdutoComanda> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoComanda> produtos) {
        this.produtos = produtos;
    }
}
