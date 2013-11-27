package workshop3.iteratie1.iteratie2;

import java.awt.*;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(Color color, int width, int height){
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Rectangle)) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;

        return  (this.width == rectangle.width && this.height == rectangle.height);
    }

    @Override
    public double getArea(){
        return width * height;
    }

    @Override
    public String toString(){
        return "Rectangle with " + getArea() + ". " + super.toString();
    }

}
