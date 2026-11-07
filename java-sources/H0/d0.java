package H0;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M.k f3189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public E f3190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f3191c = new c0(this, 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f3192d = new c0(this, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c0 f3193e = new c0(this, 1);

    public d0(M.k kVar) {
        this.f3189a = kVar;
    }

    public final E a() {
        E e10 = this.f3190b;
        if (e10 != null) {
            return e10;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
