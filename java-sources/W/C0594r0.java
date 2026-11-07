package W;

import J0.AbstractC0283f;

/* JADX INFO: renamed from: W.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0594r0 implements p180s0.r {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9334r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f9335s;

    public /* synthetic */ C0594r0(int i10, Object obj) {
        this.f9334r = i10;
        this.f9335s = obj;
    }

    @Override // p180s0.r
    public final long a() {
        switch (this.f9334r) {
            case 0:
                C0600t0 c0600t0 = (C0600t0) this.f9335s;
                long jA = c0600t0.f9371K.a();
                if (jA != 16) {
                    return jA;
                }
                U0 u8 = (U0) AbstractC0283f.i(c0600t0, W0.f8891b);
                if (u8 != null) {
                    long j = u8.f8848a;
                    if (j != 16) {
                        return j;
                    }
                }
                return ((p180s0.q) AbstractC0283f.i(c0600t0, AbstractC0592q0.f9328a)).f21845a;
            default:
                return ((X0) this.f9335s).f8906c;
        }
    }
}
