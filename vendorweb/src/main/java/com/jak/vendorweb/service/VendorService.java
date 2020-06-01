package com.jak.vendorweb.service;

import java.util.List;

import com.jak.vendorweb.entities.Vendor;

public interface VendorService {
	Vendor saveVendor(Vendor vendor);
	Vendor updateVendor(Vendor vendor);
	Vendor deleteVendor(Vendor vendor);
	Vendor getVendorById(int id);
	List<Vendor> getAllVendor();

}
