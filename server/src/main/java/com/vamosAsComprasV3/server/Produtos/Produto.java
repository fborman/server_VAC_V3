package com.vamosAsComprasV3.server.Produtos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


@Entity
@Data@NoArgsConstructor
@NamedQuery(
        name = "Produto.getProdutosFromProdutoBynome",
        query = "SELECT prod FROM Produto prod " +
                "WHERE prod.nome = :nome " +
                "ORDER BY prod.nome"

)

public class Produto {
    @Id
    @GeneratedValue
    private long id;

    @NotBlank
    private String nome;
    @NotNull
    private float valor;

    private int quant;

}
