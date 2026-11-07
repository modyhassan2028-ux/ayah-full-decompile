package p093j0;

import p033d0.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class p extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f18668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18670e;

    public p(long j, c cVar) {
        super(j);
        this.f18668c = cVar;
    }

    @Override // p093j0.x
    public final void a(x xVar) {
        synchronized (s.f18675a) {
            j.c(xVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord>");
            this.f18668c = ((p) xVar).f18668c;
            this.f18669d = ((p) xVar).f18669d;
            this.f18670e = ((p) xVar).f18670e;
        }
    }

    @Override // p093j0.x
    public final x b(long j) {
        return new p(j, this.f18668c);
    }
}
