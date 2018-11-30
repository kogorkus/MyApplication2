package com.example.student2.appaint;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Hero {
    float x, y ;
    String name;
    Bitmap icon;
    float Speed = (float)Math.random() * 15 + 8;
    float xStep, yStep;
    void VectorMove(float xCord, float yCord)
    {
        float vectorX = xCord - x;
        float vectorY = yCord - y;
        float vectorLength = (float)Math.sqrt(vectorX * vectorX + vectorY * vectorY);
        xStep = vectorX/vectorLength * Speed;
        yStep = vectorY/vectorLength * Speed;
    }

    void draw(Canvas canvas)
    {
        canvas.drawBitmap(icon, x, y, null);
    }
}
