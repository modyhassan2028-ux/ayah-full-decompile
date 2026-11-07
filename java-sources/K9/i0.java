package K9;

import com.google.android.gms.internal.measurement.AbstractC0813f2;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends A {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p150o9.c f5375v;

    public i0(p150o9.h hVar, p241y9.e eVar) {
        super(hVar, false, 1);
        this.f5375v = AbstractC0813f2.r(this, this, eVar);
    }

    @Override // K9.h0
    public final void Y() throws Throwable {
        try {
            P9.b.h(p110k9.y.f19095a, AbstractC0813f2.H(this.f5375v));
        } catch (Throwable th) {
            th = th;
            if (th instanceof D) {
                th = ((D) th).f5319r;
            }
            resumeWith(p110k9.a.b(th));
            throw th;
        }
    }
}
