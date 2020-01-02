package br.com.atualizesistemas.meusalao.MeuSalao.models;

import java.util.List;

public interface Pessoa {

    String getNome();
    List<Endereco> getEnderecos();
    List<Telefone> getTelefones();
}
