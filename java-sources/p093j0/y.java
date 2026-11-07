package p093j0;

import A9.a;
import E9.d;
import H9.i;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.List;
import java.util.ListIterator;
import p123m2.c;
import p251z9.t;

/* JADX INFO: loaded from: classes.dex */
public final class y implements ListIterator, a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18697r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f18698s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f18699t;

    public y(i iVar, int i10) {
        this.f18699t = iVar;
        List list = (List) iVar.f3633s;
        if (i10 >= 0 && i10 <= iVar.b()) {
            this.f18698s = list.listIterator(iVar.b() - i10);
            return;
        }
        StringBuilder sbW = c.w(i10, "Position index ", " must be in range [");
        sbW.append(new d(0, iVar.b(), 1));
        sbW.append("].");
        throw new IndexOutOfBoundsException(sbW.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f18697r) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f18697r) {
            case 0:
                return ((t) this.f18698s).f24884r < ((z) this.f18699t).f18703u - 1;
            default:
                return ((ListIterator) this.f18698s).hasPrevious();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f18697r) {
            case 0:
                return ((t) this.f18698s).f24884r >= 0;
            default:
                return ((ListIterator) this.f18698s).hasNext();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f18697r) {
            case 0:
                t tVar = (t) this.f18698s;
                int i10 = tVar.f24884r + 1;
                z zVar = (z) this.f18699t;
                s.a(i10, zVar.f18703u);
                tVar.f24884r = i10;
                return zVar.get(i10);
            default:
                return ((ListIterator) this.f18698s).previous();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f18697r) {
            case 0:
                return ((t) this.f18698s).f24884r + 1;
            default:
                i iVar = (i) this.f18699t;
                return AbstractC0813f2.E(iVar) - ((ListIterator) this.f18698s).previousIndex();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f18697r) {
            case 0:
                t tVar = (t) this.f18698s;
                int i10 = tVar.f24884r;
                z zVar = (z) this.f18699t;
                s.a(i10, zVar.f18703u);
                tVar.f24884r = i10 - 1;
                return zVar.get(i10);
            default:
                return ((ListIterator) this.f18698s).next();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f18697r) {
            case 0:
                return ((t) this.f18698s).f24884r;
            default:
                i iVar = (i) this.f18699t;
                return AbstractC0813f2.E(iVar) - ((ListIterator) this.f18698s).nextIndex();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f18697r) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f18697r) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public y(t tVar, z zVar) {
        this.f18698s = tVar;
        this.f18699t = zVar;
    }
}
