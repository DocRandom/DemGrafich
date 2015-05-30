package com.mycompany.myapp3;
import android.content.Context;
import android.view.View;
import android.graphics.*;
import javax.microedition.*;
public class CanvasView extends View{
	private Paint myPaint;
	Paint rudi;
	RectF ovalA=new RectF();

public CanvasView(Context context){
	super(context);
	setPaintAttributes();
}
public void setPaintAttributes(){
	myPaint = new Paint();
	myPaint.setColor(Color.GREEN);
	rudi = new Paint();
	rudi.setColor(Color.parseColor("#a23957"));
	}
	@Override
	public void onDraw(Canvas canvas){
		canvas.drawColor(Color.parseColor("#a18343"));
		canvas.drawCircle(253.0f,325.0f,55.0f,myPaint);
		ovalA.set(20,20,200,450);
		canvas.drawArc(ovalA,36,142,true,rudi);
	}
}
