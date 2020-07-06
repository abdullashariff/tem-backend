package com.tem.workorder.service;

import java.util.List;

import com.tem.workorder.dto.LocationDTO;
import com.tem.workorder.entity.Locations;

public interface LocationsService {
	
	List<Locations> findByStateAndCountry(LocationDTO locationDTO);

}
