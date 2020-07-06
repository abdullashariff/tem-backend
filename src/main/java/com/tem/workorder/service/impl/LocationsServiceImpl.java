package com.tem.workorder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tem.workorder.dto.LocationDTO;
import com.tem.workorder.entity.Locations;
import com.tem.workorder.repository.LocationsRepository;
import com.tem.workorder.service.LocationsService;

@Service("locationsService")
public class LocationsServiceImpl implements LocationsService {
	
	@Autowired
	LocationsRepository locationsRepository;
	
	@Override
	public List<Locations> findByStateAndCountry(LocationDTO locationDTO){
		return locationsRepository.findByStateAndCountry(locationDTO.getState(), locationDTO.getCountry());
	}

}
