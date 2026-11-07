package j$.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f18096i;
    public l j;

    public a(l[] lVarArr, int i10, int i11, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i10, 0, i11);
        this.f18096i = concurrentHashMap;
        a();
    }

    public final boolean hasNext() {
        return this.f18114b != null;
    }

    public final boolean hasMoreElements() {
        return this.f18114b != null;
    }

    public final void remove() {
        l lVar = this.j;
        if (lVar == null) {
            throw new IllegalStateException();
        }
        this.j = null;
        this.f18096i.g(lVar.f18106b, null, null);
    }
}
