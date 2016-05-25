package progressbar.zgq.progressbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.FrameLayout;

/**
 * Created by 37902 on 2016/5/24.
 */
public class TechProgressBar extends FrameLayout {
    private TriangleView triangleView;
    private TriangleDownView triangleDownView;
    private CircleView circleView1;
    private CircleView circleView2;
    private CircleView circleView3;
    private Context context;

    private int width;
    private int height;
    public TechProgressBar(Context context) {
        this(context,null);
    }

    public TechProgressBar(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public TechProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        init();
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        width = getWidth();
        height = getHeight();

    }

    private void init(){
        triangleView = new TriangleView(context);
        triangleDownView = new TriangleDownView(context);
        circleView1 = new CircleView(context);
        circleView2 = new CircleView(context);
        circleView3 = new CircleView(context);
        this.addView(triangleDownView);
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams)triangleView.getLayoutParams();
        params.gravity = Gravity.CENTER_HORIZONTAL;
        triangleView.setLayoutParams(params);

    }
}
