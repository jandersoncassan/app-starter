package com.app.heroku.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")
public class MensagemController {

	@GetMapping(path="/starter", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getStater() {
		return new ResponseEntity<>("eita", HttpStatus.OK);
	}

	
}
