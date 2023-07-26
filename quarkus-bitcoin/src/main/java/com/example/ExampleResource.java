package com.example;

import com.example.model.Bitcoin;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

@Path("/bitcoins")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ExampleResource {

    private Set<Bitcoin> bitcoins = Collections.synchronizedSet(new LinkedHashSet<>());

    private void setCoins() {
        var data = LocalDate.of(2023, 1, 8);
        bitcoins.add(new Bitcoin(0, 12.2, Tipo.COMPRA.name(), data));
        bitcoins.add(new Bitcoin(1, 33.0, Tipo.VENDA.name(), data));
        bitcoins.add(new Bitcoin(2, 1_110.0, Tipo.COMPRA.name(), data));
    }

    private enum Tipo {
        VENDA, COMPRA
    }

    @GET
    public Response bitcoin() {
        setCoins();
        return Response.ok(bitcoins).build();
    }
}
