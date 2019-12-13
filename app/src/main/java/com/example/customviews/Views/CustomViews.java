package com.example.customviews.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

import org.w3c.dom.Attr;

public class CustomViews extends View {

    private static final int SquareSize = 200;
    private Rect rect;
    private Paint paint;
    private float cx, cy;
    private float radius = 200f;

    public CustomViews(Context context) {
        super(context);
        init(null);
    }

    public CustomViews(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public CustomViews(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    public CustomViews(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init(@Nullable AttributeSet set)
    {
        rect = new Rect();
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.RED);
    }

    public void swapcolor()
    {
        System.out.println("Swapcolor");
        paint.setColor(paint.getColor() == Color.RED ? Color.GREEN : Color.RED);
        postInvalidate();
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        //canvas.drawColor(Color.RED);
        /*
        rect.left = 10;
        rect.right = rect.left + SquareSize;
        rect.top = 10;
        rect.bottom = rect.top + SquareSize;

        canvas.drawRect(rect, paint);

         */

        if (cx == 0f || cy == 0f)
        {
            cx=getWidth() / 2;
            cy = getHeight() / 2;
        }
        canvas.drawCircle(cx, cy, radius, paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean val =  super.onTouchEvent(event);

        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
            {
                swapcolor();
            }
        }

        return val;
    }
}
