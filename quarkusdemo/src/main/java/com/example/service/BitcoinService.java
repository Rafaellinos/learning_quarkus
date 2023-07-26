package com.example.service;

import com.example.model.Bitcoin;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/bitcoins")
public interface BitcoinService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bitcoin> listar();

}
