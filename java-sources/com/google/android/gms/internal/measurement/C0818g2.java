package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0818g2 implements B2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0818g2 f14253s = new C0818g2(0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f14254r;

    public /* synthetic */ C0818g2(int i10) {
        this.f14254r = i10;
    }

    public static final C0912z2 c(Object obj, Object obj2) {
        C0912z2 c0912z2A = (C0912z2) obj;
        C0912z2 c0912z2 = (C0912z2) obj2;
        if (!c0912z2.isEmpty()) {
            if (!c0912z2A.f14517r) {
                c0912z2A = c0912z2A.a();
            }
            c0912z2A.c();
            if (!c0912z2.isEmpty()) {
                c0912z2A.putAll(c0912z2);
            }
        }
        return c0912z2A;
    }

    @Override // com.google.android.gms.internal.measurement.B2
    public boolean a(Class cls) {
        switch (this.f14254r) {
            case 0:
                return AbstractC0828i2.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.measurement.B2
    public J2 b(Class cls) {
        switch (this.f14254r) {
            case 0:
                if (!AbstractC0828i2.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (J2) AbstractC0828i2.l(cls.asSubclass(AbstractC0828i2.class)).o(3);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
