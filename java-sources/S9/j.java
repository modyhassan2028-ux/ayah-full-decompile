package S9;

import P9.r;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class j extends r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f7550e;

    public j(long j, j jVar, int i10) {
        super(j, jVar, i10);
        this.f7550e = new AtomicReferenceArray(i.f7549f);
    }

    @Override // P9.r
    public final int f() {
        return i.f7549f;
    }

    @Override // P9.r
    public final void g(int i10, p150o9.h hVar) {
        this.f7550e.set(i10, i.f7548e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f6802c + ", hashCode=" + hashCode() + ']';
    }
}
