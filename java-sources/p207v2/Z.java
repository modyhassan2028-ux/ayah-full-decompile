package p207v2;

import A9.a;
import H9.p;
import java.util.Iterator;
import java.util.List;
import p120l9.m;
import p120l9.r;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends a0 implements Iterable, a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f23195r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f23196s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f23197t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f23198u;

    static {
        new Z(r.f19440r, null, 0, 0);
    }

    public Z(List list, Object obj, int i10, int i11) {
        this.f23195r = list;
        this.f23196s = obj;
        this.f23197t = i10;
        this.f23198u = i11;
        if (i10 != Integer.MIN_VALUE && i10 < 0) {
            throw new IllegalArgumentException("itemsBefore cannot be negative");
        }
        if (i11 != Integer.MIN_VALUE && i11 < 0) {
            throw new IllegalArgumentException("itemsAfter cannot be negative");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z10 = (Z) obj;
        return j.a(this.f23195r, z10.f23195r) && j.a(this.f23196s, z10.f23196s) && this.f23197t == z10.f23197t && this.f23198u == z10.f23198u;
    }

    public final int hashCode() {
        int iHashCode = this.f23195r.hashCode() * 961;
        Object obj = this.f23196s;
        return ((((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + this.f23197t) * 31) + this.f23198u;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f23195r.listIterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadResult.Page(\n                    |   data size: ");
        List list = this.f23195r;
        sb.append(list.size());
        sb.append("\n                    |   first Item: ");
        sb.append(m.g0(list));
        sb.append("\n                    |   last Item: ");
        sb.append(m.n0(list));
        sb.append("\n                    |   nextKey: ");
        sb.append(this.f23196s);
        sb.append("\n                    |   prevKey: null\n                    |   itemsBefore: ");
        sb.append(this.f23197t);
        sb.append("\n                    |   itemsAfter: ");
        sb.append(this.f23198u);
        sb.append("\n                    |) ");
        return p.J0(sb.toString());
    }
}
