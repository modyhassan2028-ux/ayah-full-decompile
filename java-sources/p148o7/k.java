package p148o7;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f20375a = {R.attr.stateListAnimator};

    public static void a(AppBarLayout appBarLayout, float f3) {
        int integer = appBarLayout.getResources().getInteger(com.ayah.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, com.ayah.R.attr.state_liftable, -2130969607}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f3).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }
}
