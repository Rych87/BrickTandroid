package com.rych.brickt;

import android.graphics.Point;

public class Ball implements Drawable, Phys {
    private int mX;
    private int mY;
    private int mRad;
    private int mSpeedX;
    private int mSpeedY;
    private int mMaxSpeed;

    public Ball(int x, int y, int maxSpeed){
        mX=x;
        mY=y;
        mMaxSpeed=maxSpeed;
        mSpeedX=mSpeedY=0;
    }

    @Override
    public void draw() {

    }

    @Override
    public void update(float delta) {
        mX+=mSpeedX;
        mY+=mSpeedY;
    }
}
