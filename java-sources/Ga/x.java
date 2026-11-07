package Ga;

/* JADX INFO: loaded from: classes.dex */
public final class x extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3101r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ F.A f3102s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(F.A a9, int i10) {
        super(0);
        this.f3101r = i10;
        this.f3102s = a9;
    }

    @Override // p241y9.a
    public final Object invoke() {
        long jG;
        switch (this.f3101r) {
            case 0:
                F.r rVarG = this.f3102s.g();
                int iOrdinal = rVarG.f2107o.ordinal();
                if (iOrdinal == 0) {
                    jG = rVarG.g() & 4294967295L;
                } else {
                    if (iOrdinal != 1) {
                        throw new A6.a();
                    }
                    jG = rVarG.g() >> 32;
                }
                return Float.valueOf(((int) jG) * 0.05f);
            default:
                return this.f3102s.g().f2107o;
        }
    }
}
