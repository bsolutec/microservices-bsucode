package de.solutec.luigicode.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import de.solutec.luigicode.model.Bike;

@FeignClient(name = "bike-microservice", url = "http://localhost:8003")
@RequestMapping("/bike")
public interface BikeFeignClient {

	@PostMapping
	public Bike save(@RequestBody Bike bike);
	
	@GetMapping("/byuser/{userId}")
	List<Bike> getBikes(@PathVariable("userId") int userId );

}

	
