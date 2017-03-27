package com.olts.registration.api.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * o.tsoy
 * 24.03.2017
 */
@Path("/hello")
public class HelloWorldService {

    @GET
    public String getMsg() {
        return "AAAAA";
    }
}