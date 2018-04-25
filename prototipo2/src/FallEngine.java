import java.awt.*;
import java.util.*;


public class FallEngine {
    public static final double GRAVITY = .1;
    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;
    public static final int OBSTACLE_DISTANCE_DELAY = 100;
    public static final int SPEED_UP_DELAY = 20;

    private Vector<ClaseObstaculo> obstacles = new Vector();
    private ClaseJugador player;
    private int obstacleSpeed = 1;
    private int obstacleDelay = 0;
    private int speedDelay = 0;
    public int points = 0;
    
    
    public FallEngine(){
        player = new ClaseJugador();
        createObstacles();
    }
    
    public void createObstacles(){
        int x = ((int)(Math.random() * 350) + 1);
        
        obstacles.add(new ClaseObstaculo(x, 10));
 
        points++;
    
    }
    
    public void removeObstacles()
    {
        for(int i = 0; i < obstacles.size(); i++)
        {
            if(obstacles.get(i).getLocation().getY() < 0)
            {
                obstacles.remove(i);
                i--;
            }
        }
    }
    
    public void moveObstacles()
    {
        for(int i = 0; i < obstacles.size(); i++)
        {
            obstacles.add(i, obstacles.get(i).move(0,+obstacleSpeed));
            obstacles.remove(i+1);
        }
    }
    
    
    //Falta modificarlo bien
      public boolean checkCollision()
    {
        for(int i = 0; i < obstacles.size(); i++)
        {
            obstacles.get(i);
            obstacles.get(i);
            
            if(player.getBounds().intersects(obstacles.get(i).getBounds()))
            {
            		System.out.println("Colisión");
            		obstacles.remove(i);
            		return true;
            }
        }
        return false;
    }
    
    
    
    public void update()
    {
       /*if(!checkCollision()){
            moveObstacles();
            removeObstacles();
            obstacleDelay = obstacleDelay+obstacleSpeed;
            if(obstacleDelay > OBSTACLE_DISTANCE_DELAY)
            {
                    obstacleDelay = 0;
                    speedDelay++;
                    if(speedDelay > SPEED_UP_DELAY)
                    {
                            speedDelay = 0;
                            obstacleSpeed++;
                    }
                    createObstacles();
            }
        }*/
    	
    		moveObstacles();
        removeObstacles();
        obstacleDelay = obstacleDelay+obstacleSpeed;
        if(obstacleDelay > OBSTACLE_DISTANCE_DELAY)
        {
            obstacleDelay = 0;
            speedDelay++;
            if(speedDelay > SPEED_UP_DELAY)
            {
                    speedDelay = 0;
                    obstacleSpeed++;
            }
            createObstacles();
        }
     }

    public void paint(Graphics g)
    {   
        player.paint(g);
        for(int i = 0; i < obstacles.size(); i++)
                obstacles.get(i).paint(g);
        g.setColor(Color.BLUE);
        g.drawString("Points: "+points, 20, 30);
    }
    
}
