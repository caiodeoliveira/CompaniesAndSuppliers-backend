package org.acme.resource;

import lombok.extern.slf4j.Slf4j;
import org.acme.infra.db.model.Suppliers;
import org.acme.infra.db.repository.SuppliersRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("suppliers")
@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")
@Slf4j
public class SuppliersResource {

    @Inject
    SuppliersRepository suppliersRepository;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public List<Suppliers> findAll() {return suppliersRepository.listAll();}
}
