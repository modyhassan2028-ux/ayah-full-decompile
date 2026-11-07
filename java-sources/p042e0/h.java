package p042e0;

import A9.a;
import java.util.Iterator;
import java.util.Map;
import p224x0.F;
import p224x0.H;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Iterator, a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15733r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Iterator f15734s;

    public h(e eVar) {
        n[] nVarArr = new n[8];
        for (int i10 = 0; i10 < 8; i10++) {
            nVarArr[i10] = new p(this);
        }
        this.f15734s = new f(eVar, nVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f15733r) {
            case 0:
                return ((f) this.f15734s).f15721t;
            default:
                return this.f15734s.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f15733r) {
            case 0:
                return (Map.Entry) ((f) this.f15734s).next();
            default:
                return (H) this.f15734s.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f15733r) {
            case 0:
                ((f) this.f15734s).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(F f3) {
        this.f15734s = f3.f24144A.iterator();
    }
}
