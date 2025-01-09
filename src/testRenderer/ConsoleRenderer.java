package testRenderer;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
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
		GridLayout gl=new GridLayout(map.getHeight(),map.getWidth());
		JPanel pl=new JPanel(gl);
		pl.setBackground(Color.WHITE);
		for (int i=0;i<map.getHeight();i++) {
			for (int j=0;j<map.getWidth();j++) {
				JLabel p=new JLabel();
				switch (map.getMap()[j][i].getType()) {
				case 0:
					p.setForeground(Color.BLUE);
					p.setBackground(Color.BLUE);
					break;
				case 1:
					p.setForeground(Color.GREEN);
					p.setBackground(Color.GREEN);
					break;
				case 2:
					p.setForeground(new Color(24,107,46));
					p.setBackground(new Color(24,107,46));
					break;
				case 3:
					p.setForeground(Color.GRAY);
					p.setBackground(Color.GRAY);
					break;
				}
				p.setText(""+map.getMap()[j][i].getResourceType());
				p.setOpaque(true);
				pl.add(p);
				
			}
		}
		window.setSize(12*map.getWidth(),
				12*map.getHeight());
		window.add(pl);
		window.setResizable(false);
		window.setVisible(true);
	}
}