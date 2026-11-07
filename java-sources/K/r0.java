package K;

import A.EnumC0047u0;
import A.R0;
import Z.C0673b0;
import Z.C0675c0;
import Z.C0681f0;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {
    public static final p085i0.n g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0673b0 f4766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0673b0 f4767b = new C0673b0(0.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0675c0 f4768c = new C0675c0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p171r0.e f4769d = p171r0.e.f21388e;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4770e = U0.K.f8033b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0681f0 f4771f;

    static {
        C0317k c0317k = C0317k.f4665D;
        R0 r10 = new R0(q0.f4762r);
        p251z9.y.b(1, c0317k);
        p085i0.n nVar = p085i0.o.f16735a;
        g = new p085i0.n(0, r10, c0317k);
    }

    public r0(EnumC0047u0 enumC0047u0, float f3) {
        this.f4766a = new C0673b0(f3);
        this.f4771f = new C0681f0(enumC0047u0, Z.S.f10643w);
    }

    public final void a(EnumC0047u0 enumC0047u0, p171r0.e eVar, int i10, int i11) {
        float f3;
        float f7 = i11 - i10;
        this.f4767b.h(f7);
        float f10 = eVar.f21389a;
        float f11 = eVar.f21390b;
        p171r0.e eVar2 = this.f4769d;
        float f12 = eVar2.f21389a;
        C0673b0 c0673b0 = this.f4766a;
        if (f10 != f12 || f11 != eVar2.f21390b) {
            boolean z10 = enumC0047u0 == EnumC0047u0.f424r;
            if (z10) {
                f10 = f11;
            }
            float f13 = z10 ? eVar.f21392d : eVar.f21391c;
            float fG = c0673b0.g();
            float f14 = i10;
            float f15 = fG + f14;
            if (f13 <= f15 && (f10 >= fG || f13 - f10 <= f14)) {
                f3 = (f10 >= fG || f13 - f10 > f14) ? 0.0f : f10 - fG;
            } else {
                f3 = f13 - f15;
            }
            c0673b0.h(c0673b0.g() + f3);
            this.f4769d = eVar;
        }
        c0673b0.h(B0.c.k(c0673b0.g(), 0.0f, f7));
        this.f4768c.h(i10);
    }
}
