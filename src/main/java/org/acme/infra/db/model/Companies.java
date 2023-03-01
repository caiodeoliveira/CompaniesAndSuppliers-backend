package org.acme.infra.db.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.enterprise.inject.Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Model
@Entity
@Data
@NoArgsConstructor
public class Companies {
    @Id
    @GeneratedValue
    private Long cnpj;
    private String fantasyName;
    private Long cep;
}