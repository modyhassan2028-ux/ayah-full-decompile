package q;

import B2.c;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends u0 {
    public static volatile a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f21180k = new c(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f21181i = new b();

    public static a S() {
        if (j != null) {
            return j;
        }
        synchronized (a.class) {
            try {
                if (j == null) {
                    j = new a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }
}
