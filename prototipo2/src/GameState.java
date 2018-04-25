import java.awt.*;

interface GameState {

	public void load();

	public void jugar();

	public void pausa();

	public void end();

	public boolean finalizado();

	public void checkKeys();

	public void render(Graphics g);

	public void update();

	public GameState setState(GameStateContext gsc);
}