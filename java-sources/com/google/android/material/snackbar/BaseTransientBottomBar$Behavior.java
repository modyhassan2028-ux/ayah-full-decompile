package com.google.android.material.snackbar;

import H8.e;
import J1.f;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e f15181y;

    public BaseTransientBottomBar$Behavior() {
        e eVar = new e(16);
        this.f14613v = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f14614w = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f14612u = 0;
        this.f15181y = eVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, u1.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f15181y.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (f.f4216b == null) {
                    f.f4216b = new f();
                }
                synchronized (f.f4216b.f4217a) {
                }
            }
        } else if (coordinatorLayout.t(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (f.f4216b == null) {
                f.f4216b = new f();
            }
            f.f4216b.b();
        }
        return super.k(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean w(View view) {
        this.f15181y.getClass();
        return view instanceof BaseTransientBottomBar$SnackbarBaseLayout;
    }
}
