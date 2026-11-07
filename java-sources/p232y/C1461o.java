package p232y;

import A.C0053x0;
import B.j;
import K9.AbstractC0405x;
import p110k9.a;
import p110k9.y;
import p150o9.c;
import p241y9.f;
import q9.i;

/* JADX INFO: renamed from: y.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1461o extends i implements f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f24576r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f24577s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ C0053x0 f24578t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ long f24579u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractC1450d f24580v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1461o(AbstractC1450d abstractC1450d, c cVar, int i10) {
        super(3, cVar);
        this.f24576r = i10;
        this.f24580v = abstractC1450d;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C0053x0 c0053x0 = (C0053x0) obj;
        p171r0.c cVar = (p171r0.c) obj2;
        switch (this.f24576r) {
            case 0:
                long j = cVar.f21387a;
                C1461o c1461o = new C1461o((C1462p) this.f24580v, (c) obj3, 0);
                c1461o.f24578t = c0053x0;
                c1461o.f24579u = j;
                return c1461o.invokeSuspend(y.f19095a);
            default:
                long j10 = cVar.f21387a;
                C1461o c1461o2 = new C1461o((C1466u) this.f24580v, (c) obj3, 1);
                c1461o2.f24578t = c0053x0;
                c1461o2.f24579u = j10;
                return c1461o2.invokeSuspend(y.f19095a);
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        Object objJ2;
        switch (this.f24576r) {
            case 0:
                int i10 = this.f24577s;
                y yVar = y.f19095a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.e(obj);
                    return yVar;
                }
                a.e(obj);
                C0053x0 c0053x0 = this.f24578t;
                long j = this.f24579u;
                C1462p c1462p = (C1462p) this.f24580v;
                if (!c1462p.f24488L) {
                    return yVar;
                }
                this.f24577s = 1;
                j jVar = c1462p.f24484H;
                p161p9.a aVar = p161p9.a.f21156r;
                if (jVar == null || (objJ = AbstractC0405x.j(new C1447a(c0053x0, j, jVar, c1462p, null), this)) != aVar) {
                    objJ = yVar;
                }
                return objJ == aVar ? aVar : yVar;
            default:
                int i11 = this.f24577s;
                y yVar2 = y.f19095a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.e(obj);
                    return yVar2;
                }
                a.e(obj);
                C0053x0 c0053x1 = this.f24578t;
                long j10 = this.f24579u;
                C1466u c1466u = (C1466u) this.f24580v;
                if (!c1466u.f24488L) {
                    return yVar2;
                }
                this.f24577s = 1;
                j jVar2 = c1466u.f24484H;
                p161p9.a aVar2 = p161p9.a.f21156r;
                if (jVar2 == null || (objJ2 = AbstractC0405x.j(new C1447a(c0053x1, j10, jVar2, c1466u, null), this)) != aVar2) {
                    objJ2 = yVar2;
                }
                return objJ2 == aVar2 ? aVar2 : yVar2;
        }
    }
}
