package J0;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class r implements ListIterator, A9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4159r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4160s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4161t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4162u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f4163v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(C0296t c0296t, int i10, int i11) {
        this(c0296t, (i11 & 1) != 0 ? 0 : i10, 0, c0296t.f4167r.f22651b);
        this.f4159r = 0;
    }

    public void a() {
        if (((AbstractList) ((p129m9.a) this.f4163v).f19696v).modCount != this.f4162u) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f4159r) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                c();
                p093j0.r rVar = (p093j0.r) this.f4163v;
                rVar.add(this.f4160s + 1, obj);
                this.f4161t = -1;
                this.f4160s++;
                this.f4162u = rVar.g();
                return;
            case 2:
                a();
                p129m9.a aVar = (p129m9.a) this.f4163v;
                int i10 = this.f4160s;
                this.f4160s = i10 + 1;
                aVar.add(i10, obj);
                this.f4161t = -1;
                this.f4162u = ((AbstractList) aVar).modCount;
                return;
            default:
                b();
                p129m9.b bVar = (p129m9.b) this.f4163v;
                int i11 = this.f4160s;
                this.f4160s = i11 + 1;
                bVar.add(i11, obj);
                this.f4161t = -1;
                this.f4162u = ((AbstractList) bVar).modCount;
                return;
        }
    }

    public void b() {
        if (((AbstractList) ((p129m9.b) this.f4163v)).modCount != this.f4162u) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (((p093j0.r) this.f4163v).g() != this.f4162u) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4159r) {
            case 0:
                return this.f4160s < this.f4162u;
            case 1:
                return this.f4160s < ((p093j0.r) this.f4163v).size() - 1;
            case 2:
                return this.f4160s < ((p129m9.a) this.f4163v).f19694t;
            default:
                return this.f4160s < ((p129m9.b) this.f4163v).f19699s;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f4159r) {
            case 0:
                return this.f4160s > this.f4161t;
            case 1:
                return this.f4160s >= 0;
            case 2:
                return this.f4160s > 0;
            default:
                return this.f4160s > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f4159r) {
            case 0:
                u.A a9 = ((C0296t) this.f4163v).f4167r;
                int i10 = this.f4160s;
                this.f4160s = i10 + 1;
                Object objE = a9.e(i10);
                p251z9.j.c(objE, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (l0.q) objE;
            case 1:
                c();
                int i11 = this.f4160s + 1;
                this.f4161t = i11;
                p093j0.r rVar = (p093j0.r) this.f4163v;
                p093j0.s.a(i11, rVar.size());
                Object obj = rVar.get(i11);
                this.f4160s = i11;
                return obj;
            case 2:
                a();
                int i12 = this.f4160s;
                p129m9.a aVar = (p129m9.a) this.f4163v;
                if (i12 >= aVar.f19694t) {
                    throw new NoSuchElementException();
                }
                this.f4160s = i12 + 1;
                this.f4161t = i12;
                return aVar.f19692r[aVar.f19693s + i12];
            default:
                b();
                int i13 = this.f4160s;
                p129m9.b bVar = (p129m9.b) this.f4163v;
                if (i13 >= bVar.f19699s) {
                    throw new NoSuchElementException();
                }
                this.f4160s = i13 + 1;
                this.f4161t = i13;
                return bVar.f19698r[i13];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f4159r) {
            case 0:
                return this.f4160s - this.f4161t;
            case 1:
                return this.f4160s + 1;
            case 2:
                return this.f4160s;
            default:
                return this.f4160s;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f4159r) {
            case 0:
                u.A a9 = ((C0296t) this.f4163v).f4167r;
                int i10 = this.f4160s - 1;
                this.f4160s = i10;
                Object objE = a9.e(i10);
                p251z9.j.c(objE, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (l0.q) objE;
            case 1:
                c();
                int i11 = this.f4160s;
                p093j0.r rVar = (p093j0.r) this.f4163v;
                p093j0.s.a(i11, rVar.size());
                int i12 = this.f4160s;
                this.f4161t = i12;
                Object obj = rVar.get(i12);
                this.f4160s--;
                return obj;
            case 2:
                a();
                int i13 = this.f4160s;
                if (i13 <= 0) {
                    throw new NoSuchElementException();
                }
                int i14 = i13 - 1;
                this.f4160s = i14;
                this.f4161t = i14;
                p129m9.a aVar = (p129m9.a) this.f4163v;
                return aVar.f19692r[aVar.f19693s + i14];
            default:
                b();
                int i15 = this.f4160s;
                if (i15 <= 0) {
                    throw new NoSuchElementException();
                }
                int i16 = i15 - 1;
                this.f4160s = i16;
                this.f4161t = i16;
                return ((p129m9.b) this.f4163v).f19698r[i16];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i10;
        switch (this.f4159r) {
            case 0:
                i10 = this.f4160s - this.f4161t;
                break;
            case 1:
                return this.f4160s;
            case 2:
                i10 = this.f4160s;
                break;
            default:
                i10 = this.f4160s;
                break;
        }
        return i10 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f4159r) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                c();
                p093j0.r rVar = (p093j0.r) this.f4163v;
                rVar.remove(this.f4160s);
                this.f4160s--;
                this.f4161t = -1;
                this.f4162u = rVar.g();
                return;
            case 2:
                p129m9.a aVar = (p129m9.a) this.f4163v;
                a();
                int i10 = this.f4161t;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                aVar.c(i10);
                this.f4160s = this.f4161t;
                this.f4161t = -1;
                this.f4162u = ((AbstractList) aVar).modCount;
                return;
            default:
                p129m9.b bVar = (p129m9.b) this.f4163v;
                b();
                int i11 = this.f4161t;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                bVar.c(i11);
                this.f4160s = this.f4161t;
                this.f4161t = -1;
                this.f4162u = ((AbstractList) bVar).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f4159r) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                p093j0.r rVar = (p093j0.r) this.f4163v;
                c();
                int i10 = this.f4161t;
                if (i10 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                rVar.set(i10, obj);
                this.f4162u = rVar.g();
                return;
            case 2:
                a();
                int i11 = this.f4161t;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((p129m9.a) this.f4163v).set(i11, obj);
                return;
            default:
                b();
                int i12 = this.f4161t;
                if (i12 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((p129m9.b) this.f4163v).set(i12, obj);
                return;
        }
    }

    public r(p129m9.b bVar, int i10) {
        this.f4159r = 3;
        this.f4163v = bVar;
        this.f4160s = i10;
        this.f4161t = -1;
        this.f4162u = ((AbstractList) bVar).modCount;
    }

    public r(C0296t c0296t, int i10, int i11, int i12) {
        this.f4159r = 0;
        this.f4163v = c0296t;
        this.f4160s = i10;
        this.f4161t = i11;
        this.f4162u = i12;
    }

    public r(p093j0.r rVar, int i10) {
        this.f4159r = 1;
        this.f4163v = rVar;
        this.f4160s = i10 - 1;
        this.f4161t = -1;
        this.f4162u = rVar.g();
    }

    public r(p129m9.a aVar, int i10) {
        this.f4159r = 2;
        this.f4163v = aVar;
        this.f4160s = i10;
        this.f4161t = -1;
        this.f4162u = ((AbstractList) aVar).modCount;
    }
}
