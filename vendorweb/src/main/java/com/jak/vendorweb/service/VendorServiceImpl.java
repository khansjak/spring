package com.jak.vendorweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jak.vendorweb.entities.Vendor;
import com.jak.vendorweb.repos.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService {
	
	@Autowired
	VendorRepository repository;
	

	@Override
	public List<Vendor> getAllVendor() {
		
		return repository.findAll();
	}
	

	@Override
	public Vendor saveVendor(Vendor vendor) {
		
		return repository.save(vendor);
	}





	@Override
	public Vendor updateVendor(Vendor vendor) {
		
		return repository.save(vendor);
	}

	@Override
	public  Vendor deleteVendor(Vendor vendor) {
		repository.delete(vendor);
		return vendor;

	}

	@Override
	public Vendor getVendorById(int id) {
		return repository.findById(id).get();
	}


	public VendorRepository getRepository() {
		return repository;
	}


	public void setRepository(VendorRepository repository) {
		this.repository = repository;
	}

	
	
	

}
