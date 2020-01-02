package br.com.atualizesistemas.meusalao.MeuSalao.models.comanda;

import br.com.atualizesistemas.meusalao.MeuSalao.models.agenda.Agendamento;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Comanda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Agendamento data;
    @OneToMany
    @JoinColumn(name = "I_COMANDAS")
    private List<ServicoComanda> servicos;
    @OneToMany
    @JoinColumn(name = "I_COMANDAS")
    private List<ProdutoComanda> produtos;

}
