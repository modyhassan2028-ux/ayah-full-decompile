package W2;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class E extends B9.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f9505f = true;
    public static boolean g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f9506h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f9507i = true;

    @Override // B9.a
    public void Y(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.Y(view, i10);
        } else if (f9507i) {
            try {
                D.a(view, i10);
            } catch (NoSuchMethodError unused) {
                f9507i = false;
            }
        }
    }

    public void f0(View view, int i10, int i11, int i12, int i13) {
        if (f9506h) {
            try {
                C.a(view, i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f9506h = false;
            }
        }
    }

    public void g0(View view, Matrix matrix) {
        if (f9505f) {
            try {
                B.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f9505f = false;
            }
        }
    }

    public void h0(View view, Matrix matrix) {
        if (g) {
            try {
                B.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }
}
