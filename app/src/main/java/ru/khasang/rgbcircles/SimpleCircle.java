package ru.khasang.rgbcircles;

/**
 * Created by IlimSarykbaev on 07.03.2018.
 */

public class SimpleCircle {
    protected int x;
    protected int y;
    protected int radius;

   public SimpleCircle(int x, int y, int radius){
       this.x = x;
       this.y = y;
       this.radius = radius;
   }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }
}
