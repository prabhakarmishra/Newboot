package com.example.demo;

import java.net.URISyntaxException;
import java.net.URL;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import com.kumuluz.ee.discovery.annotations.DiscoverService;
import com.kumuluz.ee.discovery.enums.AccessType;

/**
 *
 */
@Path("/hello")
@Singleton
public class HelloController {
	
	 
    @GET
    public String sayHello() {
        return "Hello World";
    }
       
}
