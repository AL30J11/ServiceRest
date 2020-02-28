package com.java.ws.rest.service;

import com.java.ws.rest.vo.VOPendiente;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class RestClient
{
	public static void main(String[] args)
	{
		String urlRestServ = "http://localhost:8080/Rest/services/Java/addPendient";
		System.out.println("##### Invoke Rest Service: ["+urlRestServ+"]");
		VOPendiente vo = new VOPendiente();
		vo.setIdPendiente("1");
		vo.setTitle("Pendiente 1");
		vo.setContext("Pendiente numero uno");
		ClientConfig cliConf = new DefaultClientConfig();
		cliConf.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		Client cli = Client.create(cliConf);
		WebResource webRes = cli.resource(urlRestServ);
		ClientResponse cliRespo = webRes.type("application/json").post(ClientResponse.class, vo);
		vo = cliRespo.getEntity(VOPendiente.class);
		System.out.println("##### Response: [Id: "+vo.getIdPendiente()+" ]");
		System.out.println("##### Response: [Título: "+vo.getTitle()+" ]");
	}
}