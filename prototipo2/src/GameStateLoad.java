import java.awt.Color;
import java.awt.Graphics;
//import java.awt.Toolkit;
import java.awt.event.KeyEvent;

public class GameStateLoad implements GameState{
	
	GameStateContext gsc;
	static final int PWIDTH = 400, PHEIGHT = 700;
	
	public GameStateLoad(GameStateContext gsc) {
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
	public void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkKeys() {

		int key = gsc.keyCode;
		
		if(key == KeyEvent.VK_I)
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
		
		if(g != null)
		{
			g.setColor(Color.white);
			g.fillRect(0,0,PWIDTH,PHEIGHT);
			g.setColor(Color.black);
			g.drawString("¡SUERTE!", 100, 60);
		}
	}

	@Override
	public void update() {
		
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


