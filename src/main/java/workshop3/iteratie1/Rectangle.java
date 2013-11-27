package workshop3.iteratie1;

import java.awt.Color;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(Color color, int width, int height){
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    @Override
    public String toString(){
        return "Rectangle with " + getArea() + ". " + super.toString();
    }

}
