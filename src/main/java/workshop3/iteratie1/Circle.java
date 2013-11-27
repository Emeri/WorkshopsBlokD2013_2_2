package workshop3.iteratie1;

import java.awt.Color;

public class Circle extends Shape {

    private double arc;

    public Circle(Color color, double arc){
        super(color);
        this.arc = arc;
    }

    public double getArea(){
        return Math.PI * (arc * arc);
    }

    @Override
    public String toString() {
        return "Circle with area " + getArea() + ". " + super.toString();
    }
}
