package de.solutec.luigicode.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.solutec.luigicode.entity.Bike;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Integer> {

	List<Bike> findByUserId(int userId);

}
