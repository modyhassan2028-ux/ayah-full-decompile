package p151p;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Method f20582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Method f20583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Method f20584c;

    public S0(Method method, Method method2, Method method3) {
        this.f20582a = method;
        this.f20583b = method2;
        this.f20584c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
