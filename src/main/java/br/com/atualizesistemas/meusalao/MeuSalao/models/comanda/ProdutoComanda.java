package br.com.atualizesistemas.meusalao.MeuSalao.models.comanda;

import br.com.atualizesistemas.meusalao.MeuSalao.models.Produto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class ProdutoComanda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Produto produto;
    private BigDecimal valorVenda;
}
