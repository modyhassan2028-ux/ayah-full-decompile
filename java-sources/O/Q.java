package O;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6333r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p242z.j f6334s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ N f6335t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(p242z.j jVar, N n6, int i10) {
        super(0);
        this.f6333r = i10;
        this.f6334s = jVar;
        this.f6335t = n6;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [y9.a, z9.k] */
    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f6333r) {
            case 0:
                this.f6335t.d();
                p171r0.h.c(this.f6334s);
                break;
            case 1:
                this.f6335t.b(false);
                p171r0.h.c(this.f6334s);
                break;
            case 2:
                this.f6335t.m();
                p171r0.h.c(this.f6334s);
                break;
            case 3:
                this.f6335t.n();
                p171r0.h.c(this.f6334s);
                break;
            default:
                ?? r10 = this.f6335t.g;
                if (r10 != 0) {
                    r10.invoke();
                }
                p171r0.h.c(this.f6334s);
                break;
        }
        return p110k9.y.f19095a;
    }
}
