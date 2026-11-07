package p104k1;

import Z.C0709z;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18953e;

    public t(int i10) {
        this((i10 & 1) == 0, u.f18954r, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f18949a == tVar.f18949a && this.f18950b == tVar.f18950b && this.f18951c == tVar.f18951c && this.f18952d == tVar.f18952d && this.f18953e == tVar.f18953e;
    }

    public final int hashCode() {
        return (((((((((this.f18949a * 31) + (this.f18950b ? 1231 : 1237)) * 31) + (this.f18951c ? 1231 : 1237)) * 31) + (this.f18952d ? 1231 : 1237)) * 31) + (this.f18953e ? 1231 : 1237)) * 31) + 1237;
    }

    public t(boolean z10, u uVar, boolean z11) {
        C0709z c0709z = i.f18923a;
        int i10 = !z10 ? 262152 : 262144;
        i10 = uVar == u.f18955s ? i10 | 8192 : i10;
        i10 = z11 ? i10 : i10 | 512;
        boolean z12 = uVar == u.f18954r;
        this.f18949a = i10;
        this.f18950b = z12;
        this.f18951c = true;
        this.f18952d = true;
        this.f18953e = true;
    }
}
