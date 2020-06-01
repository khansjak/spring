package com.jak.vendorweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jak.vendorweb.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
