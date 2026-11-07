package I1;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends r0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f3760e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f3761f = false;
    public static Constructor g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f3762h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WindowInsets f3763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public A1.c f3764d;

    public m0() {
        this.f3763c = i();
    }

    private static WindowInsets i() {
        if (!f3761f) {
            try {
                f3760e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
            }
            f3761f = true;
        }
        Field field = f3760e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
            }
        }
        if (!f3762h) {
            try {
                g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
            }
            f3762h = true;
        }
        Constructor constructor = g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e13) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
            }
        }
        return null;
    }

    @Override // I1.r0
    public B0 b() {
        a();
        B0 b0H = B0.h(null, this.f3763c);
        A1.c[] cVarArr = this.f3772b;
        y0 y0Var = b0H.f3671a;
        y0Var.r(cVarArr);
        y0Var.u(this.f3764d);
        return b0H;
    }

    @Override // I1.r0
    public void e(A1.c cVar) {
        this.f3764d = cVar;
    }

    @Override // I1.r0
    public void g(A1.c cVar) {
        WindowInsets windowInsets = this.f3763c;
        if (windowInsets != null) {
            this.f3763c = windowInsets.replaceSystemWindowInsets(cVar.f462a, cVar.f463b, cVar.f464c, cVar.f465d);
        }
    }

    public m0(B0 b5) {
        super(b5);
        this.f3763c = b5.g();
    }
}
