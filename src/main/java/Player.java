/**
 * Created by user on 09.01.2016.
 */
import javax.swing.*;
import java.awt.*;


public class Player {


	Image img = new ImageIcon ("D:\\Java_works\\Project\\GameRACE\\src\\main\\resources\\2_4.png").getImage();

	int speed =5;// ��������
	int acceleration = 0;//���������
	int distance = 0;//��������� ����
	//���������� ��������� ������
	int xPos=50;
	int yPos=300;

	int layerOne = 0;//���� ��������� ������ ��� �������� ����������� ������ ��������
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
