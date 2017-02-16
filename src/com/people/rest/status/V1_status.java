package com.people.rest.status;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//This is the root path of the rest service

@Path("v1/status")
public class V1_status {

private static final String api_version = "1.0.0";

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle() {
		return "<p> Java Web Services </p>";
		
	}
	
	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion () {
		return "<p> Java Web Services version</p>" + api_version;
		
	}
}
