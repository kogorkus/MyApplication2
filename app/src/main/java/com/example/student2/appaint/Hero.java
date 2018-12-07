package com.example.student2.appaint;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Hero extends Character {
    private float Speed = (float)Math.random() * 15 + 8;
    private float xStep, yStep;

    public Hero(float x, float y, Bitmap icon) {
        super(x, y, icon);
    }

    void VectorMove(float xCord, float yCord)
    {
        float vectorX = xCord - getX();
        float vectorY = yCord - getY();
        float vectorLength = (float)Math.sqrt(vectorX * vectorX + vectorY * vectorY);
        xStep = vectorX/vectorLength * Speed;
        yStep = vectorY/vectorLength * Speed;
    }

    public float getSpeed() {
        return Speed;
    }

    public void setSpeed(float speed) {
        Speed = speed;
    }

    public float getxStep() {
        return xStep;
    }

    public void setxStep(float xStep) {
        this.xStep = xStep;
    }

    public float getyStep() {
        return yStep;
    }

    public void setyStep(float yStep) {
        this.yStep = yStep;
    }
}
