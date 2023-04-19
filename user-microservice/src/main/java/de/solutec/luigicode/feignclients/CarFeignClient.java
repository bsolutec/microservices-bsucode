package de.solutec.luigicode.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import de.solutec.luigicode.model.Car;

@FeignClient(name = "car-microservice", url = "http://localhost:8002")
@RequestMapping("/car")
public interface CarFeignClient {
	
	@PostMapping
	public Car save(@RequestBody Car car);
	
	@GetMapping("/byuser/{userId}")
	List<Car> getCars(@PathVariable("userId") int userId );

}
