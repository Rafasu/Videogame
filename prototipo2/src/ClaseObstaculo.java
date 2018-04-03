import java.awt.Color;
import java.awt.Graphics;

    public class ClaseObstaculo {

        //Dimensiones obstaculo
        public static final int WIDTH = 30;
        public static final int HEIGHT = 30;

       /*Posición inicial del obstaculo. 
            Colocar obstaculos al inicio en y. 
            Posición random en x.
        */
        int y = 10;
        int x = ((int)(Math.random() * 350) + 1);

        public ClaseObstaculo(int x, int y){
            this.x = x;
            this.y = y;

        }

        public ClaseObstaculo move(int dx, int dy)
        {
            return new ClaseObstaculo(x+dx, y+dy);
        }


        public Point getLocation()
        {
           return new Point(x,y);
        }

        // Dibujar al obstaculo
        public void paint(Graphics g){

                g.setColor(Color.blue);
                g.fillRect(x, y, HEIGHT, WIDTH);
        }


        //Mover Obstaculo
        public void CalcularPosY()
        {
                y += 1;
        }
    }
