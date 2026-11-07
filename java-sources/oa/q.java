package oa;

/* JADX INFO: loaded from: classes.dex */
public final class q implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f20472a;

    public q(n nVar) {
        this.f20472a = nVar;
    }

    @Override // oa.s
    public final s a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // oa.s
    public final r b() {
        throw new IllegalStateException("already connected");
    }

    @Override // oa.s
    public final n c() {
        return this.f20472a;
    }

    @Override // oa.s, pa.c
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // oa.s
    public final boolean d() {
        return true;
    }

    @Override // oa.s
    public final r f() {
        throw new IllegalStateException("already connected");
    }
}
