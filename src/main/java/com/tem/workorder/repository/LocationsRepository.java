package com.tem.workorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tem.workorder.entity.Locations;

@Repository
public interface LocationsRepository extends JpaRepository<Locations, Long> {
	
	List<Locations> findByStateAndCountry(String state, String country);

}
