package workshop3.iteratie1.iteratie2;

import java.awt.*;

public class Circle extends Shape {

    private double arc;

    public Circle(Color color, double arc){
        super(color);
        this.arc = arc;
    }



    @Override
    public double getArea(){
        return Math.PI * (arc * arc);
    }

    @Override
    public String toString() {
        return "Circle with area " + getArea() + ". " + super.toString();
    }
}
