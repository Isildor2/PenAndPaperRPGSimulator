package worldGenerator;

import world.Map;
import world.Tile;

public class LandCreator {
	
	/*creates a connected piece of land
	*size is passed as int, with values as follows
	* 1 small island x-x tiles
	* 2 big island x-x tiles
	* 3 continent x+ tiles
	*/
	public void createLandMass(int size, Map map) {
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
	public void createLandMass(int size, Map map,int y,int x,boolean deleteLand) {
		for (int i=0;i<map.getHeight();i++) {
			for (int j=0;j<map.getWidth();j++) {
				if (distanceToGenerationOrigin(y,x,i,j)<size*1.5) {
					map.setTile(i,j,new Tile(1,3));	
				} 
				if (deleteLand==true) {
					map.setTile(i,j,new Tile(0,1));
				}
			}
		}
	}
	int distanceToGenerationOrigin(int y,int x,int yC,int xC) {
		return (int) (Math.sqrt((xC-x)*(xC-x)+(yC-y)*(yC-y)));
	}
	
}