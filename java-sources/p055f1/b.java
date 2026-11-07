package p055f1;

import android.support.v4.media.session.p;
import p123m2.c;
import p180s0.F;
import p180s0.H;
import p180s0.q;
import p241y9.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H f15895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15896b;

    public b(H h7, float f3) {
        this.f15895a = h7;
        this.f15896b = f3;
    }

    @Override // p055f1.p
    public final p a(a aVar) {
        return !equals(n.f15918a) ? this : (p) aVar.invoke();
    }

    @Override // p055f1.p
    public final long b() {
        int i10 = q.f21844h;
        return q.g;
    }

    @Override // p055f1.p
    public final float c() {
        return this.f15896b;
    }

    @Override // p055f1.p
    public final /* synthetic */ p d(p pVar) {
        return p.b(this, pVar);
    }

    @Override // p055f1.p
    public final F e() {
        return this.f15895a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j.a(this.f15895a, bVar.f15895a) && Float.compare(this.f15896b, bVar.f15896b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f15896b) + (this.f15895a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f15895a);
        sb.append(", alpha=");
        return c.v(sb, this.f15896b, ')');
    }
}
