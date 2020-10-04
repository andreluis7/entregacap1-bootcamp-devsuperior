package com.andre.dsclient.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andre.dsclient.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Joao", "12345678", 5000.00, Instant.now(), 1));
		list.add(new Client(2L, "Maria", "12345679", 2500.00, Instant.now(), 2));
		return ResponseEntity.ok().body(list);
	}

}