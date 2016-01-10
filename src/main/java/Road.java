/**
 * Created by user on 08.01.2016.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Road extends JPanel implements ActionListener{

	Timer mainTimer = new Timer (20,this);
	Image img = new ImageIcon ("D:\\Java_works\\Project\\GameRACE\\src\\main\\resources\\road.jpg").getImage();
	Player player =new Player ();

	Road(){
		mainTimer.start ();

	}

	public void paint(Graphics g){
		g = (Graphics2D)g;
		g.drawImage (img,player.layerOne,0,null);
		g.drawImage (img,player.layerTwo,0,null);
		g.drawImage (player.img,player.xPos,player.yPos,null);

	}

	public void actionPerformed (ActionEvent e) {
		player.move ();
		repaint ();
	}
}
