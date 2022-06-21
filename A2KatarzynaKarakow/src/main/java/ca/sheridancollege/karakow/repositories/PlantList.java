package ca.sheridancollege.karakow.repositories;

import java.util.List;

import ca.sheridancollege.karakow.beans.Plant;

public interface PlantList {

	public List<Plant> getPlantList();
	public void setPlantList(List<Plant> plantList);
	public void emptyList();
	
}
