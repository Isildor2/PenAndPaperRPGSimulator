package worldGenerator;

public class ShapeStorage {

	static final int[][] shapes1D= {
		{1,2}, //1x2 with one node
		{2,2}, //2x2 with two nodes
		{1,2,1,1}, //1x4 with 1-node on index 2
		{2,1,1,1}, //1x4 with 1-node on index 1
		{}
	};
	public static final int[][][] shapes2D= {
			{{0,1},{2,1}}, //2x2 island with missing corner and a 1-node in a corner
			{{0,1},{1,2}}, //2x2 island with missing corner and a 1-node in the middle
			{{1,0},{1,2},{1,1},{0,1}}, //2x4 island with 2 missing corners and 1 1-node
			{{0,1,0},{2,1,1},{0,1,0}}, //3x3 island with rounded corners and 1 1-node
			{{0,1,0},{1,1,1},{0,1,0}}, //3x3 island with rounded corners and zero nodes
			{{0,1,0},{1,1,2},{3,1,1},{1,1,1},{0,1,0}}, //3x5 island with rounded corners and 1 1-node and 1 2-node
			{{0,1,2,0},{1,1,1,1},{2,1,1,1},{0,1,1,0}}, //4x4 island with rounded corners and 2 1-nodes
			{{0,1,1,0},{2,1,1,1},{1,1,1,2},{0,1,1,0}}, //4x4 island with rounded corners and 2 1-nodes
			{{0,2,1,0},{2,1,1,1},{1,1,3,1},{0,1,1,0}}, //4x4 island with rounded corners and 2 1-nodes and 1 2-node
			{{0,1,1,0},{2,1,1,1},{1,1,0,1},{0,1,2,0}}, //4x4 island with rounded corners and 2 1-nodes
			{{0,2,1,1,0},{2,1,1,1,1},{1,1,1,1,3},{1,1,1,1,1},{2,1,1,1,1},{1,1,1,1,1},{0,1,1,1,0}}, //5x7 island with 2 1-nodes and 1 2-node
			{{0,1,1,2,0},{2,1,1,1,1},{1,1,1,1,3},{1,1,1,1,1},{2,1,1,1,1},{1,1,1,1,1},{0,1,1,1,0}}, //5x7 island with 2 1-nodes and 1 2-node
			{{0,1,1,2,0},{2,1,1,1,1},{1,3,1,1,1},{1,0,1,1,1},{2,1,1,1,1},{1,1,1,1,1},{0,1,1,1,0}}, //5x7 island with 2 1-nodes and 1 2-node
			{{0,0,3,1,1,1,0,0},{0,1,1,1,1,1,1,0},{2,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1},{3,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1},{1,1,1,1,1,1,3,1},{1,1,1,1,1,1,1,1},{0,2,1,1,1,1,2,0},{0,0,1,1,1,1,0,0}}, //just massive test lol
			
			{{2,1},{1,1},{1,2}},
			{{1,1},{2,2},{1,1}},
			{{2,1},{1,1},{1,1}},
			{{1,1},{2,1},{1,1}},
			{{1,1},{1,1},{1,2}},
			{{1,1},{1,2},{1,1}},
			{{2,1,1},{1,1,1}},
			{{1,2,1},{1,1,1}}
			
	};
}