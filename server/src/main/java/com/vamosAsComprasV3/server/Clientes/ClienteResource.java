package com.vamosAsComprasV3.server.Clientes;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Clientes")
public class ClienteResource {
    private ClienteService service;
    public ClienteResource(ClienteService service) {
        this.service = service;
    }

    @GetMapping
    @Transactional
    public List<Cliente>getAll(
            @RequestParam(value = "Nome",required = false)Long id){
        return service.getAll();
    }

    @PostMapping
    @Transactional
    public Cliente add(@Valid  @RequestBody Cliente cliente) {
        return service.add(cliente);
    }

    @PutMapping
    @Transactional
    public Cliente update(@Valid @RequestBody Cliente cliente){
        return service.update(cliente);
    }


    @DeleteMapping("{id}")
    @Transactional
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }

}
