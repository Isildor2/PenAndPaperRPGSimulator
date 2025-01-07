package testRenderer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import world.Biomes;
import world.Map;

public class ConsoleRenderer {

	public void render(Map map) {
		for (int i=0;i<map.getMap().length;i++) {
			for (int j=0;j<map.getMap()[i].length;j++) {
				System.out.print(Biomes.getNameByValue(map.getMap()[i][j].getType())
						+"{"+map.getMap()[i][j].getResourceType()+"} ");
			}
			System.out.println("");
		}
		//showOnScreen(map);
	}
	public void showOnScreen(Map map) {
		JFrame window=new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout gl=new GridLayout(20,20);
		JPanel pl=new JPanel(gl);
		pl.setBackground(Color.DARK_GRAY);
		for (int i=0;i<map.getHeight();i++) {
			for (int j=0;j<map.getWidth();j++) {
				JLabel p=new JLabel();
				switch (map.getMap()[i][j].getType()) {
				case 0:
					p.setForeground(Color.BLUE);
					break;
				case 1:
					p.setForeground(Color.GREEN);
					break;
				case 2:
					p.setForeground(Color.LIGHT_GRAY);
					break;
				case 3:
					p.setForeground(Color.GRAY);
					break;
				}
				p.setText(""+map.getMap()[i][j].getType());
				p.setOpaque(true);
				p.setMinimumSize(new Dimension(20,20));
				pl.add(p);
			}
		}
		window.setSize(400, 400);
		window.add(pl);
		window.setResizable(false);
		window.setVisible(true);
		System.out.println(pl.getComponentCount());
	}
}