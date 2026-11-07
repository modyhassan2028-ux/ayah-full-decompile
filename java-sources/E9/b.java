package E9;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class b implements Iterable, A9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f1995r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f1996s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f1997t;

    public b(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f1995r = i10;
        this.f1996s = p186s9.b.c(i10, i11, i12);
        this.f1997t = i12;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (isEmpty() && ((b) obj).isEmpty()) {
            return true;
        }
        b bVar = (b) obj;
        return this.f1995r == bVar.f1995r && this.f1996s == bVar.f1996s && this.f1997t == bVar.f1997t;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f1995r * 31) + this.f1996s) * 31) + this.f1997t;
    }

    public boolean isEmpty() {
        int i10 = this.f1997t;
        int i11 = this.f1996s;
        int i12 = this.f1995r;
        if (i10 > 0) {
            return i12 > i11;
        }
        return i12 < i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c(this.f1995r, this.f1996s, this.f1997t);
    }

    public String toString() {
        StringBuilder sb;
        int i10 = this.f1996s;
        int i11 = this.f1995r;
        int i12 = this.f1997t;
        if (i12 > 0) {
            sb = new StringBuilder();
            sb.append(i11);
            sb.append("..");
            sb.append(i10);
            sb.append(" step ");
            sb.append(i12);
        } else {
            sb = new StringBuilder();
            sb.append(i11);
            sb.append(" downTo ");
            sb.append(i10);
            sb.append(" step ");
            sb.append(-i12);
        }
        return sb.toString();
    }
}
