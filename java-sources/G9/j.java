package G9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Iterator, p150o9.c, A9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2937r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f2938s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Iterator f2939t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p150o9.c f2940u;

    public final RuntimeException a() {
        int i10 = this.f2937r;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f2937r);
    }

    public final void b(Object obj, p150o9.c cVar) {
        this.f2938s = obj;
        this.f2937r = 3;
        this.f2940u = cVar;
        p251z9.j.e(cVar, "frame");
    }

    @Override // p150o9.c
    public final p150o9.h getContext() {
        return p150o9.i.f20380r;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i10 = this.f2937r;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw a();
                }
                Iterator it = this.f2939t;
                p251z9.j.b(it);
                if (it.hasNext()) {
                    this.f2937r = 2;
                    return true;
                }
                this.f2939t = null;
            }
            this.f2937r = 5;
            p150o9.c cVar = this.f2940u;
            p251z9.j.b(cVar);
            this.f2940u = null;
            cVar.resumeWith(y.f19095a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f2937r;
        if (i10 == 0 || i10 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i10 == 2) {
            this.f2937r = 1;
            Iterator it = this.f2939t;
            p251z9.j.b(it);
            return it.next();
        }
        if (i10 != 3) {
            throw a();
        }
        this.f2937r = 0;
        Object obj = this.f2938s;
        this.f2938s = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p150o9.c
    public final void resumeWith(Object obj) {
        p110k9.a.e(obj);
        this.f2937r = 4;
    }
}
