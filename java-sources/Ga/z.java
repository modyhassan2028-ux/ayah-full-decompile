package Ga;

import A.EnumC0047u0;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F.s f3106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EnumC0047u0 f3107b;

    public z(F.s sVar, EnumC0047u0 enumC0047u0) {
        this.f3106a = sVar;
        this.f3107b = enumC0047u0;
    }

    public final int a() {
        return this.f3106a.f2110a;
    }

    public final long b() {
        return va.g.r(this.f3107b, this.f3106a.f2120m);
    }

    public final long c() {
        int i10 = this.f3106a.f2121n;
        EnumC0047u0 enumC0047u0 = this.f3107b;
        p251z9.j.e(enumC0047u0, "orientation");
        int iOrdinal = enumC0047u0.ordinal();
        if (iOrdinal == 0) {
            return (((long) i10) & 4294967295L) | (((long) 0) << 32);
        }
        if (iOrdinal == 1) {
            return (((long) i10) << 32) | (4294967295L & ((long) 0));
        }
        throw new A6.a();
    }
}
