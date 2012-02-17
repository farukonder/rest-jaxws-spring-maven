package eu.tyrkiahus.web.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import eu.tyrkiahus.web.service.Service;

@Component
@Path("/account")
public class AccountRestService {

	@Autowired
	Service service;

	@GET
	@Path("/my")
	public Response savePayment() {

		String result = service.save();

		return Response.status(200).entity(result).build();

	}

}