package main;

import testRenderer.ConsoleRenderer;
import world.Map;
import worldGenerator.LandCreator;
import worldGenerator.OceanCreator;

public class Main {
	public static void main(String[] args) {
		ConsoleRenderer rend=new ConsoleRenderer();
		LandCreator creator=new LandCreator();
		OceanCreator creatorW=new OceanCreator();
		Map tm=new Map(20,20);
		creator.createLandMass(3,tm);
		creator.createLandMass(1,tm,10,6,false);
		creator.createLandMass(1,tm,5,9,false);
		creator.createLandMass(1,tm,15,12,false);
		creator.createLandMass(1,tm,5,16,false);
		creator.createLandMass(1,tm,7,4,false);
		creator.createLandMass(2,tm,7,8,false);
		creator.createLandMass(1,tm,16,10,false);
		creator.createLandMass(1,tm,14,14,false);
		creatorW.createOcean(1, tm, 11, 9);
		creator.createLandMass(3,tm,19,15,false);
		//rend.render(tm);
		rend.showOnScreen(tm);
	}
}