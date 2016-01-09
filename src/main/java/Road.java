/**
 * Created by user on 08.01.2016.
 */
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class Road extends JPanel {

	Image img = new ImageIcon ("D:\\Java_works\\Project\\GameRACE\\src\\main\\resources\\road.jpg").getImage();

	public void paint(Graphics g){
		g = (Graphics2D)g;
		g.drawImage (img,0,0,null);

	}

}
