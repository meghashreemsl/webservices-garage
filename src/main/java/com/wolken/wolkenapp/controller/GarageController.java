package com.wolken.wolkenapp.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wolken.wolkenapp.dto.VehicleDTO;

@RestController
@RequestMapping("/")
public class GarageController {
	
	VehicleDTO dto = new VehicleDTO();
	 public GarageController() {
		 dto.setColor("red");
		 dto.setId(1);
		 dto.setNoOfWheels(4);
		 dto.setType("car");
	 }
	 @GetMapping("/getAll")
	 public VehicleDTO  getAll() {
		 return dto;
	 }
	 @PostMapping("/save")
	 public String  save() {
		 return "data saved";
	 }
	 
	 @PutMapping("/update")
		public String update(@RequestBody VehicleDTO dto)
		{
			return "updated "+ dto.getType()+" "+ dto.getColor();
		}

		@DeleteMapping("/delete")
		public String del(@RequestBody VehicleDTO dto)
		{
			return "deleted " + dto.getType()+" "+ dto.getColor();
		}
}
	
	


