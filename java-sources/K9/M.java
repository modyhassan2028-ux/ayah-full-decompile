package K9;

/* JADX INFO: loaded from: classes.dex */
public final class M extends O {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0389g f5327t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Q f5328u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(Q q10, long j, C0389g c0389g) {
        super(j);
        this.f5328u = q10;
        this.f5327t = c0389g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5327t.B(this.f5328u);
    }

    @Override // K9.O
    public final String toString() {
        return super.toString() + this.f5327t;
    }
}
