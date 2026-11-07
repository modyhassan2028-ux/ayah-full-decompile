package p132n1;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class E extends F {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19835f;

    @Override // p132n1.F
    public final void c(View view, float f3) {
        Method method;
        if (view instanceof MotionLayout) {
            ((MotionLayout) view).setProgress(a(f3));
            return;
        }
        if (this.f19835f) {
            return;
        }
        try {
            method = view.getClass().getMethod("setProgress", Float.TYPE);
        } catch (NoSuchMethodException unused) {
            this.f19835f = true;
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(a(f3)));
            } catch (IllegalAccessException e10) {
                Log.e("SplineSet", "unable to setProgress", e10);
            } catch (InvocationTargetException e11) {
                Log.e("SplineSet", "unable to setProgress", e11);
            }
        }
    }
}
