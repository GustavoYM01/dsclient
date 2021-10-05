package com.devsuperior.client.resources;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.client.entities.Client;
import com.devsuperior.client.services.ClientService;

@RestController
@RequestMapping(value = "/categories")
public class ClientResource {
	
	@Autowired
	private ClientService service;

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
//		List<Client> list = new ArrayList<>();
		List<Client> list = service.findAll();
//		list.add(new Client(1L, "João", "59742541187", 5974.14, Instant.now(), 0));
		return ResponseEntity.ok().body(list);
	}
	
}
