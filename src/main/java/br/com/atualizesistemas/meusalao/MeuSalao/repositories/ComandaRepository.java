package br.com.atualizesistemas.meusalao.MeuSalao.repositories;

import br.com.atualizesistemas.meusalao.MeuSalao.models.comanda.Comanda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComandaRepository extends JpaRepository<Comanda, Long> {
}
