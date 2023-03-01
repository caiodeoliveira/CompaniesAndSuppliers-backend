package org.acme.resource;

import lombok.extern.slf4j.Slf4j;
import org.acme.infra.db.model.Companies;
import org.acme.infra.db.repository.CompaniesRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("companies")
@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")
@Slf4j
public class CompaniesResource {

    @Inject
    CompaniesRepository CompaniesRepository;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public List<Companies> findAll() {return CompaniesRepository.listAll();}
}
