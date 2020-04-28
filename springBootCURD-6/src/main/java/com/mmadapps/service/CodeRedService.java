package com.mmadapps.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmadapps.model.CodeRedUser;
import com.mmadapps.repository.CodeRedRepository;

@Service
public class CodeRedService {

	@Autowired
	private CodeRedRepository codeRedRepository;

	public List<CodeRedUser> findAll() {
		return codeRedRepository.findAll();
	}

	public CodeRedUser findByUserId(int id) {
		return codeRedRepository.findById(id).get();
	}

	public void addCodeRedUser(CodeRedUser codeRedUser) {
		codeRedRepository.save(codeRedUser);
	}

	public void updateCodeRedUser(CodeRedUser codeRedUser, int id) {
		codeRedRepository.save(codeRedUser);
	}

	public void deleteCodeRedUser(int id) {
		codeRedRepository.deleteById(id);
	}

}
