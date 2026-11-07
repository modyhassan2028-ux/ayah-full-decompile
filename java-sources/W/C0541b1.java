package W;

import A.C0007a;
import Z.C0673b0;

/* JADX INFO: renamed from: W.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0541b1 implements C0.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0561g1 f8989r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0007a f8990s;

    public C0541b1(C0561g1 c0561g1, C0007a c0007a) {
        this.f8989r = c0561g1;
        this.f8990s = c0007a;
    }

    @Override // C0.a
    public final long B(int i10, long j, long j10) {
        if (i10 != 1) {
            return 0L;
        }
        X.s sVar = this.f8989r.f9137b;
        float fE = sVar.e(p171r0.c.e(j10));
        C0673b0 c0673b0 = sVar.f9782i;
        float fG = Float.isNaN(c0673b0.g()) ? 0.0f : c0673b0.g();
        c0673b0.h(fE);
        return p171r0.d.a(0.0f, fE - fG);
    }

    @Override // C0.a
    public final Object T(long j, long j10, p150o9.c cVar) {
        this.f8990s.e(new Float(p063g1.q.c(j10)));
        return new p063g1.q(j10);
    }

    @Override // C0.a
    public final Object h(long j, p150o9.c cVar) {
        float fC = p063g1.q.c(j);
        C0561g1 c0561g1 = this.f8989r;
        float f3 = c0561g1.f9137b.f();
        float fC2 = c0561g1.f9137b.d().c();
        if (fC >= 0.0f || f3 <= fC2) {
            j = 0;
        } else {
            this.f8990s.e(new Float(fC));
        }
        return new p063g1.q(j);
    }

    @Override // C0.a
    public final long m(long j, int i10) {
        float fE = p171r0.c.e(j);
        if (fE >= 0.0f || i10 != 1) {
            return 0L;
        }
        X.s sVar = this.f8989r.f9137b;
        float fE2 = sVar.e(fE);
        C0673b0 c0673b0 = sVar.f9782i;
        float fG = Float.isNaN(c0673b0.g()) ? 0.0f : c0673b0.g();
        c0673b0.h(fE2);
        return p171r0.d.a(0.0f, fE2 - fG);
    }
}
