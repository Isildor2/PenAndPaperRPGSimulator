package world;

public class Map {
	private Tile[][] map;
	//to be used for map creation (todo)
	private int seed;
	
	/*
	 * How the map is structured:
	 * Map holds seed and tiles for now
	 * width of map=number of 1d arrays in the 2d array (map.length())
	 * height of map=length of the 1d arrays (map[x].length())
	 */
	
	
	public Map() {}
	public Map(int width,int height) {
		map=new Tile[width][height];
	}
	
	
	
	public Tile[][] getMap() {
		return map;
	}

	public void setMap(Tile[][] map) {
		this.map = map;
	}
	public void setTile(int x,int y,Tile tile) {
		map[x][y]=tile;
	}

	public int getSeed() {
		return seed;
	}

	public void setSeed(int seed) {
		this.seed = seed;
	}
	public int getWidth() {
		return this.map.length;
	}
	public int getHeight() {
		return this.map[1].length;
	}

}