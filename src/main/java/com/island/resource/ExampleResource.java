package com.island.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("submit")
public class ExampleResource {

	@GET
	@Path("job")
	@Produces(MediaType.APPLICATION_JSON)
	public String submitJob(){
	   return "aaaaaaaabbbbb";
	}
}
