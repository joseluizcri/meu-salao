package br.com.atualizesistemas.meusalao.MeuSalao.models.agenda;

import br.com.atualizesistemas.meusalao.MeuSalao.models.Cliente;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDate;

@Entity
public class Agendamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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
