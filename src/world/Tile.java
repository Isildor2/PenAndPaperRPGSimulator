package world;

public class Tile {
	private int type;
	private int ownership = 0;
	private int unitsStationed = 0;
	private int resourceAmount;
	private int resourceType;
	private int buildingsAmount = 0;
	private int population;
	
	//test constructor
	public Tile(int type) {
		this.type=type;
		ownership = 0;
		unitsStationed = 0;
		resourceAmount=0;
		resourceType=0;
		buildingsAmount = 0;
		population=0;
	}
	public Tile(int type, int resourceType) {
		this.type=type;
		ownership = 0;
		unitsStationed = 0;
		resourceAmount=0;
		this.resourceType=resourceType;
		buildingsAmount = 0;
		population=0;
	}
	
	
	// Constructor for loading from file or similar
	public Tile(int type, int ownership, int unitsStationed, int resourceAmount, int resourceType, int buildingsAmount,
			int population) {
		this.type = type;
		this.ownership = ownership;
		this.unitsStationed = unitsStationed;
		this.resourceAmount = resourceAmount;
		this.resourceType = resourceType;
		this.buildingsAmount = buildingsAmount;
		this.population = population;
	}

	// constructor for generating tile from scratch
	public Tile(int type, int resourceAmount, int resourceType, int buildingsAmount, int population) {
		this.type = type;
		this.resourceAmount = resourceAmount;
		this.resourceType = resourceType;
		this.buildingsAmount = buildingsAmount;
		this.population = population;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getOwnership() {
		return ownership;
	}

	public void setOwnership(int ownership) {
		this.ownership = ownership;
	}

	public int getUnitsStationed() {
		return unitsStationed;
	}

	public void setUnitsStationed(int unitsStationed) {
		this.unitsStationed = unitsStationed;
	}

	public int getResourceAmount() {
		return resourceAmount;
	}

	public void setResourceAmount(int resourceAmount) {
		this.resourceAmount = resourceAmount;
	}

	public int getResourceType() {
		return resourceType;
	}

	public void setResourceType(int resourceType) {
		this.resourceType = resourceType;
	}

	public int getBuildingsAmount() {
		return buildingsAmount;
	}

	public void setBuildingsAmount(int buildingsAmount) {
		this.buildingsAmount = buildingsAmount;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

}