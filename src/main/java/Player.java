/**
 * Created by user on 09.01.2016.
 */
import javax.swing.*;
import java.awt.*;


public class Player {


	Image img = new ImageIcon ("D:\\Java_works\\Project\\GameRACE\\src\\main\\resources\\2_4.png").getImage();

	int speed =5;// скорость
	int acceleration = 0;//ускорение
	int distance = 0;//пройденый путь
	//координаты положения машины
	int xPos=50;
	int yPos=300;

	int layerOne = 0;//слой отрисовки дороги для придания визуального эфекта движения
	int layerTwo=1000;

	public void move(){
		distance+=speed;

		if(layerTwo-speed<=0){
			layerOne=0;
			layerTwo=1000;
		}else {
		layerOne-=speed;
		layerTwo-=speed;
	}
	}
}
