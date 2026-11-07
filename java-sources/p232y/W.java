package p232y;

import D.P;
import p110k9.t;
import p123m2.c;
import p180s0.F;
import p180s0.q;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P f24463b;

    public W() {
        long jD = F.d(4284900966L);
        float f3 = 0;
        P p10 = new P(f3, f3, f3, f3);
        this.f24462a = jD;
        this.f24463b = p10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!W.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        j.c(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        W w9 = (W) obj;
        return q.c(this.f24462a, w9.f24462a) && j.a(this.f24463b, w9.f24463b);
    }

    public final int hashCode() {
        int i10 = q.f21844h;
        return this.f24463b.hashCode() + (t.a(this.f24462a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        c.A(this.f24462a, ", drawPadding=", sb);
        sb.append(this.f24463b);
        sb.append(')');
        return sb.toString();
    }
}
