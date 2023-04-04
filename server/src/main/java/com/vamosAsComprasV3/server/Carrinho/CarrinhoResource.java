package com.vamosAsComprasV3.server.Carrinho;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/Carrinho")
public class CarrinhoResource {
    private CarrinhoService service;
    public CarrinhoResource(CarrinhoService service) {
        this.service = service;
    }

    @GetMapping
    @Transactional
    public List<Carrinho>getAll(){
        return service.getAll();
    }

    @PostMapping
    @Transactional
    public  Carrinho add(@Valid @RequestBody Carrinho carrinho){
        return service.add(carrinho);
    }

    @PutMapping("carrinho de compras/{id}")
    @Transactional
    public Carrinho update(@PathVariable("id")  @Valid @RequestBody Carrinho carrinho){
        return service.update(carrinho);
    }

    @DeleteMapping("{id}")
    @Transactional
    public void delete(@PathVariable("id") Long id){
        service.delete(id);
    }

}
