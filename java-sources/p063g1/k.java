package p063g1;

import android.support.v4.media.session.p;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f16255e = new k(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16259d;

    public k(int i10, int i11, int i12, int i13) {
        this.f16256a = i10;
        this.f16257b = i11;
        this.f16258c = i12;
        this.f16259d = i13;
    }

    public final long a() {
        int iD = (d() / 2) + this.f16256a;
        return (((long) ((b() / 2) + this.f16257b)) & 4294967295L) | (((long) iD) << 32);
    }

    public final int b() {
        return this.f16259d - this.f16257b;
    }

    public final long c() {
        return (((long) this.f16256a) << 32) | (((long) this.f16257b) & 4294967295L);
    }

    public final int d() {
        return this.f16258c - this.f16256a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f16256a == kVar.f16256a && this.f16257b == kVar.f16257b && this.f16258c == kVar.f16258c && this.f16259d == kVar.f16259d;
    }

    public final int hashCode() {
        return (((((this.f16256a * 31) + this.f16257b) * 31) + this.f16258c) * 31) + this.f16259d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f16256a);
        sb.append(", ");
        sb.append(this.f16257b);
        sb.append(", ");
        sb.append(this.f16258c);
        sb.append(", ");
        return p.A(sb, this.f16259d, ')');
    }
}
