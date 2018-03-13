import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class ClaseJugador {
	
	static int x = 200;
	static int y = 650;
	
	public void paint(Graphics g){
		
		
		g.setColor(Color.black);
		g.fillOval(x, y, 30, 30);
	}
	
	public void moverJugador(int key)
	{
		
		if(key  == KeyEvent.VK_LEFT)
		{
			if(x >= 5)
			{
				x += -1;
			}
			
		}
		
		if(key  == KeyEvent.VK_RIGHT)
		{
			if(x <= 355)
			{
				x += 1; 			
			}

		}
	}
}
