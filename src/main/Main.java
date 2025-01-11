package main;

import java.util.ArrayList;
import java.util.Random;

import testRenderer.ConsoleRenderer;
import world.Map;
import worldGenerator.BiomeCreator;
import worldGenerator.LandCreator;
import worldGenerator.OceanCreator;
import worldGenerator.ShapeStorage;

public class Main {
	public static void main(String[] args) {
		ConsoleRenderer rend=new ConsoleRenderer();
		LandCreator creator=new LandCreator();
		OceanCreator creatorW=new OceanCreator();
		BiomeCreator creatorB=new BiomeCreator();
		Map tm=new Map(200,150);
		creator.createLandMass(0,tm);
		
		int MOD=3;
		int depth=10;
		rGA(tm, creator,creatorB,depth,MOD);
		/*
		creator.createLandMass(tm, 0, 100, 20,false);
		creator.createLandMass(tm, 2, 100, 28,false);
		creator.createLandMass(tm, 4, 100, 36,false);
		creator.createLandMass(tm, 5, 100, 44,false);
		creator.createLandMass(tm, 6, 100, 52,false);
		creator.createLandMass(tm, 1, 110, 20,false);
		creator.createLandMass(tm, 3, 110, 28,false);
		creator.createLandMass(tm, 4, 110, 36,false);
		creator.createLandMass(tm, 7, 110, 44,false);
		creator.createLandMass(tm, 6, 110, 52,false);
		ArrayList<int[]> aGO=new ArrayList<>();
		for (int i=0;i<tm.getHeight();i++) {
			for (int j=0;j<tm.getWidth();j++) {
				if (tm.getMap()[j][i].getResourceType()>1) {
					aGO.add(new int[]{j,i});
				}
			}
		}
		for (int i=0;i<aGO.size();i++) {
			creator.createLandMass(tm,tm.getMap()[aGO.get(i)[0]][aGO.get(i)[1]].getResourceType(), aGO.get(i)[0], aGO.get(i)[1], false);
			tm.getMap()[aGO.get(i)[0]][aGO.get(i)[1]].setResourceType(1);
		}
		aGO.clear();
		for (int i=0;i<tm.getHeight();i++) {
			for (int j=0;j<tm.getWidth();j++) {
				if (tm.getMap()[j][i].getResourceType()>1) {
					aGO.add(new int[]{j,i});
				}
			}
		}
		for (int i=0;i<aGO.size();i++) {
			creator.createLandMass(tm,tm.getMap()[aGO.get(i)[0]][aGO.get(i)[1]].getResourceType(), aGO.get(i)[0], aGO.get(i)[1], false);
		}
		/*
		for (int i=0;i<tm.getHeight();i++) {
			for (int j=0;j<tm.getWidth();j++) {
				if (tm.getMap()[j][i].getResourceType()>1) {
					creator.createLandMass(tm,7, j, i,false);
				} 
			}
		}
		*/
		//rend.render(tm);
		rend.showOnScreen(tm);
		OLBDistribution(tm);
		
	}
	private static void rGA(Map tm, LandCreator creator, BiomeCreator creatorB,int depth, int MOD) {
		/*
		creator.createLandMass(tm, 8, 60, 20,false);
		creator.createLandMass(tm, 7, 100, 28,false);
		creator.createLandMass(tm, 5, 80, 36,false);
		creator.createLandMass(tm, 3, 45, 44,false);
		creator.createLandMass(tm, 6, 70, 52,false);
		*/
		int rGOC=380;
		Random random=new Random();
		ArrayList<int[]> rGA=new ArrayList<>();
		for (int i=0;i<rGOC;i++) {
			rGA.add(new int[]{random.nextInt(0,tm.getWidth()),random.nextInt(0,tm.getHeight())});
		}
		for (int i=0;i<rGA.size();i++) {
			creator.createLandMass(tm, random.nextInt(0,ShapeStorage.shapes2D.length), rGA.get(i)[0], rGA.get(i)[1], false);
		}
		
		for(int d=0;d<depth;d++) {
			ArrayList<int[]> aGO=new ArrayList<>();
			for (int i=0;i<tm.getHeight();i++) {
				for (int j=0;j<tm.getWidth();j++) {
					if (tm.getMap()[j][i].getResourceType()>1) {
						aGO.add(new int[]{j,i});
					}
				}
			}
			for (int i=0;i<aGO.size();i++) {
				creator.createLandMass(tm,tm.getMap()[aGO.get(i)[0]][aGO.get(i)[1]].getResourceType()+MOD, aGO.get(i)[0], aGO.get(i)[1], false,random.nextInt(1,3));
				if(tm.getMap()[aGO.get(i)[0]][aGO.get(i)[1]].getResourceType()>1) {
					tm.getMap()[aGO.get(i)[0]][aGO.get(i)[1]].setResourceType(tm.getMap()[aGO.get(i)[0]][aGO.get(i)[1]].getResourceType()-1);
				}
			}
			MOD=+2;
			aGO.clear();
		}
		creatorB.spreadBiomes(tm);
		/* marked all the rGO in black
		for (int i=0;i<rGOC;i++) {
			rGA.add(new int[]{random.nextInt(5,115),random.nextInt(5,70)});
			tm.getMap()[rGA.get(i)[0]][rGA.get(i)[1]].setType(3);
		}
		*/
	}
	private static void OLBDistribution(Map map) {
		double o=0;
		double l=0;
		double f=0;
		double m=0;
		for (int i=0;i<map.getHeight();i++) {
			for (int j=0;j<map.getWidth();j++) {
				switch (map.getMap()[j][i].getType()) {
				case 0:
					o++;
					break;
				case 1:
					l++;
					break;
				case 2:
					f++;
					break;
				case 3:
					m++;
				}
			}
		}
		System.out.println(((l+f+m)/(map.getWidth()*map.getHeight()))+" :land vs map");
		System.out.println((f/(l+f+m))+" :forest vs land");
		System.out.println(m/(l+f+m)+" :mountain vs land");
	}
	
}