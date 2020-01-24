package br.com.atualizesistemas.meusalao.MeuSalao.controllers;

import br.com.atualizesistemas.meusalao.MeuSalao.models.comanda.Comanda;
import br.com.atualizesistemas.meusalao.MeuSalao.services.ComandaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/comandas")
public class ComandaController {

    @Autowired
    private ComandaService comandaService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Comanda> getComanda(@PathVariable Long id) {
        Comanda comanda = comandaService.find(id);
        return ResponseEntity.ok().body(comanda);
    }

    @PostMapping
    public ResponseEntity<Comanda> getComanda(@RequestBody Comanda comanda) {
        comanda = comandaService.insert(comanda);
        return ResponseEntity.ok().body(comanda);
    }
}
