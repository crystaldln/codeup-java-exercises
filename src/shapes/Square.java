package shapes;


import java.awt.*;

public class Square extends Rectangle {
    public Square(double side){
        super((int) side, (int) side);
    }
    public double getArea(){
        double side = this.width;
        return side * side;
    }
    public double getPerimeter(){
        double side = this.width;
        return side * 4;
    }
}
