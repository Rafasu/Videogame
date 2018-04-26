import java.awt.Graphics;

public class GameStateContext {

	private GameState gc;
	private GameStateFactory factory = GameStateFactory.getInstance();
	int keyCode;
	//public ClaseJugador player;
	public FallEngine juego;

	public GameStateContext() {

		gc = factory.getState(1);
		gc.setState(this);
		//player = new ClaseJugador();
		juego = new FallEngine();
	}

	public GameState getLoad() {
		gc = factory.getState(1);
		gc.setState(this);
		return gc;
	}

	public GameState getJugar() {
		gc = factory.getState(2);
		gc.setState(this);
		return gc;
	}

	public GameState getEnd() {
		gc = factory.getState(3);
		gc.setState(this);
		return gc;
	}

	public GameState getPausa() {
		gc = factory.getState(4);
		gc.setState(this);
		return gc;
	}

	public GameState getFinalizado() {
		gc = factory.getState(5);
		gc.setState(this);
		return gc;
	}

	public GameState getGc() {
		return gc;
	}

	public void setCurrent(GameState gs) {
		gc = gs;
	}

	public void checkKeys(int keyCode) {

		this.keyCode = keyCode;

	}

	public void load() {
		gc.load();
	}

	public void jugar() {
		gc.jugar();
	}

	public void end() {
		gc.end();
	}

	public boolean finalizado() {
		return gc.finalizado();
	}

	public void update() {
		gc.update();
	}

	public void render(Graphics g) {
		gc.render(g);
	}
}
