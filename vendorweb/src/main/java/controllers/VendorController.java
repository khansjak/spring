package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jak.vendor.service.VendorService;

@Controller
public class VendorController {
	
	@Autowired
	VendorService service;
	
	@RequestMapping("/showCreate")
	public String viewCreateVendor() {
		return "viewCreateVendor";
	}
	

}
