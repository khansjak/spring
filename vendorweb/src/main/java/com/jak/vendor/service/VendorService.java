package com.jak.vendor.service;

import java.util.List;

import com.jak.vendor.entities.Vendor;

public interface VendorService {
	Vendor savevendor(Vendor vendor);
	Vendor updateVendor(Vendor vendor);
	void deleteVendor(Vendor vendor);
	Vendor getVendorById(int id);
	List<Vendor> getAllVendors();
	

}
