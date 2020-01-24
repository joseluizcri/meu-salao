package br.com.atualizesistemas.meusalao.MeuSalao.models;

import br.com.atualizesistemas.meusalao.MeuSalao.models.agenda.Agendamento;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@SequenceGenerator(name = "SEQ_CLIENTES", allocationSize = 1, sequenceName = "SEQ_CLIENTES")
public class Cliente implements Pessoa, Serializable {

    @Id
    @GeneratedValue(generator = "SEQ_CLIENTES", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name="CLIENTES_ENDERECOS", joinColumns=
            {@JoinColumn(name="I_CLIENTES")}, inverseJoinColumns=
            {@JoinColumn(name="I_ENDERECOS")})
    private List<Endereco> enderecos;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name="CLIENTES_TELEFONES", joinColumns=
            {@JoinColumn(name="I_CLIENTES")}, inverseJoinColumns=
            {@JoinColumn(name="I_TELEFONES")})
    private List<Telefone> telefones;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Agendamento> agendamentos;

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public List<Endereco> getEnderecos() {
        return this.enderecos;
    }

    @Override
    public List<Telefone> getTelefones() {
        return this.telefones;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
