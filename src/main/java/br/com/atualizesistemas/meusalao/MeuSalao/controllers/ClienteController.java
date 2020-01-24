package br.com.atualizesistemas.meusalao.MeuSalao.controllers;

import br.com.atualizesistemas.meusalao.MeuSalao.models.Cliente;
import br.com.atualizesistemas.meusalao.MeuSalao.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping()
    public ResponseEntity<List<Cliente>> getListCliente() {
        List<Cliente> clientes = clienteService.findAll();
        return ResponseEntity.ok().body(clientes);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Cliente> getCliente(@PathVariable Long id) {
        Cliente cliente = clienteService.find(id);
        return ResponseEntity.ok().body(cliente);
    }

    @PostMapping
    public ResponseEntity<Cliente> getCliente(@RequestBody Cliente cliente) {
        cliente = clienteService.insert(cliente);
        return ResponseEntity.ok().body(cliente);
    }
}
