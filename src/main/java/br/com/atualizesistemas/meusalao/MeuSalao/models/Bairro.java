package br.com.atualizesistemas.meusalao.MeuSalao.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@SequenceGenerator(name = "SEQ_BAIRROS", allocationSize = 1, sequenceName = "SEQ_BAIRROS")
public class Bairro implements Serializable {

    @Id
    @GeneratedValue(generator = "SEQ_BAIRROS", strategy = GenerationType.SEQUENCE)
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
