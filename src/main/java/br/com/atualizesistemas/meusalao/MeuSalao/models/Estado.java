package br.com.atualizesistemas.meusalao.MeuSalao.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@SequenceGenerator(name = "SEQ_ESTADOS", allocationSize = 1, sequenceName = "SEQ_ESTADOS")
public class Estado implements Serializable {

    @Id
    @GeneratedValue(generator = "SEQ_ESTADOS", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
