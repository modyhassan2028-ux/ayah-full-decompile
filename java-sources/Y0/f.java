package Y0;

import A.M0;
import E2.N0;
import K9.AbstractC0405x;
import K9.p0;
import X.L;

/* JADX INFO: loaded from: classes.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R7.f f10349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f10350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L5.c f10351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f10352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p248z6.c f10353e;

    public f(R7.f fVar, a aVar) {
        L5.c cVar = g.f10354a;
        L5.c cVar2 = g.f10354a;
        i iVar = new i();
        h hVar = i.f10355a;
        L9.d dVar = p022c1.g.f13439a;
        hVar.getClass();
        AbstractC0405x.b(Y2.a.Z(hVar, dVar).L(p150o9.i.f20380r).L(new p0(null)));
        p248z6.c cVar3 = new p248z6.c(29, (byte) 0);
        this.f10349a = fVar;
        this.f10350b = aVar;
        this.f10351c = cVar;
        this.f10352d = iVar;
        this.f10353e = cVar3;
        new M0(26, this);
    }

    public final t a(s sVar) {
        L5.c cVar = this.f10351c;
        L l10 = new L(1, this, sVar);
        synchronized (((R7.f) cVar.f5532s)) {
            t tVar = (t) ((N0) cVar.f5533t).g(sVar);
            if (tVar != null) {
                if (tVar.f10373s) {
                    return tVar;
                }
            }
            try {
                t tVar2 = (t) l10.e(new L(2, cVar, sVar));
                synchronized (((R7.f) cVar.f5532s)) {
                    if (((N0) cVar.f5533t).g(sVar) == null && tVar2.f10373s) {
                        ((N0) cVar.f5533t).k(sVar, tVar2);
                    }
                }
                return tVar2;
            } catch (Exception e10) {
                throw new IllegalStateException("Could not load font", e10);
            }
        }
    }

    public final t b(e eVar, l lVar, int i10, int i11) {
        a aVar = this.f10350b;
        aVar.getClass();
        int i12 = aVar.f10346a;
        l lVar2 = (i12 == 0 || i12 == Integer.MAX_VALUE) ? lVar : new l(B0.c.l(lVar.f10364r + i12, 1, 1000));
        this.f10349a.getClass();
        return a(new s(eVar, lVar2, i10, i11, null));
    }
}
