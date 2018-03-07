/**
 * 
 */
package com.mkstecnologia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mkstecnologia.model.Authority;

/**
 * @author Markus Souza on 19/02/2018
 *
 */
public interface AuthorityRepository extends JpaRepository<Authority, String>{
	
	Authority findByName(String name);
	
}
