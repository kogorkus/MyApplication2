package com.example.student2.appaint;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DrawClass extends View  {


    private float xCord = 0;
    private float yCord = 0;

    Hero hero;

    Bitmap icon = BitmapFactory.decodeResource(getResources(), R.drawable.hero);



    public DrawClass(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackgroundColor(Color.GRAY);
        hero = new Hero(getHeight()/2, getWidth()/2, icon);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        hero.VectorMove(xCord, yCord);
        if(hero.getX() > xCord + 10 || hero.getX() < xCord - 10 ) {
            hero.setX(hero.getX(), hero.getxStep());
            hero.setY(hero.getY(), hero.getyStep());
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