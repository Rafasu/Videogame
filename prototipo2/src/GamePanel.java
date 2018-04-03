import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//GamePanel
public class GamePanel extends JPanel implements Runnable {

 private static final long serialVersionUID = 3773715155102823112L;
	
        //Tamanio del tablero
	static final int PWIDTH = 400, PHEIGHT = 700;
	private Thread animator;
	private volatile boolean running = false;
	private volatile boolean gameOver = false;
	
        //Variable del gamecontext
        private GameStateContext context;
	
	public static void main(String args[]){
		JFrame app = new JFrame("Prototipo2");
		app.getContentPane().add(new GamePanel(), BorderLayout.CENTER);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.pack();
		app.setResizable(false);  
		app.setVisible(true);
	}
	
	public GamePanel(){
		setBackground(Color.black);
		setPreferredSize(new Dimension(PWIDTH,PHEIGHT));
		setFocusable(true);
		requestFocus();
		readyForTermination();
		context = new GameStateContext();
	}
	
	public void addNotify(){
		super.addNotify();
		startGame();
	}
	
	private void startGame(){
		if(animator == null || !running){
			animator = new Thread(this);
			animator.start();
		}
	}
	
	public void stopGame(){
		running = false;
	}

	public void run(){
		
		while(!context.finalizado()){
			gameUpdate();
			gameRender();
			paintScreen();
			try{
				Thread.sleep(15);
			}catch(InterruptedException ex){}
		}
                
		System.exit(0);
	}
	
	private void gameUpdate(){
		context.update();
		if(gameOver){	
			stopGame();
		}
	}
	
	private Graphics dbg;
	private Image dbImage = null;
	
	private void gameRender(){
		if(dbImage == null){
			dbImage = createImage(PWIDTH,PHEIGHT);
			if(dbImage == null){
				System.out.println("dbImage is null");
				return;
			}else{
				dbg = dbImage.getGraphics();
			}
		}
		dbg.setColor(Color.black);
		dbg.fillRect(0,0,PWIDTH,PHEIGHT);
		context.render(dbg);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		if(dbImage != null) {
			g.drawImage(dbImage, 0, 0, null);
		}
	}
	
	private void readyForTermination() {
		addKeyListener( new KeyAdapter() { 
			
			public void keyPressed(KeyEvent e) { 
				int keyCode = e.getKeyCode();
				
				context.checkKeys(keyCode);
			} 
			});
	} 
	
	private void paintScreen(){
		Graphics g;
		try{
			g = this.getGraphics();
			if((g != null) && (dbImage != null))
				g.drawImage(dbImage,0,0,null);
			Toolkit.getDefaultToolkit().sync();
			g.dispose();
		}
		catch(Exception e){
			System.out.println("Graphics context error: "+e);
		}
	}
}
    
}