package G9;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import u.C;
import u.D;
import u.G;
import u.H;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Iterator, A9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2933r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f2934s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2935t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f2936u;

    public h(Object obj, Map map) {
        this.f2933r = 1;
        this.f2934s = obj;
        this.f2936u = map;
    }

    public void a() {
        Object objE;
        g gVar = (g) this.f2936u;
        if (this.f2935t == -2) {
            objE = ((p241y9.a) gVar.f2931b).invoke();
        } else {
            p241y9.c cVar = (p241y9.c) gVar.f2932c;
            Object obj = this.f2934s;
            p251z9.j.b(obj);
            objE = cVar.e(obj);
        }
        this.f2934s = objE;
        this.f2935t = objE == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2933r) {
            case 0:
                if (this.f2935t < 0) {
                    a();
                }
                return this.f2935t == 1;
            case 1:
                return this.f2935t < ((Map) this.f2936u).size();
            case 2:
                return ((j) this.f2934s).hasNext();
            default:
                return ((j) this.f2934s).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2933r) {
            case 0:
                if (this.f2935t < 0) {
                    a();
                }
                if (this.f2935t == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f2934s;
                p251z9.j.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f2935t = -1;
                return obj;
            case 1:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f2934s;
                this.f2935t++;
                Object obj3 = ((Map) this.f2936u).get(obj2);
                if (obj3 != null) {
                    this.f2934s = ((p054f0.a) obj3).f15889b;
                    return obj2;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
            case 2:
                return ((j) this.f2934s).next();
            default:
                return ((j) this.f2934s).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2933r) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                int i10 = this.f2935t;
                if (i10 != -1) {
                    ((D) this.f2936u).f22668s.h(i10);
                    this.f2935t = -1;
                    return;
                }
                return;
            default:
                int i11 = this.f2935t;
                if (i11 != -1) {
                    ((H) this.f2936u).f22693s.m(i11);
                    this.f2935t = -1;
                    return;
                }
                return;
        }
    }

    public h(g gVar) {
        this.f2933r = 0;
        this.f2936u = gVar;
        this.f2935t = -2;
    }

    public h(H h7) {
        this.f2933r = 3;
        this.f2936u = h7;
        this.f2935t = -1;
        this.f2934s = AbstractC0813f2.I(new G(h7, this, null));
    }

    public h(D d5) {
        this.f2933r = 2;
        this.f2936u = d5;
        this.f2935t = -1;
        this.f2934s = AbstractC0813f2.I(new C(d5, this, null));
    }
}
