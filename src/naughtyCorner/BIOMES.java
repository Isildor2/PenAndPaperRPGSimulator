package naughtyCorner;

public enum BIOMES {
	/*
	WATER(0),
	PLAINS(1),
	FOREST(2),
	MOUNTAINS(3);
	
	private final int id;
	BIOMES(int newid) {
		id=newid;
	}
	public int getID() {
		return id;
	}
	*/
	
	0("Ocean"),
	1("Plains"),
	2("Forest"),
	3("Mountains");
	private final String name;
	BIOMES(String nnames) {
		name=nnames;
	}
	public String getName() {
		return name;
	}
	
}
