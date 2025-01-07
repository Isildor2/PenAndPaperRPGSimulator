package world;

public class Map {
	private Tile[][] map;
	//to be used for map creation (todo)
	private int seed;
	
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