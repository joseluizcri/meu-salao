package br.com.atualizesistemas.meusalao.MeuSalao.models;

import br.com.atualizesistemas.meusalao.MeuSalao.models.agenda.Agendamento;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Cliente implements Pessoa, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;

    @OneToMany
    @JoinColumn(name = "I_PESSOAS")
    private List<Endereco> enderecos;

    @OneToMany
    @JoinColumn(name = "I_PESSOAS")
    private List<Telefone> telefones;

    @OneToMany(mappedBy = "cliente")
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
