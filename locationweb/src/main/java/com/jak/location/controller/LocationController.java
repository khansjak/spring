package com.jak.location.controller;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jak.location.entities.Location;
import com.jak.location.repos.LocationRepository;
import com.jak.location.service.LocationService;
import com.jak.location.util.EmailUtil;
import com.jak.location.util.ReportUtil;

@Controller
public class LocationController {

	@Autowired
	LocationService service;

	@Autowired
	EmailUtil emailUtil;
	
	@Autowired
	ReportUtil util;
	
	@Autowired
	LocationRepository repository;
	
	@Autowired
	ServletContext sc;

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}

	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		Location locationSaved = service.saveLocation(location);
		String msg = "Location saved with id :" + locationSaved.getId();
		modelMap.addAttribute("msg", msg);
		emailUtil.sendEmail("mailprogramxyz@gmail.com", "Location Saved " + locationSaved.getId(),
				"Hello, a new location saved with id " + locationSaved.getId() + " successfully !");
		return "createLocation";
	}

	@RequestMapping("/displayLocations")
	public String displayLocations(ModelMap modelMap) {
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations", locations);

		return "displayLocations";
	}

	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap) {
		// Location location = service.getLocationById(id);
		Location location = new Location();
		location.setId(id);
		service.deleteLocation(location);
		service.getAllLocations();
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations", locations);
		emailUtil.sendEmail("mailprogramxyz@gmail.com", "Location Deleted " + location.getId(),
				"Hello, a  location deleted with id " + location.getId() + " successfully !");
		return "displayLocations";
	}

	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id, ModelMap modelMap) {
		Location location = service.getLocationById(id);
		modelMap.addAttribute("location", location);
		return "updateLocation";
	}

	@RequestMapping("/updateLoc")
	public String updateLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations", locations);
		service.updateLocation(location);
		emailUtil.sendEmail("mailprogramxyz@gmail.com", "Location Updated " + location.getId(),
				"Hello, a  location updated with id " + location.getId() + " successfully !");
		return "displayLocations";
	}
	
	
	@RequestMapping("/generateReport")
	public String generateReport() {
		
		
		String path = sc.getRealPath("/");
		List<Object[]> data = repository.findTypeAndTypeCount();
		util.generatePiChart(path, data);
		return "report";
	}

}
