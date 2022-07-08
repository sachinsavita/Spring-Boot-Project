package com.sachin.location.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sachin.location.entities.Location;


public interface LocationService {
	
	Location saveLocation(Location location);
	
	Location updateLocation(Location location);
	
	void deleteLocation(Location location);

	List<Location> getAllLocation();
	
	

}
