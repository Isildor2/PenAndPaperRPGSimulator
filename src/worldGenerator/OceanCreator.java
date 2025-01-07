package worldGenerator;

import world.Map;
import world.Tile;

public class OceanCreator {
	public void createOcean(int size, Map map) {
		int y=map.getHeight()/2;
		int x=map.getWidth()/2;
		for (int i=0;i<map.getHeight();i++) {
			for (int j=0;j<map.getWidth();j++) {
				if (distanceToGenerationOrigin(y,x,i,j)>=size*1.5) {
					map.setTile(i,j,new Tile(0,1));
				} else {
					map.setTile(i,j,new Tile(1,3));	
				}
			}
		}
	}
	public void createOcean(int size, Map map,int y,int x) {
		for (int i=0;i<map.getHeight();i++) {
			for (int j=0;j<map.getWidth();j++) {
				if (distanceToGenerationOrigin(y,x,i,j)<=size) {
					map.setTile(i,j,new Tile(0,0));	
				}
			}
		}
	}
	int distanceToGenerationOrigin(int y,int x,int yC,int xC) {
		return (int) (Math.sqrt((xC-x)*(xC-x)+(yC-y)*(yC-y)));
	}
}
