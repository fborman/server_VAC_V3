package com.vamosAsComprasV3.server.Carrinho;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;

@Entity
@Data
@NoArgsConstructor
public class Carrinho {

    
    @Id
    @GeneratedValue
    private Long id;
    private Long idCliente;
    private Long idProduto;
    private int quantidade;

    public Carrinho(Long idCliente, Long idProduto, int quantidade) {
        this.idCliente = idCliente;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
    }

}
