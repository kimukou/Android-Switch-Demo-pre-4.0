package com.appscumen.example;

import android.annotation.SuppressLint;
import android.text.TextPaint;
import android.view.MotionEvent;

@SuppressLint("NewApi")
public class MySwitchHelper {

	public static TextPaint setTextPaintDensity(TextPaint mTextPaint,float density){
		mTextPaint.density = density;
		return mTextPaint;
	}
	
	public static int getAction(MotionEvent ev){
		return ev.getActionMasked();
	}
}
