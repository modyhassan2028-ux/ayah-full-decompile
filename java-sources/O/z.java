package O;

import p223x.C1424m;

/* JADX INFO: loaded from: classes.dex */
public final class z extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final z f6433s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final z f6434t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final z f6435u;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6436r;

    static {
        int i10 = 1;
        f6433s = new z(i10, 0);
        f6434t = new z(i10, 1);
        f6435u = new z(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i10, int i11) {
        super(i10);
        this.f6436r = i11;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f6436r) {
            case 0:
                long j = ((p171r0.c) obj).f21387a;
                return (9223372034707292159L & j) != 9205357640488583168L ? new C1424m(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))) : B.f6273a;
            case 1:
                C1424m c1424m = (C1424m) obj;
                return new p171r0.c((((long) Float.floatToRawIntBits(c1424m.f24037a)) << 32) | (((long) Float.floatToRawIntBits(c1424m.f24038b)) & 4294967295L));
            default:
                return p110k9.y.f19095a;
        }
    }
}
