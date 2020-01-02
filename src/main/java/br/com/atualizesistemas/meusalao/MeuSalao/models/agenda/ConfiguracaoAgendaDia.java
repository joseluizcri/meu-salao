package br.com.atualizesistemas.meusalao.MeuSalao.models.agenda;

import javax.persistence.*;
import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalDateTime;

@Entity
public class ConfiguracaoAgendaDia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String descricao;
    private DayOfWeek dayOfWeek;
    private Integer tempoAtendimento;
    private LocalDateTime inicioAtendimento;
    private LocalDateTime fimAtendimento;
    @ManyToOne
    @JoinColumn(name = "I_CONFIG_AGENDA")
    private ConfiguracaoAgenda configuracaoAgenda;

}
