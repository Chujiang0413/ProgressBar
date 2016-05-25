package progressbar.zgq.progressbar;

import android.view.animation.Interpolator;

/**
 * Created by 37902 on 2016/5/25.
 */
public class SmallToBigInterpolator implements Interpolator {
    public SmallToBigInterpolator() {
    }

    @Override
    public float getInterpolation(float input) {
        if (input>0.5) {
            return input;
        }else{
            return 0;
        }
    }
}
