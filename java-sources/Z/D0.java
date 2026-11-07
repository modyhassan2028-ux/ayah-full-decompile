package Z;

/* JADX INFO: loaded from: classes.dex */
public final class D0 extends p093j0.x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10594c;

    public D0(long j, long j10) {
        super(j);
        this.f10594c = j10;
    }

    @Override // p093j0.x
    public final void a(p093j0.x xVar) {
        p251z9.j.c(xVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f10594c = ((D0) xVar).f10594c;
    }

    @Override // p093j0.x
    public final p093j0.x b(long j) {
        return new D0(j, this.f10594c);
    }
}
