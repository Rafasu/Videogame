import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class ClaseJugador {

	/*
	 * Posición inicial del jugador. Colocar al jugador en medio de la pantalla
	 */
	static int x = 200;
	static int y = 650;
	public static final int RADIUS = 25;
	public int vidas;
	
	public ClaseJugador()
	{
		setVidas(3);
	}
	
	public void setVidas(int vidas)
	{
		this.vidas = vidas;
	}
	
	public int getVidas()
	{
		return vidas;
	}
	
	// Mover al jugador
	public void moverJugador(int key) {
		if (key == KeyEvent.VK_LEFT) {
			if (x >= 5) {
				x += -5;
			}
		}

		if (key == KeyEvent.VK_RIGHT) {
			if (x <= 355) {
				x += 5;
			}
		}
	}
	
	// Dibujar al jugador
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillOval(x, y, RADIUS, RADIUS);
		g.drawString("Vidas: " + vidas, 320, 20);
		//System.out.println("Vidas en  ClaseJugador = "+vidas);
	}


	public Rectangle getBounds() {
		return new Rectangle(x, y, 25, 25);
	}

}