package com.vamosAsComprasV3.server.Produtos;

import com.vamosAsComprasV3.server.Clientes.Cliente;
import com.vamosAsComprasV3.server.Clientes.ClienteService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;



    @RestController
    @RequestMapping("/Produtos")
    public class ProdutoResource {
        private ProdutoService service;
        public ProdutoResource(ProdutoService service) {
            this.service = service;
        }

        @GetMapping
        @Transactional
        public List<Produto> getAll(
                @RequestParam(value = "Nome",required = false)Long id){
            return service.getAll();
        }

        @GetMapping("/Search by name")
        @Transactional
        public List<Produto> search(
                @RequestParam(value = "nome",required = false)String nome){
            return service.search(nome);
        }

        @PostMapping
        @Transactional
        public Produto add(@Valid @RequestBody Produto produto) {
            return service.add_p(produto);
        }

        @PutMapping
        @Transactional
        public Produto update(@Valid @RequestBody Produto produto){
            return service.update(produto);
        }


        @PutMapping("Update de quantidade")
        @Transactional
        public Produto update_quant(@Valid @RequestBody Produto produto){
            return service.update(produto);
        }


        @DeleteMapping("{id}")
        @Transactional
        public void delete(@PathVariable("id") Long id) {
            service.delete(id);
        }


    }


