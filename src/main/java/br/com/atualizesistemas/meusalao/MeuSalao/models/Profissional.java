package br.com.atualizesistemas.meusalao.MeuSalao.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@SequenceGenerator(name = "SEQ_PROFISSIONAIS", allocationSize = 1, sequenceName = "SEQ_PROFISSIONAIS")
public class Profissional implements Pessoa, Serializable {

    @Id
    @GeneratedValue(generator = "SEQ_PROFISSIONAIS", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name="PROFISSIONAIS_ENDERECOS", joinColumns=
            {@JoinColumn(name="I_PROFISSIONAIS")}, inverseJoinColumns=
            {@JoinColumn(name="I_ENDERECOS")})
    private List<Endereco> enderecos;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name="PROFISSIONAIS_TELEFONES", joinColumns=
            {@JoinColumn(name="I_PROFISSIONAIS")}, inverseJoinColumns=
            {@JoinColumn(name="I_TELEFONES")})
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
