package K4;

import A.C0040q0;
import C4.e;
import K9.A;
import K9.AbstractC0405x;
import N9.AbstractC0419l;
import N9.U;
import N9.h0;
import p120l9.r;
import p218w3.j;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f5237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p218w3.c f5238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P9.d f5239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final U f5240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final A f5241e;

    public d(j jVar, p218w3.c cVar, p218w3.a aVar) {
        p251z9.j.e(jVar, "suraModel");
        p251z9.j.e(cVar, "jumpModel");
        p251z9.j.e(aVar, "currentPageModel");
        this.f5237a = jVar;
        this.f5238b = cVar;
        P9.d dVarB = AbstractC0405x.b(AbstractC0405x.e());
        this.f5239c = dVarB;
        this.f5240d = aVar.f23647c;
        this.f5241e = AbstractC0405x.f(dVarB, new C0040q0(this, (p150o9.c) null, 10));
    }

    public final U a() {
        return AbstractC0419l.v(new e(new a(this, null, 0)), this.f5239c, new h0(), r.f19440r);
    }

    public final U b() {
        return AbstractC0419l.v(new e(new a(this, null, 1)), this.f5239c, new h0(), r.f19440r);
    }
}
