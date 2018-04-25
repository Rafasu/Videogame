import java.awt.Graphics;

public class GameStateContext {
	
        //long startTime = System.nanoTime() ;
	private GameState gc; 
	private GameStateFactory factory = GameStateFactory.getInstance(); 
	int keyCode;
	public ClaseJugador player;
	public ClaseObstaculo obstaculo;
    public FallEngine juego;
        
        //long elapsedTime = System.nanoTime() - startTime;
	
	public GameStateContext() {
		gc = factory.getState(1,this);
		player = new ClaseJugador();
		//obstaculo = new ClaseObstaculo();
        juego = new FallEngine() ;
	}
       
	
	public GameState getLoad(){
		return factory.getState(1, this);
	}
	public GameState getJugar(){
		return factory.getState(2, this);
	}

	public GameState getEnd(){
		return factory.getState(3, this);
	}
	
	public GameState getPausa(){
		return factory.getState(4, this);
	}
	
	public GameState getFinalizado(){
		return factory.getState(5, this);
	}
	
	public GameState getGc() {
		return gc;
	}
	
	public void setCurrent(GameState gs){
		gc = gs;
	}
	
	public void checkKeys(int keyCode) {
		
		this.keyCode = keyCode;
		
	}
	
	public void load(){
		gc.load();
	}
	
	public void jugar(){
		gc.jugar();
	}
	
	public void end(){
		gc.end();
	}
	
	public boolean finalizado()
	{
		return gc.finalizado();
	}
	
	public void update() {
		gc.update();
	}
	
	public void render(Graphics g){
		gc.render(g);
	}
}
