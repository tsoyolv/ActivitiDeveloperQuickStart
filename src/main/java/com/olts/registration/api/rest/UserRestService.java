package com.olts.registration.api.rest;


import com.olts.registration.api.dao.UserDaoImpl;
import com.olts.registration.api.entity.User;
import org.activiti.engine.impl.util.json.JSONException;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collection;

/**
 * o.tsoy
 * 27.03.2017
 */
@Path("/user")
public class UserRestService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<User> get() throws JSONException {
        return new UserDaoImpl().get();
    }

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User get(@PathParam("id") int id) throws JSONException {
        return new UserDaoImpl().get(id);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(User userTemplate) {
        return Response.status(Response.Status.CREATED).entity(new UserDaoImpl().create(userTemplate)).build();
    }
}
