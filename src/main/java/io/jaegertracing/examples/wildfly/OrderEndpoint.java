package io.jaegertracing.examples.wildfly;

import javax.ejb.Stateless;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Stateless
@Path("/order")
public class OrderEndpoint {
    @POST
    @Path("/")
    public String placeOrder() {
        return "Order placed";
    }
}