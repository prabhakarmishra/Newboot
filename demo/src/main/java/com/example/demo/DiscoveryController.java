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

@Path("/discover")
@Singleton
public class DiscoveryController {
	@Inject
	@DiscoverService(value = "sample-service", environment = "dev", version = "1.0.x", accessType = AccessType.DIRECT)
	private URL url;
	
	@GET
	@Path("{id}")
    public String discoverHello(@PathParam("id") int sampleId) throws URISyntaxException {
    	System.out.println(url.toURI().toString());
    	return ClientBuilder.newClient()
				   .target(url.toURI())
				   .path("/{id}")
				   .resolveTemplate("id", sampleId)
				   .request(MediaType.APPLICATION_JSON)
				   .get(String.class);
    }
}
