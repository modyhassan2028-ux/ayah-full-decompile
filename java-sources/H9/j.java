package H9;

import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p120l9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3634r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f3635s;

    public /* synthetic */ j(int i10, Object obj) {
        this.f3634r = i10;
        this.f3635s = obj;
    }

    @Override // p120l9.a
    public final int b() {
        switch (this.f3634r) {
            case 0:
                return ((k) this.f3635s).f3636a.groupCount() + 1;
            default:
                p042e0.c cVar = (p042e0.c) this.f3635s;
                cVar.getClass();
                return cVar.f15718s;
        }
    }

    public h c(int i10) {
        Matcher matcher = ((k) this.f3635s).f3636a;
        E9.d dVarI0 = B0.c.i0(matcher.start(i10), matcher.end(i10));
        if (dVarI0.f1995r < 0) {
            return null;
        }
        String strGroup = matcher.group(i10);
        p251z9.j.d(strGroup, "group(...)");
        return new h(strGroup, dVarI0);
    }

    @Override // p120l9.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f3634r) {
            case 0:
                if (obj == null ? true : obj instanceof h) {
                    return super.contains((h) obj);
                }
                return false;
            default:
                return ((p042e0.c) this.f3635s).containsValue(obj);
        }
    }

    @Override // p120l9.a, java.util.Collection
    public boolean isEmpty() {
        switch (this.f3634r) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f3634r) {
            case 0:
                return new G9.q(new G9.p(new G9.l(2, new E9.d(0, b() - 1, 1)), new E5.a(3, this), 1));
            default:
                p042e0.m mVar = ((p042e0.c) this.f3635s).f15717r;
                p042e0.n[] nVarArr = new p042e0.n[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    nVarArr[i10] = new p042e0.o(2);
                }
                return new p042e0.l(mVar, nVarArr);
        }
    }
}
