package com.mycompany.myapp3;
import android.content.Context;
import android.view.View;
import android.graphics.*;
import javax.microedition.*;
public class CanvasView extends View{
	private Paint myPaint;

public CanvasView(Context context){
	super(context);
	setPaintAttributes();
}
public void setPaintAttributes(){
	myPaint = new Paint();
	myPaint.setColor(Color.GREEN);
	}
	@Override
	public void onDraw(Canvas canvas){
		canvas.drawColor(Color.parseColor("#a18343"));
		canvas.drawCircle(153.0f,325.0f,55.0f,myPaint);
	}
}
