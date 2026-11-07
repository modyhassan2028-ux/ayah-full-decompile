package p120l9;

import I1.V;
import android.support.v4.media.session.p;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends V implements ListIterator {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f19429u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i10) {
        super(5, dVar);
        this.f19429u = dVar;
        int iB = dVar.b();
        if (i10 < 0 || i10 > iB) {
            throw new IndexOutOfBoundsException(p.w(i10, iB, "index: ", ", size: "));
        }
        this.f3698s = i10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3698s > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3698s;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f3698s - 1;
        this.f3698s = i10;
        return this.f19429u.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3698s - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
