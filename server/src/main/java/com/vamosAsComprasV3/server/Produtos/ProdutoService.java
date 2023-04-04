package com.vamosAsComprasV3.server.Produtos;

import com.vamosAsComprasV3.server.Clientes.Cliente;
import com.vamosAsComprasV3.server.Clientes.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }


    public List<Produto> getAll() {
        return repository == null ?
                repository.findAll(Sort.by(Sort.Order.asc("id"))) :
                repository.findAll();

    }

    public Produto add_p(Produto produto) {
        return repository.save(produto);
    }


    public void delete(Long id) {

        repository.deleteById(id);
    }

    public Produto update(Produto produto) {
        if (produto.getId() > 0)
            repository.save(produto);

        return produto;
    }

    public List<Produto> search(String nome) {

        return repository.getProdutosFromProdutoBynome(nome);

    }

}