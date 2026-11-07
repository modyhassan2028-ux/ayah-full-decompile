package O;

/* JADX INFO: renamed from: O.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0437e extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0444l f6363r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f6364s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f6365t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0437e(InterfaceC0444l interfaceC0444l, boolean z10, boolean z11) {
        super(1);
        this.f6363r = interfaceC0444l;
        this.f6364s = z10;
        this.f6365t = z11;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        R0.j jVar = (R0.j) obj;
        long jA = this.f6363r.a();
        jVar.e(y.f6432c, new x(this.f6364s ? K.K.f4481s : K.K.f4482t, jA, this.f6365t ? w.f6422r : w.f6424t, (9223372034707292159L & jA) != 9205357640488583168L));
        return p110k9.y.f19095a;
    }
}
