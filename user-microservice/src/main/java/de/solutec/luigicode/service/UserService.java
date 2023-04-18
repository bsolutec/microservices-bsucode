package de.solutec.luigicode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.solutec.luigicode.entity.User;
import de.solutec.luigicode.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getAll() {
		return userRepository.findAll();
	}

	public User getUserById(int id) {
		return userRepository.findById(id).orElse(null);
	}

	public User save(User user) {
		User userNew = userRepository.save(user);
		return userNew;
	}

}
