package p107k5;

import N9.AbstractC0419l;
import N9.k0;
import p110k9.a;
import p151p.C1256n;
import p174r3.c;
import p174r3.l;
import p218w3.f;
import p218w3.n;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f19025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1256n f19026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f19027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f19028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f19029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k0 f19030f;

    public e(f fVar, C1256n c1256n, c cVar, n nVar, l lVar) {
        j.e(fVar, "pageModel");
        j.e(cVar, "bookModel");
        j.e(nVar, "tafsirModel");
        j.e(lVar, "bookRepository");
        this.f19025a = fVar;
        this.f19026b = c1256n;
        this.f19027c = cVar;
        this.f19028d = nVar;
        this.f19029e = lVar;
        this.f19030f = AbstractC0419l.c(-1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(q9.c cVar) {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i10 = aVar.f18995t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f18995t = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objA = aVar.f18993r;
        int i11 = aVar.f18995t;
        if (i11 == 0) {
            a.e(objA);
            aVar.f18995t = 1;
            objA = this.f19027c.a(aVar);
            p161p9.a aVar2 = p161p9.a.f21156r;
            if (objA == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.e(objA);
        }
        return Boolean.valueOf(!((Boolean) objA).booleanValue());
    }
}
