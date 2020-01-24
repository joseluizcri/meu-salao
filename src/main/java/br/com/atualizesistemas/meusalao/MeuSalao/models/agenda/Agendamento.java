package br.com.atualizesistemas.meusalao.MeuSalao.models.agenda;

import br.com.atualizesistemas.meusalao.MeuSalao.models.Cliente;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDate;

@Entity
@SequenceGenerator(name = "SEQ_AGENDAMENTO", allocationSize = 1, sequenceName = "SEQ_AGENDAMENTO")
public class Agendamento implements Serializable {

    @Id
    @GeneratedValue(generator = "SEQ_AGENDAMENTO", strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "I_AGENDAS")
    private Agenda agenda;
    @ManyToOne
    @JoinColumn(name = "I_CLIENTES")
    private Cliente cliente;
    private LocalDate data;
    private Time hora;
}
