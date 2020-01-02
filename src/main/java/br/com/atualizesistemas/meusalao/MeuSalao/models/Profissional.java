package br.com.atualizesistemas.meusalao.MeuSalao.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Profissional implements Pessoa, Serializable {

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
}
