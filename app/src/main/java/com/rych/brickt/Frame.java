package com.rych.brickt;

public class Frame implements Drawable {
    private int mTop;
    private int mBottom;
    private int mLeft;
    private int mRight;

    public Frame(int x1, int x2, int y1, int y2){
        mTop=y1;
        mBottom=y2;
        mLeft=x1;
        mRight=x2;
    }

    @Override
    public void draw() {

    }
}
