package K0;

/* JADX INFO: loaded from: classes.dex */
public final class r extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5152r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p162q0.d f5153s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(p162q0.d dVar, int i10) {
        super(1);
        this.f5152r = i10;
        this.f5153s = dVar;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f5152r) {
            case 0:
                break;
        }
        return Boolean.valueOf(((p162q0.t) obj).z0(this.f5153s.f21191a));
    }
}
