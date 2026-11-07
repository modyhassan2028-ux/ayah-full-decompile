package O;

/* JADX INFO: renamed from: O.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0433a extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6344r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0444l f6345s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0433a(InterfaceC0444l interfaceC0444l, int i10) {
        super(0);
        this.f6344r = i10;
        this.f6345s = interfaceC0444l;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f6344r) {
            case 0:
                return Boolean.valueOf((this.f6345s.a() & 9223372034707292159L) != 9205357640488583168L);
            default:
                return Boolean.valueOf((this.f6345s.a() & 9223372034707292159L) != 9205357640488583168L);
        }
    }
}
