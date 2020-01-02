package br.com.atualizesistemas.meusalao.MeuSalao.models.agenda;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class ConfiguracaoAgenda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String descricao;
    @OneToMany(mappedBy = "configuracaoAgenda")
    private List<ConfiguracaoAgendaDia> configuracaoDias;

}
