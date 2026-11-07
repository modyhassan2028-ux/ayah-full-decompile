package p055f1;

import android.support.v4.media.session.p;
import p002a1.a;
import p110k9.t;
import p180s0.F;
import p180s0.q;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15897a;

    public c(long j) {
        this.f15897a = j;
        if (j != 16) {
            return;
        }
        a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // p055f1.p
    public final p a(p241y9.a aVar) {
        return !equals(n.f15918a) ? this : (p) aVar.invoke();
    }

    @Override // p055f1.p
    public final long b() {
        return this.f15897a;
    }

    @Override // p055f1.p
    public final float c() {
        return q.d(this.f15897a);
    }

    @Override // p055f1.p
    public final /* synthetic */ p d(p pVar) {
        return p.b(this, pVar);
    }

    @Override // p055f1.p
    public final F e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && q.c(this.f15897a, ((c) obj).f15897a);
    }

    public final int hashCode() {
        int i10 = q.f21844h;
        return t.a(this.f15897a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) q.i(this.f15897a)) + ')';
    }
}
