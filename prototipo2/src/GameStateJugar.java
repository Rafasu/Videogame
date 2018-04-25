import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.Vector;

public class GameStateJugar implements GameState {

    long startTime = System.nanoTime() ;
	GameStateContext gsc;
	static final int PWIDTH = 400, PHEIGHT = 700;
    private Vector<ClaseObstaculo> bricks = new Vector();
    long elapsedTime = System.nanoTime() - startTime;
    public int points = 0;
	
	
	public GameStateJugar(GameStateContext gsc) {
		this.gsc = gsc; 
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
		gsc.setCurrent(gsc.getEnd());
	}


	@Override
	public void checkKeys() {
		// TODO Auto-generated method stub
		int key = gsc.keyCode;
		
		if(key == KeyEvent.VK_P)
		{
			pausa();
		}
		else if(key  == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)
		{
			gsc.player.moverJugador(key);
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
                
		g.setColor(Color.green);
		g.fillRect(0,0,PWIDTH,PHEIGHT);
		g.setColor(Color.black);
		g.drawString("¡Estás jugando!", 100, 60);
		gsc.player.paint(g);
		gsc.juego.paint(g);
               
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
        double seconds = (double)elapsedTime / 1000000000.0 ;
        
        if(gsc.player.vidas > 0)
        {
        		checkKeys();
            gsc.juego.update();
            if(gsc.juego.checkCollision())
            {
            		gsc.player.vidas--;
            }
            points = gsc.juego.points;
        }
        else
        {
        		end();
        }

	}


	@Override
	public void pausa() {
		// TODO Auto-generated method stub
		gsc.setCurrent(gsc.getPausa());
	}


	@Override
	public boolean finalizado() {
		// TODO Auto-generated method stub
		return false;
	}
        
    public void createObstaculos(){
          
            
    }

}

