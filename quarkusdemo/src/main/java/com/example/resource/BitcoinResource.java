package com.example.resource;

import com.example.model.Bitcoin;
import com.example.service.BitcoinService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

@Path("/bitcoins")
public class BitcoinResource {

    @RestClient
    BitcoinService bitcoinService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bitcoin> listar() {
        return bitcoinService.listar();
    }

}
