package org.acme.infra.db.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import lombok.extern.slf4j.Slf4j;
import org.acme.infra.db.model.Companies;

import javax.enterprise.context.ApplicationScoped;

@Slf4j
@ApplicationScoped
public class CompaniesRepository implements PanacheRepository<Companies> {

}