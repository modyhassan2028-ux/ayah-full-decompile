package i7;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f16869f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1034y f16871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f16873d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f16874e = null;

    public /* synthetic */ F(String str, Object obj, InterfaceC1034y interfaceC1034y) {
        this.f16870a = str;
        this.f16872c = obj;
        this.f16871b = interfaceC1034y;
    }

    public final Object a(Object obj) {
        synchronized (this.f16873d) {
        }
        if (obj != null) {
            return obj;
        }
        if (I0.f17011k == null) {
            return this.f16872c;
        }
        synchronized (f16869f) {
            try {
                if (H8.e.q()) {
                    return this.f16874e == null ? this.f16872c : this.f16874e;
                }
                try {
                    for (F f3 : G.f16928a) {
                        if (H8.e.q()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objA = null;
                        try {
                            InterfaceC1034y interfaceC1034y = f3.f16871b;
                            if (interfaceC1034y != null) {
                                objA = interfaceC1034y.a();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f16869f) {
                            f3.f16874e = objA;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                InterfaceC1034y interfaceC1034y2 = this.f16871b;
                if (interfaceC1034y2 != null) {
                    try {
                        return interfaceC1034y2.a();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f16872c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
