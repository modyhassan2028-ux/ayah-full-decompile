package W;

import J0.AbstractC0283f;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;

/* JADX INFO: renamed from: W.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0544c0 extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8998r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8999s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0556f0 f9000t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f9001u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0544c0(C0556f0 c0556f0, long j, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f8998r = i10;
        this.f9000t = c0556f0;
        this.f9001u = j;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f8998r) {
            case 0:
                return new C0544c0(this.f9000t, this.f9001u, cVar, 0);
            default:
                return new C0544c0(this.f9000t, this.f9001u, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f8998r) {
            case 0:
                break;
        }
        return ((C0544c0) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f8998r;
        p110k9.y yVar = p110k9.y.f19095a;
        p161p9.a aVar = p161p9.a.f21156r;
        C0556f0 c0556f0 = this.f9000t;
        long j = this.f9001u;
        switch (i10) {
            case 0:
                int i11 = this.f8999s;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                c0556f0.f9067K = p171r0.c.d(j) + c0556f0.f9067K;
                float fE = p171r0.c.e(j) + c0556f0.f9068L;
                c0556f0.f9068L = fE;
                C0576l c0576l = c0556f0.f9064H;
                long j10 = c0556f0.f9069M;
                float f3 = fE - ((int) (4294967295L & j10));
                float f7 = c0556f0.f9067K - ((int) (j10 >> 32));
                float f10 = A2.f8452a;
                float fAtan2 = ((float) Math.atan2(f3, f7)) - 1.5707964f;
                if (fAtan2 < 0.0f) {
                    fAtan2 += 6.2831855f;
                }
                this.f8999s = 1;
                p232y.V v10 = c0576l.f9226e;
                C0573k c0573k = new C0573k(c0576l, fAtan2, false, null);
                v10.getClass();
                Object objJ = AbstractC0405x.j(new K0.m1(p232y.T.f24455s, v10, c0573k, (p150o9.c) null), this);
                if (objJ != aVar) {
                    objJ = yVar;
                }
                return objJ == aVar ? aVar : yVar;
            default:
                int i12 = this.f8999s;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                C0576l c0576l2 = c0556f0.f9064H;
                float fD = p171r0.c.d(j);
                float fE2 = p171r0.c.e(j);
                float fW = AbstractC0283f.x(c0556f0).f3912P.w(A2.f8457f);
                boolean z10 = c0556f0.f9065I;
                long j11 = c0556f0.f9069M;
                this.f8999s = 1;
                return A2.p(c0576l2, fD, fE2, fW, z10, j11, this) == aVar ? aVar : yVar;
        }
    }
}
