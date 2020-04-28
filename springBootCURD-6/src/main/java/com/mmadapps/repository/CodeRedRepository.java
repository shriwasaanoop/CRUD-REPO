package com.mmadapps.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mmadapps.model.CodeRedUser;

@Repository
public interface CodeRedRepository extends JpaRepository<CodeRedUser, Integer>{
	
}
