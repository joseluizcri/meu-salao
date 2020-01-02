package br.com.atualizesistemas.meusalao.MeuSalao.repositories;

import br.com.atualizesistemas.meusalao.MeuSalao.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
