package com.jak.location.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jak.location.entities.Location;
import com.jak.location.repos.LocationRepository;

@RestController
@RequestMapping("/locations")
public class LocationRESTController {

	@Autowired
	LocationRepository repository;

	@GetMapping
	public List<Location> getLocations() {
		return repository.findAll();

	}

	@PostMapping
	public Location saveLocations(@RequestBody Location location) {
		return repository.save(location);

	}

	@PutMapping
	public Location updateLocations(@RequestBody Location location) {
		return repository.save(location);
	}

	@DeleteMapping("/{id}")
	public void deleteLocation(@PathVariable("id") int id) {
		repository.deleteById(id);
	}

	@GetMapping("/{id}")
	public Location getOneLocation(@PathVariable("id") int id) {
		return repository.findById(id).get();

	}

}
