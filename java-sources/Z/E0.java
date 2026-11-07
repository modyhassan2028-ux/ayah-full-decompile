package Z;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends p093j0.x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f10595c;

    public E0(long j, Object obj) {
        super(j);
        this.f10595c = obj;
    }

    @Override // p093j0.x
    public final void a(p093j0.x xVar) {
        p251z9.j.c(xVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f10595c = ((E0) xVar).f10595c;
    }

    @Override // p093j0.x
    public final p093j0.x b(long j) {
        return new E0(p093j0.n.k().g(), this.f10595c);
    }
}
