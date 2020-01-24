package br.com.atualizesistemas.meusalao.MeuSalao.services;

import br.com.atualizesistemas.meusalao.MeuSalao.models.comanda.Comanda;
import br.com.atualizesistemas.meusalao.MeuSalao.repositories.ComandaRepository;
import br.com.atualizesistemas.meusalao.MeuSalao.services.exceptions.DateIntegrityException;
import br.com.atualizesistemas.meusalao.MeuSalao.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComandaService {

    @Autowired
    private ComandaRepository repository;

    public Comanda find(Long id) {
        Optional<Comanda> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Comanda.class.getName()));
    }

    public Comanda insert(Comanda comanda) {
        comanda.setId(null);
        return repository.save(comanda);
    }

    public Comanda update(Comanda comanda) {
        find(comanda.getId());
        return repository.save(comanda);
    }

    public void delete(Long id) {
        find(id);
        try {
            repository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DateIntegrityException("Não é possível excluir um comanda que possui vínculos");
        }
    }

    public List<Comanda> findAll() {
        return repository.findAll();
    }

    public Page<Comanda> findPage(Integer offset, Integer limit, String order, String direction) {
        PageRequest pageRequest = PageRequest.of(offset, limit, Sort.Direction.valueOf(direction), order);
        return repository.findAll(pageRequest);
    }
}
