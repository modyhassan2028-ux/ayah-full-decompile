package R9;

import K9.AbstractC0399q;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC0399q {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final l f7450t = new l();

    @Override // K9.AbstractC0399q
    public final void c0(p150o9.h hVar, Runnable runnable) {
        e.f7438u.f7440t.e(runnable, true, false);
    }

    @Override // K9.AbstractC0399q
    public final void d0(p150o9.h hVar, Runnable runnable) {
        e.f7438u.f7440t.e(runnable, true, true);
    }

    @Override // K9.AbstractC0399q
    public final AbstractC0399q f0(int i10) {
        P9.b.a(i10);
        return i10 >= k.f7447d ? this : super.f0(i10);
    }

    @Override // K9.AbstractC0399q
    public final String toString() {
        return "Dispatchers.IO";
    }
}
