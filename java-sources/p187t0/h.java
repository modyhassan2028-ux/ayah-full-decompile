package p187t0;

import u.AbstractC1356k;
import u.t;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f22542a;

    static {
        q qVar = d.f22517e;
        int i10 = qVar.f22512c;
        e eVar = new e(qVar, qVar, 1);
        int i11 = qVar.f22512c;
        l lVar = d.f22534x;
        int i12 = (lVar.f22512c << 6) | i11;
        g gVar = new g(qVar, lVar, 0);
        int i13 = (i11 << 6) | lVar.f22512c;
        g gVar2 = new g(lVar, qVar, 0);
        t tVar = AbstractC1356k.f22736a;
        t tVar2 = new t();
        tVar2.h(i10 | (i10 << 6), eVar);
        tVar2.h(i12, gVar);
        tVar2.h(i13, gVar2);
        f22542a = tVar2;
    }
}
