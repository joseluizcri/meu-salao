package br.com.atualizesistemas.meusalao.MeuSalao.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@SequenceGenerator(name = "SEQ_ENDERECOS", allocationSize = 1, sequenceName = "SEQ_ENDERECOS")
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(generator = "SEQ_ENDERECOS", strategy = GenerationType.SEQUENCE)
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
