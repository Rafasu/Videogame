import java.awt.Color;
import java.awt.Graphics;

public class ClaseObstaculo {

	static int y = 10;
	static int x = ((int)(Math.random() * 350) + 1);;
	
	
	public void paint(Graphics g){

		g.setColor(Color.blue);
		g.fillRect(x, y, 30, 30);
	}

	public void CalcularPosY()
	{
		y += 1;
	}
}
