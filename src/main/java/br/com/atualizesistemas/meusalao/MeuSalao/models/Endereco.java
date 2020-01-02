package br.com.atualizesistemas.meusalao.MeuSalao.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String logradouro;
    private String numero;
    private String complemento;
    @ManyToOne
    @JoinColumn(name = "I_BAIRROS")
    private Bairro bairro;
    @ManyToOne
    @JoinColumn(name = "I_CIDADES")
    private Cidade cidade;
}
