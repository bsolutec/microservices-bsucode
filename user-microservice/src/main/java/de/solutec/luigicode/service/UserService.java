package de.solutec.luigicode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import de.solutec.luigicode.entity.User;
import de.solutec.luigicode.model.Bike;
import de.solutec.luigicode.model.Car;
import de.solutec.luigicode.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

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
	
	public List<Car> getCars(int userId) {
		@SuppressWarnings("unchecked")
		List<Car> cars = restTemplate.getForObject("http://localhost:8002/car/byuser/" + userId, List.class);
		return cars;
	}

	public List<Bike> getBikes(int userId) {
		@SuppressWarnings("unchecked")
		List<Bike> bikes = restTemplate.getForObject("http://localhost:8003/bike/byuser/" + userId, List.class);
		return bikes;
	}

}
