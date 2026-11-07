package W;

import Z.C0673b0;

/* JADX INFO: renamed from: W.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0584n1 extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9284r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0604u1 f9285s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0584n1(C0604u1 c0604u1, int i10) {
        super(1);
        this.f9284r = i10;
        this.f9285s = c0604u1;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        int i10;
        switch (this.f9284r) {
            case 0:
                this.f9285s.f9394A.h((int) (((p063g1.l) obj).f16260a >> 32));
                return p110k9.y.f19095a;
            case 1:
                float fFloatValue = ((Number) obj).floatValue();
                C0604u1 c0604u1 = this.f9285s;
                C0673b0 c0673b0 = c0604u1.f9404u;
                E9.a aVar = c0604u1.f9403t;
                float f3 = aVar.f1993a;
                float f7 = aVar.f1994b;
                float fK = B0.c.k(fFloatValue, f3, f7);
                int i11 = c0604u1.f9401r;
                boolean z10 = false;
                if (i11 > 0 && (i10 = i11 + 1) >= 0) {
                    float fAbs = fK;
                    float f10 = fAbs;
                    int i12 = 0;
                    while (true) {
                        float fL = B9.a.L(aVar.f1993a, f7, i12 / i10);
                        float f11 = fL - fK;
                        if (Math.abs(f11) <= fAbs) {
                            fAbs = Math.abs(f11);
                            f10 = fL;
                        }
                        if (i12 != i10) {
                            i12++;
                        } else {
                            fK = f10;
                        }
                    }
                }
                if (fK != c0673b0.g()) {
                    if (fK != c0673b0.g()) {
                        p241y9.c cVar = c0604u1.f9405v;
                        if (cVar != null) {
                            cVar.e(Float.valueOf(fK));
                        } else {
                            c0604u1.b(fK);
                        }
                    }
                    p241y9.a aVar2 = c0604u1.f9402s;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                long j = ((p171r0.c) obj).f21387a;
                C0604u1 c0604u2 = this.f9285s;
                c0604u2.a(0.0f);
                c0604u2.f9396C.invoke();
                return p110k9.y.f19095a;
        }
    }
}
