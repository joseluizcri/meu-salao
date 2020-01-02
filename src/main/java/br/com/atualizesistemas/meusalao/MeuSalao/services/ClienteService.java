package br.com.atualizesistemas.meusalao.MeuSalao.services;

import br.com.atualizesistemas.meusalao.MeuSalao.models.Cliente;
import br.com.atualizesistemas.meusalao.MeuSalao.repositories.ClienteRepository;
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
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente find(Long id) {
        Optional<Cliente> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
    }

    public Cliente insert(Cliente cliente) {
        cliente.setId(null);
        return repository.save(cliente);
    }

    public Cliente update(Cliente cliente) {
        find(cliente.getId());
        return repository.save(cliente);
    }

    public void delete(Long id) {
        find(id);
        try {
            repository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DateIntegrityException("Não é possível excluir um cliente que possui vínculos");
        }
    }

    public List<Cliente> findAll() {
        return repository.findAll();
    }

    public Page<Cliente> findPage(Integer offset, Integer limit, String order, String direction) {
        PageRequest pageRequest = PageRequest.of(offset, limit, Sort.Direction.valueOf(direction), order);
        return repository.findAll(pageRequest);
    }
}
