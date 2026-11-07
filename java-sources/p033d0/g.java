package p033d0;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class g extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object[] f15543t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j f15544u;

    public g(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        super(i10, i11);
        this.f15543t = objArr2;
        int i13 = (i11 - 1) & (-32);
        this.f15544u = new j(objArr, i10 > i13 ? i13 : i10, i13, i12);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        j jVar = this.f15544u;
        if (jVar.hasNext()) {
            this.f15525r++;
            return jVar.next();
        }
        int i10 = this.f15525r;
        this.f15525r = i10 + 1;
        return this.f15543t[i10 - jVar.f15526s];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f15525r;
        j jVar = this.f15544u;
        int i11 = jVar.f15526s;
        if (i10 <= i11) {
            this.f15525r = i10 - 1;
            return jVar.previous();
        }
        int i12 = i10 - 1;
        this.f15525r = i12;
        return this.f15543t[i12 - i11];
    }
}
