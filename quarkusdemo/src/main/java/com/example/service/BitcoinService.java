package com.example.service;

import com.example.model.Bitcoin;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@Path("/bitcoins")
@RegisterRestClient(configKey = "bitcoins-service")
public interface BitcoinService {

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Bitcoin> listar();

}
