package W;

/* JADX INFO: loaded from: classes.dex */
public final class z2 extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9483r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f9484s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(int i10, int i11) {
        super(0);
        this.f9483r = i10;
        this.f9484s = i11;
    }

    @Override // p241y9.a
    public final Object invoke() {
        return new D2(this.f9483r, this.f9484s, false);
    }
}
