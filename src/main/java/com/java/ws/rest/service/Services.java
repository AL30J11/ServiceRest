package com.java.ws.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.java.ws.rest.vo.VOPendiente;

@Path("/Java")
public class Services
{	
	@POST
	@Path("/update")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public VOPendiente optSel(VOPendiente vo)
	{
		return vo;
	}
	
	@POST
	@Path("/addPendient")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public VOPendiente addPendient(VOPendiente vop)
	{
		if(vop.getTitle().equals("Pendiente 1"))
		{
			vop.setIdPendiente("1");
			vop.setContext("Pendiente numero uno");
		}
		return vop;
	}
}