package testLoader;

import world.Map;
import world.Tile;

public class MapLoader {
	public Map setMap() {
		Tile[][] map=new Tile[10][15];
		for (int i=0;i<map.length;i++) {
			for (int j=0;j<map[i].length;j++) {
				if (j<=2) {
					map[i][j]=new Tile(0,0);
				} else {
					if (i>2) {
						map[i][j]=new Tile(1,2);
					} else {
						map[i][j]=new Tile(2,1);
					}
				}
			}
		}
		Map tm=new Map();
		tm.setMap(map);
		return tm;
	}
}