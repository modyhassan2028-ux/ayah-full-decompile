package H9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, A9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3611r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3612s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3613t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public E9.d f3614u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ G9.g f3615v;

    public b(G9.g gVar) {
        this.f3615v = gVar;
        int iL = B0.c.l(0, 0, ((CharSequence) gVar.f2931b).length());
        this.f3612s = iL;
        this.f3613t = iL;
    }

    public final void a() {
        p110k9.j jVar;
        G9.g gVar = this.f3615v;
        CharSequence charSequence = (CharSequence) gVar.f2931b;
        int i10 = this.f3613t;
        if (i10 < 0) {
            this.f3611r = 0;
            this.f3614u = null;
            return;
        }
        if (i10 <= charSequence.length() && (jVar = (p110k9.j) ((p241y9.e) gVar.f2932c).invoke(charSequence, Integer.valueOf(this.f3613t))) != null) {
            int iIntValue = ((Number) jVar.f19077r).intValue();
            int iIntValue2 = ((Number) jVar.f19078s).intValue();
            this.f3614u = B0.c.i0(this.f3612s, iIntValue);
            int i11 = iIntValue + iIntValue2;
            this.f3612s = i11;
            this.f3613t = i11 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.f3614u = new E9.d(this.f3612s, o.Y0(charSequence), 1);
            this.f3613t = -1;
        }
        this.f3611r = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3611r == -1) {
            a();
        }
        return this.f3611r == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3611r == -1) {
            a();
        }
        if (this.f3611r == 0) {
            throw new NoSuchElementException();
        }
        E9.d dVar = this.f3614u;
        p251z9.j.c(dVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f3614u = null;
        this.f3611r = -1;
        return dVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
