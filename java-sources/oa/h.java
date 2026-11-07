package oa;

/* JADX INFO: loaded from: classes.dex */
public final class h implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f20415a;

    public h(Throwable th) {
        this.f20415a = new r(this, th, 2);
    }

    @Override // oa.s
    public final s a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // oa.s
    public final r b() {
        return this.f20415a;
    }

    @Override // oa.s
    public final n c() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // oa.s, pa.c
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // oa.s
    public final boolean d() {
        return false;
    }

    @Override // oa.s
    public final r f() {
        return this.f20415a;
    }
}
