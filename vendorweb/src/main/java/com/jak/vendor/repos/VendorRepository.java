package com.jak.vendor.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jak.vendor.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
