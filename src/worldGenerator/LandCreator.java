package worldGenerator;

import world.Map;
import world.Tile;

public class LandCreator {
	
	/*
	*
	*/
	public void createLandMass(int size, Map map) {
		int y=map.getHeight()/2;
		int x=map.getWidth()/2;
		for (int i=0;i<map.getHeight();i++) {
			for (int j=0;j<map.getWidth();j++) {
				if (distanceToGenerationOrigin(y,x,i,j)>=size*1.5) {
					map.setTile(j,i,new Tile(0,0));
				} else {
					map.setTile(j,i,new Tile(1,1));	
				}
			}
		}
	}
	public void createLandMass(int size, Map map,int x,int y,boolean deleteLand) {
		for (int i=0;i<map.getHeight();i++) {
			for (int j=0;j<map.getWidth();j++) {
				if (distanceToGenerationOrigin(y,x,j,i)<size*1.5) {
					map.setTile(j,i,new Tile(1,1));	
				} 
				if (deleteLand==true) {
					map.setTile(j,i,new Tile(0,0));
				}
			}
		}
	}
	int distanceToGenerationOrigin(int y,int x,int yC,int xC) {
		return (int) (Math.sqrt((xC-x)*(xC-x)+(yC-y)*(yC-y)));
	}
	
	
	public void createLandMass(Map map, int shape, int y,int x, boolean deleteLand) {
		for (int j=0;j<ShapeStorage.shapes2D[shape].length;j++) {
			for (int i=0;i<ShapeStorage.shapes2D[shape][j].length;i++) {
				if(ShapeStorage.shapes2D[shape][j][i]>0) {
					if ((j+y)<map.getWidth()&(i+x)<map.getHeight()) {
						map.setTile(j+y,i+x,new Tile(1,ShapeStorage.shapes2D[shape][j][i]));
					}
				}
				if (deleteLand==true) {
					map.setTile(j+y,i+x,new Tile(0,0));
				}
			}
		}
	}
	public void createLandMass(Map map, int shape, int y,int x, boolean deleteLand, int rotation) {
		for (int j=0;j<ShapeStorage.shapes2D[shape].length;j++) {
			for (int i=0;i<ShapeStorage.shapes2D[shape][j].length;i++) {
				if(ShapeStorage.shapes2D[shape][j][i]>0) {
					if(rotation==0) {
						if ((j+y)<map.getWidth()&(i+x)<map.getHeight()) {
							map.setTile(j+y,i+x,new Tile(1,ShapeStorage.shapes2D[shape][j][i]));
						}
					} else if(rotation==1) {
						if ((j+y)<map.getWidth()&(i+x)<map.getHeight()) {
							map.setTile(j+y,i+x,new Tile(1,ShapeStorage.shapes2D[shape][j][i]));
						}
					} else if(rotation==2) {
						if ((y-j)>=0&(x-i)>=0) {
							map.setTile(y-j,x-i,new Tile(1,ShapeStorage.shapes2D[shape][j][i]));
						}
					}
				}
				if (deleteLand==true) {
					map.setTile(j+y,i+x,new Tile(0,0));
				}
			}
		}
	}
	
}