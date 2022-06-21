package ca.sheridancollege.karakow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ca.sheridancollege.karakow.beans.Plant;
import ca.sheridancollege.karakow.repositories.PlantList;

@Controller
public class PlantController {
	
	@Autowired
	private PlantList plantList;
	
	@GetMapping("/")
	public String goHome(Model model) {
		
		model.addAttribute("plant", new Plant());
		model.addAttribute("plantList", plantList);
		
		return "index";
	}
	
	@GetMapping("/addingPlant")
	public String addingPlant() {
		return "addingPlant";
	}
	
	@GetMapping("/searchPlant")
	public String searchPlant() {
		return "searchPlant";
	}
	
	@GetMapping("/displayPlants")
	public String displayPlants() {
		return "displayPlants";
	}
	
	
	@PostMapping("/addPlant")
	public String addPlant(Model model, @ModelAttribute Plant plant) {
		
		plantList.getPlantList().add(plant);
		
		model.addAttribute("plant", new Plant());
		model.addAttribute("plantList", plantList);
		
		return "displayPlants";
		
	}
	
}
