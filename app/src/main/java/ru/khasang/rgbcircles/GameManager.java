package ru.khasang.rgbcircles;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by IlimSarykbaev on 05.03.2018.
 */

public class GameManager {
    private MainCircle mainCircle;
    private CanvasView canvasView;
    private static int width;
    private static int height;
    private Paint paint;

    public GameManager(CanvasView canvasView, int w, int h){
        this.canvasView = canvasView;
        width = w;
        height = h;
        initMainCircle();
        iniPaint();
    }

    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }

    private void iniPaint() {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    private void initMainCircle() {
        mainCircle = new MainCircle(width/2, height/2);
    }

    public void onDraw(Canvas canvas){
        canvas.drawCircle(mainCircle.getX(), mainCircle.getY(),mainCircle.getRadius(),paint);
    }

    public void onTouchEvent(int x, int y) {
        mainCircle.moveMainCircleWhenTouchAt(x,y);
    }
}
