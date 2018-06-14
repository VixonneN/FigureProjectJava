package Figures.aplication;

import java.awt.*;

public class FigureGraphics {
    public class Dot extends Figures.aplication.FigureGraphics {
        public void paintDot(Graphics g) {
            g.drawOval(5, 5, 100, 100);
            Color newColor = new Color(0, 0, 255);
            g.setColor(newColor);
        }
    }

    public class Line extends Figures.aplication.FigureGraphics {
        public void paintLine(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.drawLine(20, 30, 360, 30);
            Color newColor = new Color(0, 255, 0);
            g.setColor(newColor);
        }
    }

    public class Circle extends Figures.aplication.FigureGraphics {
        public void paintCircle(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.drawOval(200, 110, 60, 60);
        }
    }

    public class Ellipce extends Figures.aplication.FigureGraphics {
        public void paintEllipce(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.drawOval(200, 110, 60, 120);
            Color newColor = new Color(255, 0, 0);
            g2d.setColor(newColor);
            g2d.fillRect(201, 109, 59, 59);
        }
    }
    public class DeleteFigure {
        public void deleteFigure(Graphics g){
            Color initColor = g.getColor();
            g.setColor(new Color(255,255,255));
            g.fillRect(0,0,500,300);
            g.setColor(initColor);
        }
    }
}
