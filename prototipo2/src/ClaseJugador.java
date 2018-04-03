import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class ClaseJugador {

    /*Posición inicial del jugador. 
        Colocar al jugador en medio de la pantalla
    */
	static int x = 200;
	static int y = 650;
        public static final int RADIUS = 25;
        
	
        //Dibujar al jugador
	public void paint(Graphics g){
		g.setColor(Color.black);
		g.fillOval(x, y, RADIUS, RADIUS);
	}
	
        //Mover al jugador
	public void moverJugador(int key)
	{	
		if(key  == KeyEvent.VK_LEFT)
		{
			if(x >= 5)
			{
				x += -5;
			}
		}
		
		if(key  == KeyEvent.VK_RIGHT)
		{
			if(x <= 355)
			{
                            x += 5; 			
			}

		}
	}
        
    public Point getLocation()
    {
        return new Point(x,y);
    }
        
}