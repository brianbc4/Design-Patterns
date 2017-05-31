/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 *
 * @author Dr.Crunch
 */
public interface RectangleAPI {
    public void drawRectangle(int length, int width);
}


class RedRectangle implements RectangleAPI{
    @Override
    public void drawRectangle(int length, int width) {
 System.out.println("Drawing Rectangle [ color: red, Length: " + length + ", Width:" + width + "]");    }
}