package p132n1;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class J extends K {
    public boolean g;

    @Override // p132n1.K
    public final boolean b(float f3, long j, View view, s sVar) {
        Method method;
        J j10;
        if (view instanceof MotionLayout) {
            float fA = a(f3, j, view, sVar);
            j10 = this;
            ((MotionLayout) view).setProgress(fA);
        } else {
            if (this.g) {
                return false;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.g = true;
                method = null;
            }
            if (method != null) {
                try {
                    float fA2 = a(f3, j, view, sVar);
                    j10 = this;
                    try {
                        method.invoke(view, Float.valueOf(fA2));
                    } catch (IllegalAccessException e10) {
                        e = e10;
                        Log.e("SplineSet", "unable to setProgress", e);
                    } catch (InvocationTargetException e11) {
                        e = e11;
                        Log.e("SplineSet", "unable to setProgress", e);
                    }
                } catch (IllegalAccessException e12) {
                    e = e12;
                    j10 = this;
                } catch (InvocationTargetException e13) {
                    e = e13;
                    j10 = this;
                }
            } else {
                j10 = this;
            }
        }
        return j10.f19846d;
    }
}
