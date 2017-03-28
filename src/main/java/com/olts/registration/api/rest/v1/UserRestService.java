package com.olts.registration.api.rest.v1;


import com.olts.registration.api.dao.UserDao;
import com.olts.registration.api.entity.User;
import org.activiti.engine.impl.util.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collection;

/**
 * o.tsoy
 * 27.03.2017
 */
@Path("/user")
@Service
public class UserRestService {

    @Autowired @Qualifier("userDao")
    private UserDao userDao;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<User> get() throws JSONException {
        return userDao.get();
    }

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User get(@PathParam("id") int id) throws JSONException {
        return userDao.get(id);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(User userTemplate) {
        return Response.status(Response.Status.CREATED).entity(userDao.create(userTemplate)).build();
    }
}
