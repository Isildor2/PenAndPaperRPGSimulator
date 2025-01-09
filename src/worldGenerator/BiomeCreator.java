package worldGenerator;

import java.util.Random;

import world.Map;
import world.Tile;

public class BiomeCreator {
	public void spreadBiomes(Map map) {
		Random r=new Random();
		
		for (int i=0;i<map.getHeight();i++) {
			for (int j=0;j<map.getWidth();j++) {
				if (map.getMap()[j][i].getResourceType()==3) {
					createMountain(map,r.nextInt(0,ShapeStorage.shapes2D.length),j,i,r.nextInt(1,3));
				} else if(map.getMap()[j][i].getResourceType()==2) {
					createForest(map,r.nextInt(0,ShapeStorage.shapes2D.length),j,i,r.nextInt(1,3));
				}
			}
		}
	}
	public void createMountain(Map map, int shape, int y,int x, int rotation) {
		for (int j=0;j<ShapeStorage.shapes2D[shape].length;j++) {
			for (int i=0;i<ShapeStorage.shapes2D[shape][j].length;i++) {
				if(ShapeStorage.shapes2D[shape][j][i]>0) {
					if(rotation==0) {
						if ((j+y)<map.getWidth()&(i+x)<map.getHeight()&map.getMap()[y+j][x+i].getType()>0) {
							map.setTile(j+y,i+x,new Tile(3,ShapeStorage.shapes2D[shape][j][i]));
						}
					} else if(rotation==1) {
						if ((j+y)<map.getWidth()&(i+x)<map.getHeight()) {
							if (map.getMap()[y+j][x+i].getType()>0) {
								map.setTile(j+y,i+x,new Tile(3,ShapeStorage.shapes2D[shape][j][i]));
							}
						}
					} else if(rotation==2) {
						if ((y-j)>=0&(x-i)>=0) {
							if (map.getMap()[y-j][x-i].getType()>0) {
								map.setTile(y-j,x-i,new Tile(3,ShapeStorage.shapes2D[shape][j][i]));
							}
						}
					}
				}
			}
		}
	}
	public void createForest(Map map, int shape, int y,int x, int rotation) {
		for (int j=0;j<ShapeStorage.shapes2D[shape].length;j++) {
			for (int i=0;i<ShapeStorage.shapes2D[shape][j].length;i++) {
				if(ShapeStorage.shapes2D[shape][j][i]>0) {
					if(rotation==0) {
						if ((j+y)<map.getWidth()&(i+x)<map.getHeight()&map.getMap()[y+j][x+i].getType()==1) {
							map.setTile(j+y,i+x,new Tile(2,ShapeStorage.shapes2D[shape][j][i]));
						}
					} else if(rotation==1) {
						if ((j+y)<map.getWidth()&(i+x)<map.getHeight()) {
							if (map.getMap()[y+j][x+i].getType()==1) {
								map.setTile(j+y,i+x,new Tile(2,ShapeStorage.shapes2D[shape][j][i]));
							}
						}
					} else if(rotation==2) {
						if ((y-j)>=0&(x-i)>=0) {
							if (map.getMap()[y-j][x-i].getType()==1) {
								map.setTile(y-j,x-i,new Tile(2,ShapeStorage.shapes2D[shape][j][i]));
							}
						}
					}
				}
			}
		}
	}
}