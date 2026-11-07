package Ga;

import A.EnumC0047u0;

/* JADX INFO: loaded from: classes.dex */
public final class p extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3061r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ A f3062s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(A a9, int i10) {
        super(0);
        this.f3061r = i10;
        this.f3062s = a9;
    }

    @Override // p241y9.a
    public final Object invoke() {
        float fV;
        long jG;
        float f3;
        long j;
        switch (this.f3061r) {
            case 0:
                return Boolean.valueOf(this.f3062s.j.getValue() != null);
            case 1:
                return this.f3062s.f2953a.H();
            case 2:
                A a9 = this.f3062s;
                z zVarD = a9.d();
                if (zVarD != null) {
                    O8.c cVarH = a9.f2953a.H();
                    F.r rVar = (F.r) cVarH.f6511r;
                    int iOrdinal = cVarH.s().ordinal();
                    if (iOrdinal == 0) {
                        jG = rVar.g() & 4294967295L;
                    } else {
                        if (iOrdinal != 1) {
                            throw new A6.a();
                        }
                        jG = rVar.g() >> 32;
                    }
                    long jB = zVarD.b();
                    fV = (((int) jG) - va.g.v(p171r0.d.a((int) (jB >> 32), (int) (4294967295L & jB)), a9.f())) - 1.0f;
                } else {
                    fV = 0.0f;
                }
                return Float.valueOf(fV);
            case 3:
                A a10 = this.f3062s;
                z zVarD2 = a10.d();
                if (zVarD2 != null) {
                    long jB2 = zVarD2.b();
                    float fV2 = va.g.v(p171r0.d.a((int) (jB2 >> 32), (int) (jB2 & 4294967295L)), a10.f());
                    long jC = zVarD2.c();
                    EnumC0047u0 enumC0047u0F = a10.f();
                    p251z9.j.e(enumC0047u0F, "orientation");
                    int iOrdinal2 = enumC0047u0F.ordinal();
                    if (iOrdinal2 == 0) {
                        j = jC & 4294967295L;
                    } else {
                        if (iOrdinal2 != 1) {
                            throw new A6.a();
                        }
                        j = jC >> 32;
                    }
                    f3 = (fV2 + ((int) j)) - 1.0f;
                } else {
                    f3 = 0.0f;
                }
                return Float.valueOf(f3);
            default:
                return this.f3062s.f();
        }
    }
}
