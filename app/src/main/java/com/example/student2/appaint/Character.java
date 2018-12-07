package com.example.student2.appaint;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class Character extends GameObject{
    public Character(float x, float y, Bitmap icon) {
        this.x = x;
        this.y = y;
        this.icon = icon;
    }

    private float x, y ;
    private Bitmap icon;

    void draw(Canvas canvas)
    {
        canvas.drawBitmap(icon, x, y, null);
    }

    public float getX() {
        return x;
    }

    public void setX(float x, float xStep) {
        this.x = x + xStep;
    }

    public float getY() {
        return y;
    }

    public void setY(float y, float yStep) {
        this.y = y + yStep;
    }

    public Bitmap getIcon() {
        return icon;
    }

    public void setIcon(Bitmap icon) {
        this.icon = icon;
    }
}
