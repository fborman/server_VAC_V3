package com.vamosAsComprasV3.server.Clientes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data@NoArgsConstructor

public class Cliente {
    @Id
    @GeneratedValue
    private long id;

    @NotBlank
    private String nome;
    @NotBlank
    private String telefone;
    @NotBlank
    private String email;
    @NotBlank
    private String password;

    private Set<String> roles;

}
