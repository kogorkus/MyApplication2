package com.example.kogorkus.myapplication;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DrawClass extends View {


    float xCord = 0;
    float yCord = 0;

    Hero hero;

    Bitmap icon = BitmapFactory.decodeResource(getResources(), R.drawable.hero);
    public DrawClass(Context context) {
        super(context);
        setBackgroundColor(Color.GRAY);
        hero = new Hero();

    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        hero.icon = icon;
        if (xCord != 0) hero.VectorMove(xCord, yCord);
        if(hero.x > xCord + 10 || hero.x < xCord - 10 ) {
            hero.x += hero.xStep;
            hero.y += hero.yStep;
            hero.draw(canvas);
        }
        else
            hero.draw(canvas);
        invalidate();

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        xCord = event.getX() - 150;
        yCord = event.getY() - 150;
        return super.onTouchEvent(event);
    }


}