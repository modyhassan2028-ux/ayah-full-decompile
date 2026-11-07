package O;

import W.C2;

/* JADX INFO: renamed from: O.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0449q extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6400r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f6401s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f6402t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0449q(int i10, E2.A a9) {
        super(0);
        this.f6402t = a9;
        this.f6401s = i10;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f6400r) {
            case 0:
                U0.I i10 = (U0.I) ((E2.A) this.f6402t).f1437e;
                return Integer.valueOf(i10.f8024b.d(this.f6401s));
            default:
                C2 c10 = (C2) this.f6402t;
                int iC = c10.c();
                int i11 = this.f6401s;
                if (i11 != iC) {
                    c10.h(i11);
                }
                return p110k9.y.f19095a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0449q(int i10, C2 c10) {
        super(0);
        this.f6401s = i10;
        this.f6402t = c10;
    }
}
