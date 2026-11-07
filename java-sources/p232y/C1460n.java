package p232y;

import p063g1.f;
import p180s0.L;

/* JADX INFO: renamed from: y.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1460n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f24574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f24575b;

    public C1460n(float f3, L l10) {
        this.f24574a = f3;
        this.f24575b = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1460n)) {
            return false;
        }
        C1460n c1460n = (C1460n) obj;
        return f.a(this.f24574a, c1460n.f24574a) && this.f24575b.equals(c1460n.f24575b);
    }

    public final int hashCode() {
        return this.f24575b.hashCode() + (Float.floatToIntBits(this.f24574a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) f.b(this.f24574a)) + ", brush=" + this.f24575b + ')';
    }
}
