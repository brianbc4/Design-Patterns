/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 *
 * @author user1
 */
public abstract class Shape {
    protected CircleAPI circleAPI;
    protected RectangleAPI rectangleAPI;
    
    protected Shape(CircleAPI drawAPI){
    this.circleAPI= drawAPI;
    }
    
    protected Shape(RectangleAPI drawAPI){
    this.rectangleAPI = drawAPI;
    }
    public abstract void draw();
}


class Circle extends Shape {

    private int x, y, radius;

    Circle(int x, int y, int radius, CircleAPI drawAPI){
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
     circleAPI.drawCircle(radius,x,y);
    }

}

class Rectangle extends Shape{

    private int length, width;
    
    public Rectangle(int length,int width, RectangleAPI drawAPI) {
        super(drawAPI);
        this.length = length;
        this.width = width;
    }


    @Override
    public void draw() {
     rectangleAPI.drawRectangle(length, width);
             }

}
