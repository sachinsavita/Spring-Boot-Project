package com.sachin.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sachin.location.entities.Location;
import com.sachin.location.repos.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository repository;
	
	public Location saveLocation(Location location) {
		return repository.save(location);
	}

	public Location updateLocation(Location location) {
		return repository.save(location);
	}

	public void deleteLocation(Location location) {
		repository.delete(location);

	}

	public List<Location> getAllLocation() {
		return (List<Location>) repository.findAll();
	}

}
