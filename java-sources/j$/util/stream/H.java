package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class H extends I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D f18265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D f18266d;

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f18274a) {
            return new j$.util.B(this.f18275b);
        }
        return null;
    }

    static {
        Z2 z10 = Z2.REFERENCE;
        C1148o c1148o = new C1148o(7);
        C1148o c1148o2 = new C1148o(8);
        j$.util.B b5 = j$.util.B.f18043b;
        f18265c = new D(true, z10, b5, c1148o, c1148o2);
        f18266d = new D(false, z10, b5, new C1148o(7), new C1148o(8));
    }
}
