package org.acme.infra.db.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Suppliers {
    @Id
    @GeneratedValue
    private Long cnpj;
    @Id
    private Long cpf;
    private String name;
    private String email;
    private Long cep;
}
