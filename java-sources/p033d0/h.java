package p033d0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f15545t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15546u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public j f15547v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15548w;

    public h(f fVar, int i10) {
        super(i10, fVar.f15542y);
        this.f15545t = fVar;
        this.f15546u = fVar.f();
        this.f15548w = -1;
        b();
    }

    public final void a() {
        if (this.f15546u != this.f15545t.f()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // p033d0.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i10 = this.f15525r;
        f fVar = this.f15545t;
        fVar.add(i10, obj);
        this.f15525r++;
        this.f15526s = fVar.b();
        this.f15546u = fVar.f();
        this.f15548w = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        f fVar = this.f15545t;
        Object[] objArr = fVar.f15540w;
        if (objArr == null) {
            this.f15547v = null;
            return;
        }
        int i10 = (fVar.f15542y - 1) & (-32);
        int i11 = this.f15525r;
        if (i11 > i10) {
            i11 = i10;
        }
        int i12 = (fVar.f15538u / 5) + 1;
        j jVar = this.f15547v;
        if (jVar == null) {
            this.f15547v = new j(objArr, i11, i10, i12);
            return;
        }
        jVar.f15525r = i11;
        jVar.f15526s = i10;
        jVar.f15551t = i12;
        if (jVar.f15552u.length < i12) {
            jVar.f15552u = new Object[i12];
        }
        jVar.f15552u[0] = objArr;
        ?? r10 = i11 == i10 ? 1 : 0;
        jVar.f15553v = r10;
        jVar.b(i11 - r10, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f15525r;
        this.f15548w = i10;
        j jVar = this.f15547v;
        f fVar = this.f15545t;
        if (jVar == null) {
            Object[] objArr = fVar.f15541x;
            this.f15525r = i10 + 1;
            return objArr[i10];
        }
        if (jVar.hasNext()) {
            this.f15525r++;
            return jVar.next();
        }
        Object[] objArr2 = fVar.f15541x;
        int i11 = this.f15525r;
        this.f15525r = i11 + 1;
        return objArr2[i11 - jVar.f15526s];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f15525r;
        this.f15548w = i10 - 1;
        j jVar = this.f15547v;
        f fVar = this.f15545t;
        if (jVar == null) {
            Object[] objArr = fVar.f15541x;
            int i11 = i10 - 1;
            this.f15525r = i11;
            return objArr[i11];
        }
        int i12 = jVar.f15526s;
        if (i10 <= i12) {
            this.f15525r = i10 - 1;
            return jVar.previous();
        }
        Object[] objArr2 = fVar.f15541x;
        int i13 = i10 - 1;
        this.f15525r = i13;
        return objArr2[i13 - i12];
    }

    @Override // p033d0.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i10 = this.f15548w;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f15545t;
        fVar.c(i10);
        int i11 = this.f15548w;
        if (i11 < this.f15525r) {
            this.f15525r = i11;
        }
        this.f15526s = fVar.b();
        this.f15546u = fVar.f();
        this.f15548w = -1;
        b();
    }

    @Override // p033d0.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i10 = this.f15548w;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f15545t;
        fVar.set(i10, obj);
        this.f15546u = fVar.f();
        b();
    }
}
