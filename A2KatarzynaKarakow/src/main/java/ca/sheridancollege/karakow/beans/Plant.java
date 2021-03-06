package ca.sheridancollege.karakow.beans;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Plant implements Serializable{

	private String plantName;
	private String platntType;
	private Date dateOfProduction;
	private String nameOfSupplier;
	private Long quantity;
	private double amountPaid;
	
	private final String[] plantTypes = {"Annuals", "Aquatic Plants", "Bamboos", "Bulbs", "Cactus", 
			"Climbers", "Conifers", "Ferns", "Fruit", "Herbs", "Ornamental Grasses", "Perennials", 
			"Roses", "Shrubs", "Trees", "Palms", "Orchids"};

}
