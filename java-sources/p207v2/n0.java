package p207v2;

import A6.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23275d;

    public n0(int i10, int i11, int i12, int i13) {
        this.f23272a = i10;
        this.f23273b = i11;
        this.f23274c = i12;
        this.f23275d = i13;
    }

    public final int a(EnumC1375m enumC1375m) {
        j.e(enumC1375m, "loadType");
        int iOrdinal = enumC1375m.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        if (iOrdinal == 1) {
            return this.f23272a;
        }
        if (iOrdinal == 2) {
            return this.f23273b;
        }
        throw new a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f23272a == n0Var.f23272a && this.f23273b == n0Var.f23273b && this.f23274c == n0Var.f23274c && this.f23275d == n0Var.f23275d;
    }

    public int hashCode() {
        return this.f23272a + this.f23273b + this.f23274c + this.f23275d;
    }
}
