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
public class CircleView extends View {
    private Paint paint;
    public CircleView(Context context) {
        this(context,null);
    }

    public CircleView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public CircleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
    private void init(){
        paint=new Paint();
		/*去锯齿*/
        paint.setAntiAlias(true);
		/*设置paint的颜色*/
        paint.setColor(Color.parseColor("#C0C0C0"));
		/*设置paint的　style　为STROKE：空心*/
        paint.setStyle(Paint.Style.FILL);
		/*设置paint的外框宽度*/
        paint.setStrokeWidth(1);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        // TODO Auto-generated method stub
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
		/*画一个空心三角形*/
        canvas.drawCircle(width/2,height/2,width/2,paint);
    }
}
