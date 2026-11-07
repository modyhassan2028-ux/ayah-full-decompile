package p181s2;

import Z.C0698o;
import Z.L0;
import java.util.List;
import java.util.ListIterator;
import p085i0.c;
import p110k9.y;
import p173r2.j;
import p214w.C1395h;
import p223x.X;
import p241y9.g;

/* JADX INFO: loaded from: classes.dex */
public final class x implements g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ X f22112r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f22113s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f22114t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Z.X f22115u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ L0 f22116v;

    public x(X x9, j jVar, p085i0.g gVar, Z.X x10, L0 l10) {
        this.f22112r = x9;
        this.f22113s = jVar;
        this.f22114t = gVar;
        this.f22115u = x10;
        this.f22116v = l10;
    }

    @Override // p241y9.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        Object objPrevious;
        C1395h c1395h = (C1395h) obj;
        j jVar = (j) obj2;
        C0698o c0698o = (C0698o) obj3;
        ((Number) obj4).intValue();
        boolean zA = p251z9.j.a(this.f22112r.f23916t.getValue(), this.f22113s);
        if (!((Boolean) this.f22115u.getValue()).booleanValue() && !zA) {
            List list = (List) this.f22116v.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!p251z9.j.a(jVar, (j) objPrevious));
            jVar = (j) objPrevious;
        }
        if (jVar == null) {
            c0698o.T(105930796);
        } else {
            c0698o.T(-1520603531);
            r.a(jVar, this.f22114t, p074h0.j.d(-1263531443, new m(jVar, c1395h), c0698o), c0698o, 384);
        }
        c0698o.p(false);
        return y.f19095a;
    }
}
