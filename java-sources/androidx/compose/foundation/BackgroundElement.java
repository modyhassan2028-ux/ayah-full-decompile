package androidx.compose.foundation;

import J0.AbstractC0274a0;
import p110k9.t;
import p180s0.J;
import p180s0.q;
import p232y.C1455i;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
final class BackgroundElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11742b = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J f11743c;

    public BackgroundElement(long j, J j10) {
        this.f11741a = j;
        this.f11743c = j10;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && q.c(this.f11741a, backgroundElement.f11741a) && this.f11742b == backgroundElement.f11742b && j.a(this.f11743c, backgroundElement.f11743c);
    }

    public final int hashCode() {
        int i10 = q.f21844h;
        return this.f11743c.hashCode() + p123m2.c.n(t.a(this.f11741a) * 961, this.f11742b, 31);
    }

    @Override // J0.AbstractC0274a0
    public final l0.q k() {
        C1455i c1455i = new C1455i();
        c1455i.f24521F = this.f11741a;
        c1455i.f24522G = this.f11743c;
        c1455i.f24523H = 9205357640488583168L;
        return c1455i;
    }

    @Override // J0.AbstractC0274a0
    public final void l(l0.q qVar) {
        C1455i c1455i = (C1455i) qVar;
        c1455i.f24521F = this.f11741a;
        c1455i.f24522G = this.f11743c;
    }
}
