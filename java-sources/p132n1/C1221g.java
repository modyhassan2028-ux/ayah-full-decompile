package p132n1;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: n1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1221g extends AbstractC1222h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19872d;

    @Override // p132n1.AbstractC1222h
    public final void c(View view, float f3) {
        Method method;
        if (view instanceof MotionLayout) {
            ((MotionLayout) view).setProgress(a(f3));
            return;
        }
        if (this.f19872d) {
            return;
        }
        try {
            method = view.getClass().getMethod("setProgress", Float.TYPE);
        } catch (NoSuchMethodException unused) {
            this.f19872d = true;
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(a(f3)));
            } catch (IllegalAccessException e10) {
                Log.e("KeyCycleOscillator", "unable to setProgress", e10);
            } catch (InvocationTargetException e11) {
                Log.e("KeyCycleOscillator", "unable to setProgress", e11);
            }
        }
    }
}
