package com.vamosAsComprasV3.server.Clientes;

import org.hibernate.annotations.Comment;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }


    public List<Cliente> getAll() {
        return repository == null ?
                repository.findAll(Sort.by(Sort.Order.asc("id"))):
                repository.findAll();

    }

    public Cliente add(Cliente cliente) {
        return repository.save(cliente);
    }


    public void delete(Long id) {

        repository.deleteById(id);
    }

    public Cliente update(@NotNull Cliente cliente) {
        if (cliente.getId()>0)
            repository.save(cliente);

        return cliente;
    }
}
