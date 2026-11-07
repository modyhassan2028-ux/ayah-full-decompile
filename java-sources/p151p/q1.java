package p151p;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f20766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f20767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f20768c;

    static {
        f20768c = Build.VERSION.SDK_INT >= 27;
    }
}
