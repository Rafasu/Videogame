import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

public class ClasePowerUp {

	// Dimensiones PowerUp
	public static final int WIDTH = 40;
	public static final int HEIGHT = 40;

	/*
	 * Posición inicial del PowerUp. Colocar obstaculos al inicio en y. Posición
	 * random en x.
	 */
	int y = 10;
	int x = ((int) (Math.random() * 350) + 1);

	public ClasePowerUp(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public ClasePowerUp move(int dx, int dy) {
		return new ClasePowerUp(x + dx, y + dy);
	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, WIDTH, HEIGHT);
	}

	public Point getLocation() {
		return new Point(x, y);
	}

	// Dibujar al PowerUp
	public void paint(Graphics g) {

		g.setColor(Color.red);
		g.fillRect(x, y, HEIGHT, WIDTH);
	}

	// Mover PowerUp
	public void CalcularPosY() {
		y += 1;
	}
}
