package W2;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E f9592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F7.f f9593b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f9592a = new F();
        } else {
            f9592a = new E();
        }
        f9593b = new F7.f(Float.class, "translationAlpha", 14);
        new F7.f(Rect.class, "clipBounds", 15);
    }

    public static void a(View view, int i10, int i11, int i12, int i13) {
        f9592a.f0(view, i10, i11, i12, i13);
    }

    public static void b(View view, int i10) {
        f9592a.Y(view, i10);
    }
}
