package com.mmadapps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mmadapps.model.CodeRedUser;
import com.mmadapps.service.CodeRedService;

@RestController
public class CodeRedController {

	@Autowired
	private CodeRedService codeRedService;
	

	@GetMapping("/getAllCodeRedUsers")
	public List<CodeRedUser> getAllCodeRedUsers() {
		
		return codeRedService.findAll();
	}

	@GetMapping("/getByIdCodeRedUsers/{id}")
	public CodeRedUser getByCodeRedUserId(@PathVariable int id) {
		return codeRedService.findByUserId(id);
	}

	@PostMapping("/addCodeRedUser")
	public void addCodeRedUser(@RequestBody CodeRedUser codeRedUser) {
		codeRedService.addCodeRedUser(codeRedUser);
	}

	@PutMapping("/updateCodeRedUser/{id}")
	public void updateCodeRedUser(@RequestBody CodeRedUser codeRedUser, @PathVariable int id) {
		codeRedService.updateCodeRedUser(codeRedUser, id);
	}

	@DeleteMapping("/deleteCodeRedUserById/{id}")
	public void addCodeRedUser(@PathVariable int id) {
		codeRedService.deleteCodeRedUser(id);
	}
}
