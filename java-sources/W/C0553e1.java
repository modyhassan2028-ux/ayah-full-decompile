package W;

/* JADX INFO: renamed from: W.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0553e1 extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9040r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p063g1.c f9041s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0553e1(p063g1.c cVar, int i10) {
        super(1);
        this.f9040r = i10;
        this.f9041s = cVar;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f9040r) {
            case 0:
                ((Number) obj).floatValue();
                return Float.valueOf(this.f9041s.w(56));
            default:
                ((Number) obj).floatValue();
                return Float.valueOf(this.f9041s.w(56));
        }
    }
}
