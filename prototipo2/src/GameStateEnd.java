import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class GameStateEnd implements GameState {

	GameStateContext gsc;
	static final int PWIDTH = 400, PHEIGHT = 700;

	public GameStateEnd() {

	}

	public GameState setState(GameStateContext gsc) {
		this.gsc = gsc;
		return null;
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub

	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void end() {
		// TODO Auto-generated method stub

	}

	public void checkKeys() {

		int key = gsc.keyCode;

		if (key == KeyEvent.VK_I) {
			jugar();
		} else if ((key == KeyEvent.VK_ESCAPE) || (key == KeyEvent.VK_Q) || (key == KeyEvent.VK_END)) {
			gsc.setCurrent(gsc.getFinalizado());
		}
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub

		if (g != null) {
			g.setColor(Color.white);
			g.fillRect(0, 0, PWIDTH, PHEIGHT);
			g.setColor(Color.black);
			g.drawString("¡Has perdido!", 100, 60);
			g.drawString("Tus puntos totales son: " + gsc.juego.points, 100, 80);
		}
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		checkKeys();
	}

	@Override
	public void pausa() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean finalizado() {
		// TODO Auto-generated method stub
		return false;
	}
}
