package com.prowings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.entity.Person;
import com.prowings.service.VoterService;

@RestController
public class ExceptionController {
	
	@Autowired
	VoterService voterService;
	
	@PostMapping("/vote")
	public ResponseEntity<String> doVote(@RequestBody Person person){
		String res = voterService.doVote(person);
		
		ResponseEntity<String> response = new ResponseEntity<String>(res, HttpStatus.OK);
		
		return response;
	}

}
