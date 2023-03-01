package org.acme.infra.db.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.acme.infra.db.model.Suppliers;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SuppliersRepository implements PanacheRepository<Suppliers> {
}
