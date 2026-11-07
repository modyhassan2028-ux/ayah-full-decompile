package J0;

/* JADX INFO: loaded from: classes.dex */
public final class T extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3982r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f3983s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3984t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(Object obj, long j, int i10) {
        super(0);
        this.f3982r = i10;
        this.f3984t = obj;
        this.f3983s = j;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f3982r) {
            case 0:
                Q qC0 = ((V) this.f3984t).f4004w.a().C0();
                p251z9.j.b(qC0);
                qC0.a(this.f3983s);
                return p110k9.y.f19095a;
            default:
                return ((p180s0.H) ((p180s0.F) this.f3984t)).x(this.f3983s);
        }
    }
}
