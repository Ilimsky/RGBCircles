package ru.khasang.rgbcircles;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by IlimSarykbaev on 05.03.2018.
 */

public class GameManager {
    private MainCircle mainCircle;
    private Paint paint;

    public GameManager(){
        initMainCircle();
        iniPaint();
    }

    private void iniPaint() {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    private void initMainCircle() {
        mainCircle = new MainCircle(200, 500);
    }

    public void onDraw(Canvas canvas){
        canvas.drawCircle(mainCircle.getX(), mainCircle.getY(),mainCircle.getRadius(),paint);
    }
}
