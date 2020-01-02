package br.com.atualizesistemas.meusalao.MeuSalao.models.agenda;

import br.com.atualizesistemas.meusalao.MeuSalao.models.Profissional;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Agenda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String descricao;
    private Profissional profissional;
    @OneToMany(mappedBy = "agenda")
    private List<Agendamento> agendamentos;
    @ManyToOne
    @JoinColumn(name = "I_CONFIG_AGENDAS")
    private ConfiguracaoAgenda configuracaoAgenda;
}
