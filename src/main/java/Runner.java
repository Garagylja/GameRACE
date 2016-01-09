/**
 * Created by user on 02.12.2015.
 */
import javax.swing.*;

public class Runner {

	public static void main (String[] args) {
		JFrame frame = new javax.swing.JFrame ("Java Race");
		frame.setDefaultCloseOperation (javax.swing.JFrame.EXIT_ON_CLOSE);
		frame.setSize (850,750);

		frame.add (new Road ());

		frame.setVisible (true);


	}
}
