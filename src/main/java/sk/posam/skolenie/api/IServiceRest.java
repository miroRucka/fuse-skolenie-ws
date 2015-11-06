package sk.posam.skolenie.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author rucka
 */
@Path("/rest/")
public interface IServiceRest {

    @GET
    @Path("/zlozity-vypocet/")
    String zlozityVypocet();
}
