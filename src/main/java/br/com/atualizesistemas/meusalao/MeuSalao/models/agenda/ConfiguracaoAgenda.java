package br.com.atualizesistemas.meusalao.MeuSalao.models.agenda;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@SequenceGenerator(name = "SEQ_CONF_AGENDA", allocationSize = 1, sequenceName = "SEQ_CONF_AGENDA")
public class ConfiguracaoAgenda implements Serializable {

    @Id
    @GeneratedValue(generator = "SEQ_CONF_AGENDA", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String descricao;
    @OneToMany(mappedBy = "configuracaoAgenda")
    private List<ConfiguracaoAgendaDia> configuracaoDias;

}
