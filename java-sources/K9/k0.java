package K9;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends p150o9.a implements a0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final k0 f5377s = new k0(r.f5392s);

    @Override // K9.a0
    public final CancellationException E() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // K9.a0
    public final J V(boolean z10, boolean z11, E5.c cVar) {
        return l0.f5378r;
    }

    @Override // K9.a0
    public final boolean b() {
        return true;
    }

    @Override // K9.a0
    public final boolean isCancelled() {
        return false;
    }

    @Override // K9.a0
    public final InterfaceC0392j n(h0 h0Var) {
        return l0.f5378r;
    }

    @Override // K9.a0
    public final J s(p241y9.c cVar) {
        return l0.f5378r;
    }

    @Override // K9.a0
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // K9.a0
    public final Object w(q9.c cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // K9.a0
    public final void e(CancellationException cancellationException) {
    }
}
