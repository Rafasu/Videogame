import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class GameStatePausa implements GameState {

	GameStateContext gsc;
	
	public GameStatePausa(GameStateContext gsc) {
		this.gsc = gsc; 
	}
	
	@Override
	public void load() {
		// TODO Auto-generated method stub

	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		gsc.setCurrent(gsc.getJugar());
	}

	@Override
	public void pausa() {
		// TODO Auto-generated method stub

	}

	@Override
	public void end() {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkKeys() {
		// TODO Auto-generated method stub
		int key = gsc.keyCode;
		
		if(key == KeyEvent.VK_R)
		{
			jugar();
		}
		else if ((key == KeyEvent.VK_ESCAPE) ||
				(key == KeyEvent.VK_Q) ||
				(key == KeyEvent.VK_END)) {
			gsc.setCurrent(gsc.getFinalizado());
			}
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		
		g.setColor(Color.white);
		g.drawString("¡Estás en Pausa!", 100, 60);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		checkKeys();
	}

	@Override
	public boolean finalizado() {
		// TODO Auto-generated method stub
		return false;
	}

}
