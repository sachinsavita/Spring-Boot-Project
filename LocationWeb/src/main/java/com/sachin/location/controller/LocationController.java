package com.sachin.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sachin.location.entities.Location;
import com.sachin.location.service.LocationService;

@Controller
public class LocationController {
	
	@Autowired
	LocationService service;
	
	@RequestMapping("/showCreate")
	public String showCreate()
	{
		System.out.println("Hello !!!!");
		return "createLocation";
	}
	
	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location")Location location, ModelMap modelMap)
	{
		System.out.println("Location Saved");
		Location locationSaved = service.saveLocation(location);
	    String msg = "Location saved with id: "+locationSaved.getId();
	    modelMap.addAttribute("msg", msg);
		return "createLocation";
	}
	
	@RequestMapping("/displayLocations")
	public String displayLocations(ModelMap modelMap)
	{
		System.out.println("All locations!");
		List<Location> locations = service.getAllLocation();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}

}
