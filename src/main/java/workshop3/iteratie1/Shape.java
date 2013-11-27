package workshop3.iteratie1;

import java.awt.Color;

public class Shape {

    private Color color;

    public Shape(Color color){
        this.color = color;
    }

    @Override
    public String toString(){
        return "The color is " + color.toString();
    }

}
