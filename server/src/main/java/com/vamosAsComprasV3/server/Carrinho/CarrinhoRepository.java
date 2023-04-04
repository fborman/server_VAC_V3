package com.vamosAsComprasV3.server.Carrinho;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
    public interface CarrinhoRepository extends JpaRepository<Carrinho, Long> {
        List<Carrinho> findAll();

    }


