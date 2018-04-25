import java.awt.Graphics;

public class GameStateFinalizado implements GameState {

	GameStateContext gsc;
	
	public GameStateFinalizado() {

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
	public void pausa() {
		// TODO Auto-generated method stub

	}

	@Override
	public void end() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean finalizado() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void checkKeys() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
