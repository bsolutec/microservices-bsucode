package de.solutec.luigicode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.solutec.luigicode.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	
}
