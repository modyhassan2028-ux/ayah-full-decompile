package p197u2;

import A9.a;
import E2.C0124h;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p173r2.v;
import u.AbstractC1361p;
import u.P;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Iterator, a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f22875r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f22876s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0124h f22877t;

    public j(C0124h c0124h) {
        this.f22877t = c0124h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22875r + 1 < ((P) this.f22877t.f1675d).g();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f22876s = true;
        P p10 = (P) this.f22877t.f1675d;
        int i10 = this.f22875r + 1;
        this.f22875r = i10;
        return (v) p10.h(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f22876s) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        P p10 = (P) this.f22877t.f1675d;
        ((v) p10.h(this.f22875r)).f21494t = null;
        int i10 = this.f22875r;
        Object[] objArr = p10.f22706t;
        Object obj = objArr[i10];
        Object obj2 = AbstractC1361p.f22746c;
        if (obj != obj2) {
            objArr[i10] = obj2;
            p10.f22704r = true;
        }
        this.f22875r = i10 - 1;
        this.f22876s = false;
    }
}
