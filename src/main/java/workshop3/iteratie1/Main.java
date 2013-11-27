package workshop3.iteratie1;

import java.awt.*;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args){
        Rectangle r1 = new Rectangle(Color.BLUE, 30, 7);
        Rectangle r2 = new Rectangle(Color.RED, 11, 8);

        Circle c1 = new Circle(Color.YELLOW, 8);
        Circle c2 = new Circle(Color.CYAN, 5);


        ArrayList<Rectangle> rectangles = new ArrayList();
        rectangles.add(r1);
        rectangles.add(r2);

        ArrayList<Circle> circles = new ArrayList();
        circles.add(c1);
        circles.add(c2);

        ArrayList<Shape> shapes = new ArrayList();
        shapes.add(r1);
        shapes.add(r2);
        shapes.add(c1);
        shapes.add(c2);

        printRectangles(rectangles);
        printCircles(circles);
        System.out.println("\n");
        printShapes(shapes);
    }



    public static void printRectangles(ArrayList<Rectangle> rectangles){
        for(Rectangle r : rectangles){
            System.out.println(r);
        }
    }

    public static void printCircles(ArrayList<Circle> circles){
        for(Circle c : circles){
            System.out.println(c);
        }
    }


    public static void printShapes(ArrayList<Shape> shapes){
        for(Shape s : shapes){
            System.out.println(s);
        }
    }

}
