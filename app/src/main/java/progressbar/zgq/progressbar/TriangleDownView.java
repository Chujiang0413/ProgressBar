package progressbar.zgq.progressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 37902 on 2016/5/24.
 */
public class TriangleDownView extends View {
    private Paint paint;
    public TriangleDownView(Context context) {
        this(context,null);
    }

    public TriangleDownView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public TriangleDownView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
    private void init(){
        paint=new Paint();
		/*去锯齿*/
        paint.setAntiAlias(true);
		/*设置paint的颜色*/
        paint.setColor(Color.parseColor("#B6B6B6"));
		/*设置paint的　style　为STROKE：空心*/
        paint.setStyle(Paint.Style.FILL);
		/*设置paint的外框宽度*/
        paint.setStrokeWidth(1);
    }
    public void setColor(int color){
        paint.setColor(color);
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // TODO Auto-generated method stub
        super.onDraw(canvas);
        canvas.drawColor(Color.alpha(0));
        int width = getWidth();
        int height = getHeight();
		/*画一个空心三角形*/
        Path path=new Path();
        path.moveTo(0,(float)(height/2*(1-Math.sqrt(3)/2)));
        path.lineTo(width,(float)(height/2*(1-Math.sqrt(3)/2)));
        path.lineTo(width/2,(float)(height/4*(2+Math.sqrt(3))));
        path.close();
        canvas.drawPath(path, paint);
    }
}
