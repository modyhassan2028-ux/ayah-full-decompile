package O9;

/* JADX INFO: loaded from: classes.dex */
public final class w implements p150o9.c, q9.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p150o9.c f6564r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p150o9.h f6565s;

    public w(p150o9.c cVar, p150o9.h hVar) {
        this.f6564r = cVar;
        this.f6565s = hVar;
    }

    @Override // q9.d
    public final q9.d getCallerFrame() {
        p150o9.c cVar = this.f6564r;
        if (cVar instanceof q9.d) {
            return (q9.d) cVar;
        }
        return null;
    }

    @Override // p150o9.c
    public final p150o9.h getContext() {
        return this.f6565s;
    }

    @Override // p150o9.c
    public final void resumeWith(Object obj) {
        this.f6564r.resumeWith(obj);
    }
}
