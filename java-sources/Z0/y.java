package Z0;

import U0.C0515g;
import U0.K;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0515g f10953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K f10955c;

    static {
        p085i0.n nVar = p085i0.o.f16735a;
    }

    public y(C0515g c0515g, long j, K k7) {
        this.f10953a = c0515g;
        this.f10954b = va.g.j(j, c0515g.f8060s.length());
        this.f10955c = k7 != null ? new K(va.g.j(k7.f8035a, c0515g.f8060s.length())) : null;
    }

    public static y a(y yVar, C0515g c0515g, long j, int i10) {
        if ((i10 & 1) != 0) {
            c0515g = yVar.f10953a;
        }
        if ((i10 & 2) != 0) {
            j = yVar.f10954b;
        }
        K k7 = (i10 & 4) != 0 ? yVar.f10955c : null;
        yVar.getClass();
        return new y(c0515g, j, k7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return K.a(this.f10954b, yVar.f10954b) && p251z9.j.a(this.f10955c, yVar.f10955c) && p251z9.j.a(this.f10953a, yVar.f10953a);
    }

    public final int hashCode() {
        int i10;
        int iHashCode = this.f10953a.hashCode() * 31;
        int i11 = K.f8034c;
        long j = this.f10954b;
        int i12 = (((int) (j ^ (j >>> 32))) + iHashCode) * 31;
        K k7 = this.f10955c;
        if (k7 != null) {
            long j10 = k7.f8035a;
            i10 = (int) ((j10 >>> 32) ^ j10);
        } else {
            i10 = 0;
        }
        return i12 + i10;
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f10953a) + "', selection=" + ((Object) K.g(this.f10954b)) + ", composition=" + this.f10955c + ')';
    }

    public y(long j, int i10, String str) {
        this(new C0515g((i10 & 1) != 0 ? "" : str), (i10 & 2) != 0 ? K.f8033b : j, (K) null);
    }
}
