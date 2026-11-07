package R9;

import P9.u;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f7444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f7445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f7446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f7447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f7448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f7449f;

    static {
        String property;
        int i10 = u.f6806a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f7444a = property;
        f7445b = P9.b.k(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int i11 = u.f6806a;
        if (i11 < 2) {
            i11 = 2;
        }
        f7446c = P9.b.l("kotlinx.coroutines.scheduler.core.pool.size", i11, 8);
        f7447d = P9.b.l("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        f7448e = TimeUnit.SECONDS.toNanos(P9.b.k(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f7449f = g.f7439a;
    }
}
