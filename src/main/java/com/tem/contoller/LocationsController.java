package com.tem.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tem.workorder.dto.LocationDTO;
import com.tem.workorder.entity.Locations;
import com.tem.workorder.service.LocationsService;

@RestController
public class LocationsController {

	@Autowired
	LocationsService locationsService;

	@RequestMapping(value = "/getlocations", method = RequestMethod.POST, consumes = "application/json")
	List<Locations> getLocations(@RequestBody LocationDTO locationDTO) {
		return locationsService.findByStateAndCountry(locationDTO);
	}
}
