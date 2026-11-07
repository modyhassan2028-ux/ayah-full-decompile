package W;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O1 implements p180s0.r, p251z9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ F.j f8749r;

    public O1(F.j jVar) {
        this.f8749r = jVar;
    }

    @Override // p180s0.r
    public final long a() {
        return ((p180s0.q) this.f8749r.get()).f21845a;
    }

    @Override // p251z9.f
    public final p110k9.e c() {
        return this.f8749r;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p180s0.r) || !(obj instanceof p251z9.f)) {
            return false;
        }
        return this.f8749r.equals(((p251z9.f) obj).c());
    }

    public final int hashCode() {
        return this.f8749r.hashCode();
    }
}
