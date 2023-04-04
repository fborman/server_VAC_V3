package com.vamosAsComprasV3.server.Carrinho;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrinhoService {
    @Autowired
    private CarrinhoRepository repository;
    public CarrinhoService(CarrinhoRepository repository) {
        this.repository = repository;
    }
    public List<Carrinho> getAll(){
        return repository.findAll();
    }

    public Carrinho add(Carrinho carrinho){
        return repository.save(carrinho);
    }



    public Carrinho update(Carrinho carrinho){
        if(carrinho.getId()>0)
            repository.save(carrinho);

        return carrinho;
    }
   public void delete(Long id){
        repository.deleteById(id);
    }

}
