package Figures.aplication;

import java.util.Arrays;

public class Figure {

    public class Dot extends Figure {

        int x, y, width, height;
        int x1, y1, width1, height1;

        private int[] show() {
            x = 20;
            y = 25;
            width = 20;
            height = 35;

            int[] mas_showDot = {x, y, width, height};

            return mas_showDot;
        }

        private int[] hide() {
            x1 = 35;
            y1 = 20;
            width1 = 25;
            height1 = 20;

            int[] mas_hideDot = {x1, y1, width1, height1};

            return mas_hideDot;
        }
    }

    public class Line extends Figure {

        int x1, x2, y1, y2;
        int x3, x4, y3, y4;

        private int[] show() {

            x1 = 0;
            x2 = 150;
            y1 = 0;
            y2 = 130;

            int[] mas_showLine = {x1, x2, y1, y2};

            return mas_showLine;
        }

        private int[] hide() {

            x3 = 150;
            x4 = 0;
            y3 = 130;
            y4 = 0;

            int[] mas_hideLine = {x3, y3, x4, y4};

            return mas_hideLine;
        }
    }

    public class Circle extends Figure {

        int x, y, width, height;
        int x1, y1, width1, height1;

        private int[] show() {

            x = 45;
            y = 35;
            width = 40;
            height = 15;
            int[] mas_showCircle = {x, y, width, height};

            return mas_showCircle;
        }

        private int[] hide() {

            x1 = 15;
            y1 = 40;
            width1 = 35;
            height1 = 45;
            int[] mas_hideCircle = {x1, y1, width1, height1};

            return mas_hideCircle;
        }
    }

    public class Ellipce extends Figure {

        int x1, x2, y1, y2;
        int x11, x21, y11, y21;

        private int[] show() {

            x1 = 30;
            y1 = 15;
            x2 = 70;
            y2 = 45;
            int[] mas_showEllipse = {x1, x2, y1, y2};

            return mas_showEllipse;
        }

        private int[] hide() {
            x11 = 45;
            y11 = 70;
            x21 = 15;
            y21 = 30;
            int[] mas_hideEllipse = {x11, x21, y11, y21};

            return mas_hideEllipse;
        }
    }

    public static void main(String[] args) {
        Dot dot = new Figure().new Dot();
        int[] mas_showDot = dot.show();
        System.out.println("Dot " + "Show " + Arrays.toString(mas_showDot));
        int[] mas_hideDot = dot.hide();
        System.out.println("Hide " + Arrays.toString(mas_hideDot));

        Line line = new Figure().new Line();
        int[] mas_showLine = line.show();
        System.out.println("Line " + "Show " + Arrays.toString(mas_showLine));
        int[] mas_hideLine = line.hide();
        System.out.println("Line " + "Hide " + Arrays.toString(mas_hideLine));

        Circle circle = new Figure().new Circle();
        int[] mas_showCircle = circle.show();
        System.out.println("Circle " + "Show " + Arrays.toString(mas_showCircle));
        int[] mas_hideCircle = circle.hide();
        System.out.println("Circle " + "Hide " + Arrays.toString(mas_hideCircle));

        Ellipce ellipce = new Figure().new Ellipce();
        int[] mas_showEllipse = ellipce.show();
        System.out.println("Ellipce " + "Show " + Arrays.toString(mas_showEllipse));
        int[] mas_hideEllipse = ellipce.hide();
        System.out.println("Ellipce " + "Hide " + Arrays.toString(mas_hideEllipse));
    }
}