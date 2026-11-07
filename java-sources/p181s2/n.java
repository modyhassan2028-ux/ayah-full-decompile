package p181s2;

import Ca.h;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import p085i0.c;
import p085i0.g;
import p093j0.r;
import p110k9.y;
import p173r2.j;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public final class n implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f22083r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f22084s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f22085t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f22086u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p f22087v;

    public n(j jVar, q qVar, g gVar, r rVar, p pVar) {
        this.f22083r = jVar;
        this.f22084s = qVar;
        this.f22085t = gVar;
        this.f22086u = rVar;
        this.f22087v = pVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        C0698o c0698o = (C0698o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0698o.x()) {
            c0698o.N();
        } else {
            j jVar = this.f22083r;
            boolean zI = c0698o.i(jVar);
            q qVar = this.f22084s;
            boolean zI2 = zI | c0698o.i(qVar);
            Object objH = c0698o.H();
            if (zI2 || objH == C0690k.f10683a) {
                objH = new h(this.f22086u, jVar, qVar, 7);
                c0698o.e0(objH);
            }
            C0672b.d(jVar, (p241y9.c) objH, c0698o);
            r.a(jVar, this.f22085t, p074h0.j.d(-497631156, new m(0, this.f22087v, jVar), c0698o), c0698o, 384);
        }
        return y.f19095a;
    }
}
