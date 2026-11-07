package Z;

/* JADX INFO: loaded from: classes.dex */
public final class B0 extends p093j0.x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f10587c;

    public B0(long j, float f3) {
        super(j);
        this.f10587c = f3;
    }

    @Override // p093j0.x
    public final void a(p093j0.x xVar) {
        p251z9.j.c(xVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f10587c = ((B0) xVar).f10587c;
    }

    @Override // p093j0.x
    public final p093j0.x b(long j) {
        return new B0(j, this.f10587c);
    }
}
