package com.devsuperior.client.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.client.entities.Client;

@RestController
@RequestMapping(value = "/categories")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "João", "59742541187", 5974.14, Instant.now(), 0));
		return ResponseEntity.ok().body(list);
	}
	
}
