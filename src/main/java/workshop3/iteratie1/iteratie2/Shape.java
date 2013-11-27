package workshop3.iteratie1.iteratie2;

import java.awt.*;

public abstract class Shape {

    private Color color;

    public Shape(Color color){
        this.color = color;
    }

    public abstract double getArea();


    @Override
    public String toString(){
        return "The color is " + color.toString();
    }

}
