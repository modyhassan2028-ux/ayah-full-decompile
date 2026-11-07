package W;

import A.C0017f;
import A.C0041r0;

/* JADX INFO: renamed from: W.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0548d0 extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9021r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9022s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f9023t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0556f0 f9024u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0548d0(C0556f0 c0556f0, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f9021r = i10;
        this.f9024u = c0556f0;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f9021r) {
            case 0:
                C0548d0 c0548d0 = new C0548d0(this.f9024u, cVar, 0);
                c0548d0.f9023t = obj;
                return c0548d0;
            default:
                C0548d0 c0548d1 = new C0548d0(this.f9024u, cVar, 1);
                c0548d1.f9023t = obj;
                return c0548d1;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        D0.z zVar = (D0.z) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f9021r) {
            case 0:
                break;
        }
        return ((C0548d0) create(zVar, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f9021r;
        p110k9.y yVar = p110k9.y.f19095a;
        p161p9.a aVar = p161p9.a.f21156r;
        C0556f0 c0556f0 = this.f9024u;
        switch (i10) {
            case 0:
                int i11 = this.f9022s;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                D0.z zVar = (D0.z) this.f9023t;
                C0041r0 c0041r0 = new C0041r0(28, c0556f0);
                A.R0 r10 = new A.R0(13, c0556f0);
                this.f9022s = 1;
                float f3 = A.I.f62a;
                return A.I.d(zVar, C0017f.f232t, c0041r0, A.C.f21s, r10, this) == aVar ? aVar : yVar;
            default:
                int i12 = this.f9022s;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                D0.z zVar2 = (D0.z) this.f9023t;
                C0552e0 c0552e0 = new C0552e0(c0556f0, null, 0);
                A.M0 m10 = new A.M0(25, c0556f0);
                this.f9022s = 1;
                return A.n1.d(zVar2, c0552e0, m10, this, 3) == aVar ? aVar : yVar;
        }
    }
}
