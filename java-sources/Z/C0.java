package Z;

/* JADX INFO: loaded from: classes.dex */
public final class C0 extends p093j0.x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10591c;

    public C0(long j, int i10) {
        super(j);
        this.f10591c = i10;
    }

    @Override // p093j0.x
    public final void a(p093j0.x xVar) {
        p251z9.j.c(xVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f10591c = ((C0) xVar).f10591c;
    }

    @Override // p093j0.x
    public final p093j0.x b(long j) {
        return new C0(j, this.f10591c);
    }
}
