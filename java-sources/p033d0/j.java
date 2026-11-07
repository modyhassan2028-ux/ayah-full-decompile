package p033d0;

import java.util.NoSuchElementException;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15551t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object[] f15552u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f15553v;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public j(Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11);
        this.f15551t = i12;
        Object[] objArr2 = new Object[i12];
        this.f15552u = objArr2;
        ?? r10 = i10 == i11 ? 1 : 0;
        this.f15553v = r10;
        objArr2[0] = objArr;
        b(i10 - r10, 1);
    }

    public final Object a() {
        int i10 = this.f15525r & 31;
        Object obj = this.f15552u[this.f15551t - 1];
        p251z9.j.c(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i10];
    }

    public final void b(int i10, int i11) {
        int i12 = (this.f15551t - i11) * 5;
        while (i11 < this.f15551t) {
            Object[] objArr = this.f15552u;
            Object obj = objArr[i11 - 1];
            p251z9.j.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = ((Object[]) obj)[u0.s(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    public final void c(int i10) {
        int i11 = 0;
        while (u0.s(this.f15525r, i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            b(this.f15525r, ((this.f15551t - 1) - (i11 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a();
        int i10 = this.f15525r + 1;
        this.f15525r = i10;
        if (i10 == this.f15526s) {
            this.f15553v = true;
            return objA;
        }
        c(0);
        return objA;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f15525r--;
        if (this.f15553v) {
            this.f15553v = false;
            return a();
        }
        c(31);
        return a();
    }
}
