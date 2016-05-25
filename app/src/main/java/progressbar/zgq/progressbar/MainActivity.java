package progressbar.zgq.progressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.group);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.rotate);
        LinearInterpolator lir = new LinearInterpolator();
        animation.setInterpolator(lir);
        frameLayout.startAnimation(animation);


        TriangleDownView triangleDownView = (TriangleDownView) findViewById(R.id.triangledown);
        Animation scaleSmall = AnimationUtils.loadAnimation(this,R.anim.scaletri);
        scaleSmall.setInterpolator(new BigToSmallInterpolator());
        triangleDownView.startAnimation(scaleSmall);

        CircleView circleView1=(CircleView)findViewById(R.id.cir1);
        CircleView circleView2=(CircleView)findViewById(R.id.cir2);
        CircleView circleView3=(CircleView)findViewById(R.id.cir3);
        Animation scaleBig = AnimationUtils.loadAnimation(this.getApplicationContext(),R.anim.scalecir);
        scaleBig.setInterpolator(new CircleAnimInterpo());
        circleView1.startAnimation(scaleBig);
        circleView2.startAnimation(scaleBig);
        circleView3.startAnimation(scaleBig);
    }
}
