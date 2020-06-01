package com.jak.vendorweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jak.vendorweb.entities.Vendor;
import com.jak.vendorweb.service.VendorService;

@Controller
public class VendorController {
	@Autowired
	VendorService service;

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createVendor";
	}

	@RequestMapping("/saveVen")
	public String saveVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap model) {
		Vendor savedVendor = service.saveVendor(vendor);
		String msg = "Vendor with vendor id " + savedVendor.getId() + " saved successfully !";
		model.addAttribute("msg", msg);
		return "createVendor";

	}

	@RequestMapping("/displayVendors")
	public String displayVendor(ModelMap model) {
		List<Vendor> vendors = service.getAllVendor();
		model.addAttribute("vendors", vendors);

		return "displayVendors";

	}

	@RequestMapping("/deleteVendor")
	public String deleteVendor(@RequestParam("id") int id, ModelMap model) {
		Vendor vendor = new Vendor();
		vendor.setId(id);
		service.deleteVendor(vendor);
		List<Vendor> vendors = service.getAllVendor();
		model.addAttribute("vendors", vendors);
		return "displayVendors";

	}

	@RequestMapping("/editVendor")
	public String editVendor(@RequestParam("id") int id, ModelMap model) {
		Vendor vendor = service.getVendorById(id);
		model.addAttribute("vendor", vendor);
		return "editVendor";
	}

	@RequestMapping("/updateVendor")
	public String updateVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap model) {
		List<Vendor> vendors = service.getAllVendor();
		model.addAttribute("vendors", vendors);
		service.updateVendor(vendor);
		return "displayVendors";

	}

}
